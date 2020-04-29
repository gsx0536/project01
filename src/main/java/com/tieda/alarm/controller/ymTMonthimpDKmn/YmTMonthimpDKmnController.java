package com.tieda.alarm.controller.ymTMonthimpDKmn;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tieda.alarm.util.ResponseData;
import com.tieda.alarm.entity.ymTMonthimpDKmn.YmTMonthimpDKmn;
import com.tieda.alarm.service.ymTMonthimpDKmn.IYmTMonthimpDKmnService;
import com.tieda.alarm.util.IdWorker;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 昆明南月重点工作子表 前端控制器
 * </p>
 *
 * @author
 * @since 2019-06-02
 */
@RestController
@RequestMapping("/ymTMonthimpDKmn")
public class YmTMonthimpDKmnController {

    @Autowired
    IYmTMonthimpDKmnService iYmTMonthimpDKmnService;
    @Autowired
    IdWorker idWorker;
    /**
     * 根据 id 查询对象
     *
     * @param id 对象 id
     * @return
     */
    @GetMapping("/query/{id}")
    public ResponseData getYmTMonthimpDKmnById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            YmTMonthimpDKmn obj = iYmTMonthimpDKmnService.getYmTMonthimpDKmnById(id);
            responseData = ResponseData.okData(obj);   // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    @GetMapping("/getWorkType")
    public ResponseData getWorkType()
    {
        ResponseData responseData = null;
        try {
            List obj =iYmTMonthimpDKmnService.getWorkType();
            responseData = ResponseData.okData(obj);   // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


    @GetMapping("/getWorkProject")
    public ResponseData getWorkProject()
    {
        ResponseData responseData = null;
        try {
            List  obj = iYmTMonthimpDKmnService.getWorkProject();
            responseData = ResponseData.okData(obj);   // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 查询对象列表信息
     *
     * @param params 请求参数
     * @return
     */
    @GetMapping("/query")
    public ResponseData getYmTMonthimpDKmnList(@RequestParam Map<String, Object> params) {
        List<YmTMonthimpDKmn> objList = null;
        ResponseData responseData = null;
        try {
            Long count = 0L;
            Object page = params.get("page");       // 页码
            Object limit = params.get("limit");     // 每页显示数量
            if (page == null && limit == null) {    // 查询所有数据
                objList = iYmTMonthimpDKmnService.getYmTMonthimpDKmnList(params);
            } else {            // 查询分页列表数据
                params.remove("page");
                params.remove("limit");
                int pageNo = Integer.parseInt(page.toString());
                int pageSize = Integer.parseInt(limit.toString());
                Page pageInfo = PageHelper.startPage(pageNo, pageSize);        // 使用PageHelper进行分页
                objList = iYmTMonthimpDKmnService.getYmTMonthimpDKmnList(params);
                count = pageInfo.getTotal();
            }

            responseData = ResponseData.okData(objList, count);  // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();                    // 处理失败
        }
        return responseData;
    }

    /**
     * 添加对象实体
     *
     * @param obj 对象实体
     * @return
     */
    @PostMapping("/add")
    public ResponseData addYmTMonthimpDKmn(@RequestBody YmTMonthimpDKmn obj) {

        ResponseData responseData = null;
        try {
            obj.setnId(String.valueOf(idWorker.nextId()));
            iYmTMonthimpDKmnService.checkNorder(obj);
            iYmTMonthimpDKmnService.addYmTMonthimpDKmn(obj);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;

    }

    /**
     * 批量添加对象实体
     *
     * @param list 对象实体集合
     * @return
     */
    @PostMapping("/addBatch")
    public ResponseData addBatchYmTMonthimpDKmn(@RequestBody List<YmTMonthimpDKmn> list) {
        ResponseData responseData = null;
        try {
            iYmTMonthimpDKmnService.addBatchYmTMonthimpDKmn(list);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


    /**
     * 根据ID ,nOrder 更新排序
     *
     * @param id 对象ID
     * @return
     */
    @PostMapping("/changeOrder")
    @ResponseBody
    public ResponseData deleteYmTMonthimpDKmnById(@RequestBody Map paramMap) {
        ResponseData responseData = null;
        String nMid= (String) paramMap.get("nMid"),nId= (String) paramMap.get("nId"),nOrder= (String) paramMap.get("nOrder"),nOrderTarget = (String) paramMap.get("nOrderTarget");
        try {
            Map<String,Object> params = new HashMap<>();
            params.put("nOrderTarget",nOrderTarget);
            params.put("nOrder",nOrder);
            params.put("nMid",nMid);
            iYmTMonthimpDKmnService.updatenNorderByNorder(params);
            params.clear();
            params.put("nOrderTarget",nOrderTarget);
            params.put("nId",nId);
            iYmTMonthimpDKmnService.updatenNorderByNid(params);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 更新对象实体
     *
     * @param obj 对象实体
     * @return
     */
    @PostMapping("/update")
    public ResponseData updateYmTMonthimpDKmn(@RequestBody YmTMonthimpDKmn obj) {
        ResponseData responseData = null;
        try {
            iYmTMonthimpDKmnService.updateYmTMonthimpDKmn(obj);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 批量更新对象实体
     *
     * @param list 对象实体集合
     * @return
     */
    @PostMapping("/updateBatch")
    public ResponseData updateBatchYmTMonthimpDKmn(@RequestBody List<YmTMonthimpDKmn> list) {
        ResponseData responseData = null;
        try {
            iYmTMonthimpDKmnService.updateBatchYmTMonthimpDKmn(list);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 根据ID删除对象实体
     *
     * @param id 对象ID
     * @return
     */
    @PostMapping("/delete/{id}")
    public ResponseData deleteYmTMonthimpDKmnById(@PathVariable("id") Long id) {
        ResponseData responseData = null;
        try {
            iYmTMonthimpDKmnService.checknorderfordel(iYmTMonthimpDKmnService.getYmTMonthimpDKmnById(id));
            iYmTMonthimpDKmnService.deleteYmTMonthimpDKmnById(id);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }

    /**
     * 批量删除对象实体
     *
     * @param ids 对象实体ID集合
     * @return
     */
    @PostMapping("/deleteBatch")
    public ResponseData deleteBatchYmTMonthimpDKmn(@RequestBody List<Long> ids) {
        ResponseData responseData = null;
        try {
            iYmTMonthimpDKmnService.deleteBatchYmTMonthimpDKmn(ids);
            responseData = ResponseData.ok();       // 处理成功
        } catch (Exception e) {
            e.printStackTrace();
            responseData = ResponseData.error();    // 处理失败
        }
        return responseData;
    }


    //上传明细
    @PostMapping("/uploadDetail")
    public ResponseData uploadDetail(MultipartFile file,String mid) {
        String filename=file.getOriginalFilename();
        ResponseData responseData = null;
        Workbook wb = null;
        try{
            if(filename.endsWith(".xlsx")) {
                wb = new XSSFWorkbook(file.getInputStream());
            }else if(filename.endsWith(".xls")){
                wb = new HSSFWorkbook(file.getInputStream());
            }else{
                responseData = ResponseData.error();
                return responseData;
            }
            Sheet sheet = wb.getSheetAt(0);
            Row row = null;
            List list =new ArrayList();
            Map orgMap=new HashMap();
            orgMap.put("nlvl","50");
            List<Map> ksList=iYmTMonthimpDKmnService.getAllOrgByLvl(orgMap);
            orgMap.put("nlvl","30");
            List<Map> cjList=iYmTMonthimpDKmnService.getAllOrgByLvl(orgMap);
            orgMap.put("name","信号");
            List<Map> xhList=iYmTMonthimpDKmnService.getAllOrgByLvl(orgMap);
            YmTMonthimpDKmn ymTMonthimpDKmn;
            for (int j = 1; j < sheet.getPhysicalNumberOfRows(); j++) {
                row = sheet.getRow(j);
                if (row == null || row.getFirstCellNum() == j) {
                    continue;
                }
                ymTMonthimpDKmn=new YmTMonthimpDKmn();
                ymTMonthimpDKmn.setnId(String.valueOf(idWorker.nextId()));
                ymTMonthimpDKmn.setnMid(mid);
                int col=1;
                ymTMonthimpDKmn.setVcWorktype(getCellValue(row.getCell(col++)));
                ymTMonthimpDKmn.setVcProject(getCellValue(row.getCell(col++)));
                ymTMonthimpDKmn.setVcWorkdetail(getCellValue(row.getCell(col++)));
                String dept=getCellValue(row.getCell(col++));
                String deptid="";
                String deps[]=dept.split(";");
                String ks=deps[0];
                if("各科室".equals(ks)){
                    for(Map ksMap:ksList){
                        String id=(String)ksMap.get("VC_ORG$ID");
                        deptid+=id+",";
                    }
                }else if(!"".equals(ks)){
                    String kss[]=deps[0].split(",");
                    for(int i=0;i<kss.length;i++){
                        for(Map ksMap:ksList){
                            String id=(String)ksMap.get("VC_ORG$ID");
                            String name=(String)ksMap.get("VC_NAME");
                            if(name.equals(kss[i])){
                                deptid+=id+",";
                            }
                        }
                    }
                }
                if(!deptid.equals("")){
                    deptid=deptid.substring(0,deptid.length()-1);
                }
                deptid+=";";
                if(deps.length>1){
                    String cj=deps[1];
                    if("各车间".equals(cj)){
                        for(Map cjMap:cjList){
                            String id=(String)cjMap.get("VC_ORG$ID");
                            deptid+=id+",";
                        }
                    }else if("各现场车间".equals(cj)){
                        for(Map xhMap:xhList){
                            String id=(String)xhMap.get("VC_ORG$ID");
                            deptid+=id+",";
                        }
                    }else if(!"".equals(cj)){
                        String cjs[]=deps[1].split(",");
                        for(int i=0;i<cjs.length;i++){
                            for(Map cjMap:cjList){
                                String id=(String)cjMap.get("VC_ORG$ID");
                                String name=(String)cjMap.get("VC_NAME");
                                if(name.equals(cjs[i])){
                                    deptid+=id+",";
                                }
                            }
                        }
                    }
                    if(!deptid.equals("")){
                        deptid=deptid.substring(0,deptid.length()-1);
                    }
                }

                ymTMonthimpDKmn.setVcNoticedepId(deptid);
                ymTMonthimpDKmn.setVcNoticedep(dept);
                ymTMonthimpDKmn.setnFinish(getCellValue(row.getCell(col++)));
                ymTMonthimpDKmn.setVcCharger(getCellValue(row.getCell(col++)));
                ymTMonthimpDKmn.setVcStatus("0");
                ymTMonthimpDKmn.setnOrder(String.valueOf(j));

                Calendar ca = Calendar.getInstance();
                ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
                ymTMonthimpDKmn.setDtDeadline(ca.getTime());
                list.add(ymTMonthimpDKmn);
            }
            iYmTMonthimpDKmnService.addBatchYmTMonthimpDKmn(list);
            responseData = ResponseData.ok();
        }catch (Exception e){
            responseData = ResponseData.error();
            e.printStackTrace();
        }
        return responseData;
    }


    private String getCellValue(Cell cell){
        if(cell!=null){
            cell.setCellType(CellType.STRING);
            return cell.getStringCellValue();
        }
        return "";
    }



}
