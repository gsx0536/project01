package com.tieda.alarm.util;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/***
 * wordExpress word导出插件
 */
public class ExcelExpress {

    /**
     * 数据
     */
    private Map<String,Object> dataMap = new HashMap<String,Object>();
    /**
     * 字符编码
     */
    private String encoder;
    /***
     *
     */
    private Configuration configuration = null;

    /**
     * 存储模板 ftl
     */
    private Template template = null;

    /**
     * 根据编码得到wordExpress2
     * @param encoder
     */
    public ExcelExpress(String encoder){
        configuration = new Configuration();
        configuration.setDefaultEncoding(encoder);
        this.encoder = encoder;
    }

    public ExcelExpress createWord(String template){
        //系统路径
        configuration.setClassForTemplateLoading(ExcelExpress.class, "/static/template/");
        try {
            this.template = configuration.getTemplate(template);
            this.template.setEncoding(this.encoder);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ExcelExpress setData(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
        return this;
    }

    public ExcelExpress write(HttpServletResponse response, String fileName){
        response.resetBuffer();
        response.setContentType("application/msxls; charset=utf-8");
        response.setHeader("Content-Disposition", "attachment; filename=" + fileName +".xls");
        try {
            template.process(dataMap, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    /**
     * 转换下文件名，转换为
     * @param fileName
     * @return
     */
    public static String formatFileName(String fileName){
        String time = "" + new Date().getTime();
        try {
            return new String((fileName + time).getBytes("GBK"),"ISO8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return time;
        }
    }
}
