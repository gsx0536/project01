package com.tieda.alarm.util.excel;

import com.tieda.alarm.util.excel.annotation.ExcelField;
import org.apache.commons.lang.time.DateUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.*;

/**
 * 导出Excel文档工具类（附）
 */
public class ExcelUtil {

    private static Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    /**
     * 创建excel文档，
     *
     * @param objList 数据集合
     * @param cls     实体类
     */
    public static Workbook createWorkBook(List<?> objList, Class<?> cls) {
        //
        List<Map<String, Object>> list = ExcelUtil.createExcelRecord(objList);
        //设置属性名称以及属性值
        Map<String, String> map = ExcelFields(cls, 1);
        String[] keys = new String[map.size()];
        String[] columnNames = new String[map.size()];
        int k = 0;
        for (Map.Entry entry : map.entrySet()) {
            keys[k] = entry.getKey().toString();
            columnNames[k] = entry.getValue().toString();
            k++;
        }
        // 创建excel工作簿
        Workbook wb = (Workbook) new HSSFWorkbook();
        // 创建第一个sheet（页），并命名
        Sheet sheet = wb.createSheet(list.get(0).get("sheetName").toString());
        // 手动设置列宽。第一个参数表示要为第几列设；，第二个参数表示列的宽度，n为列高的像素数。
        for (int i = 0; i < keys.length; i++) {
            sheet.setColumnWidth((short) i, (short) (35.7 * 150));
        }

        // 创建第一行
        Row row = sheet.createRow((short) 0);

        // 创建两种单元格格式
        CellStyle cs = wb.createCellStyle();
        CellStyle cs2 = wb.createCellStyle();

        // 创建两种字体
        Font f = wb.createFont();
        Font f2 = wb.createFont();

        // 创建第一种字体样式（用于列名）
        f.setFontHeightInPoints((short) 10);
        f.setColor(IndexedColors.BLACK.getIndex());
        f.setBold(true);

        // 创建第二种字体样式（用于值）
        f2.setFontHeightInPoints((short) 10);
        f2.setColor(IndexedColors.BLACK.getIndex());

//        Font f3=wb.createFont();
//        f3.setFontHeightInPoints((short) 10);
//        f3.setColor(IndexedColors.RED.getIndex());

        // 设置第一种单元格的样式（用于列名）
        cs.setFont(f);
        cs.setBorderLeft(BorderStyle.THIN);
        cs.setBorderRight(BorderStyle.THIN);
        cs.setBorderTop(BorderStyle.THIN);
        cs.setBorderBottom(BorderStyle.THIN);
        cs.setAlignment(HorizontalAlignment.CENTER);

        // 设置第二种单元格的样式（用于值）
        cs2.setFont(f2);
        cs2.setBorderLeft(BorderStyle.THIN);
        cs2.setBorderRight(BorderStyle.THIN);
        cs2.setBorderTop(BorderStyle.THIN);
        cs2.setBorderBottom(BorderStyle.THIN);
        cs2.setWrapText(true);
        cs2.setAlignment(HorizontalAlignment.CENTER);
        //设置列名
        for (int i = 0; i < columnNames.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellValue(columnNames[i]);
            cell.setCellStyle(cs);
        }
        //设置每行每列的值
        for (short i = 1; i < list.size(); i++) {
            // Row 行,Cell 方格 , Row 和 Cell 都是从0开始计数的
            // 创建一行，在页sheet上
            Row row1 = sheet.createRow((short) i);
            // 在row行上创建一个方格
            for (short j = 0; j < keys.length; j++) {
                Cell cell = row1.createCell(j);
                cell.setCellValue(list.get(i).get(keys[j]) == null ? " " : list.get(i).get(keys[j]).toString());
                cell.setCellStyle(cs2);
            }
        }
        return wb;
    }

    /***
     * 根据字段名称与字段值
     * 配置Excel字段
     *
     * @param projects 实体对象集合
     * @return
     */
    private static List<Map<String, Object>> createExcelRecord(List<?> projects) {
        List<Map<String, Object>> listmap = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sheetName", "sheet1");
        listmap.add(map);
        Object project = null;
        try {
            for (int j = 0; j < projects.size(); j++) {
                project = projects.get(j);
                Map<String, Object> mapValue = new HashMap<String, Object>();
                String[] filedNames = getFiledNames(project);
                for (int i = 0; i < filedNames.length; i++) {
                    String filedName = filedNames[i];
                    Object filedValueByname = getFieldValueByName(filedName, project);
                    if (filedValueByname != null) {
                        String filedValue = filedValueByname.toString();
                        mapValue.put(filedName, filedValue);
                    }
                }
                listmap.add(mapValue);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listmap;
    }

    /****
     * 获取实体对象全部属性名数组
     *
     * @param o 实体对象
     * @return String []
     */
    private static String[] getFiledNames(Object o) {
        Field[] fields = o.getClass().getDeclaredFields();
        String[] fieldNames = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fieldNames[i] = fields[i].getName();
        }
        return fieldNames;
    }

    /***
     * 根据属性名获取属性值
     *
     * @param fieldName 属性名称
     * @param o         实体对象
     * @return Object
     */
    private static Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[]{});
            Object value = method.invoke(o, new Object[]{});
            if (value == null)
                value = "";
            return value;
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e) {
            logger.debug("getFieldValueByName - error");
            return null;
        }
    }

    /**
     * 获取注解在属性名上的excelfield
     */
    private static Map<String, String> ExcelFields(Class<?> cls, int type) {
        Field[] fs = cls.getDeclaredFields();
        Map<String, String> map = new LinkedHashMap<String, String>();
        for (Field f : fs) {
            ExcelField ef = f.getAnnotation(ExcelField.class);
            if (ef != null && (ef.type() == type || ef.type() == 0)) {
                map.put(f.getName(), ef.title());
            }
        }
        return map;
    }

    /***
     * 导出工具
     * @param excelTitle 导出标题
     * @param dataList   数据集合
     * @param obj        实体对象
     * @param response   响应
     * @throws IOException
     */
    public static void dataExcelTools(String excelTitle, List dataList, Class obj, HttpServletResponse response) throws IOException {
        String fileName = excelTitle;
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            ExcelUtil.createWorkBook(dataList, obj).write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(excelTitle + ".xls", "utf-8"));
        ServletOutputStream out = response.getOutputStream();
        BufferedInputStream biis = null;
        BufferedOutputStream boos = null;
        try {
            biis = new BufferedInputStream(is);
            boos = new BufferedOutputStream(out);
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = biis.read(buff, 0, buff.length))) {
                boos.write(buff, 0, bytesRead);
            }
        } catch (final IOException e) {
            throw e;
        } finally {
            if (biis != null)
                biis.close();
            if (boos != null)
                boos.close();
        }
    }

}