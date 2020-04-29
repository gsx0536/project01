package com.tieda.alarm.util;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 代码自动生成器
 * 建表规则，模块简写+"-"+功能简写 作为表名，只包含纯英文和"_",避免出现特殊字符
 * 字段类型+"-"+字段含义简写 作为字段名，只包含纯英文和"_",避免出现特殊字符，字段含义尽量以英文为主
 *  字段含义+"-"+"显示类型"+"-"+属性作为字段说明(comments), 字段含义用于生成前端列表表头和录入表单，显示类型用于控制是否在列表表头中显示以及在录入表单中的控件类型
 *  hidden表示隐藏，不在列表表头中显示，其余类型均按顺序显示在列表中，固定宽度100px，生成后手动调整
 *  text表示文本框，对应录入表单的input type="text"
 *  select 表示下拉选择框 对应录入表单的 select，需要修改ts文件中的接口方案 ，
 *  date 表示日期选择框 ---暂未启用
 *  autofinish 表示自动提示文本框  --暂未启用
 */
public class CodeGeneratorUtil {

    // 数据库配置信息
    private static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
    private static final String USERNAME = "csmiskmn";
    private static final String PASSWORD = "csmiskmn";
    //private static final String URL = "jdbc:oracle:thin:@192.168.31.88:1521:orcl";
    private static final String URL = "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST = (ADDRESS = (PROTOCOL = TCP)(HOST = 10.18.188.110)(PORT = 1521)) (ADDRESS = (PROTOCOL = TCP)(HOST = 10.18.188.111)(PORT = 1521))(LOAD_BALANCE = on))(CONNECT_DATA = (SERVICE_NAME = csmis)(failover_mode=(type=select)(method=basice))))";
    // 路径信息
    private static final String AUTHOR = "";
//    private static final String PROJECT_PATH = "/Users/zhangpeter/WorkSpace/my_project";    // 项目所在路径
    private static final String PROJECT_PATH = "D:\\mvnProjects\\my_project\\";    // 项目所在路径
    private static final String PROJECT_PACKAGE_NAME = "com.tieda.alarm";   // 项目下对应的包名

    // html 输出路径
    private static final String HTML_OUTPUT_PATH = PROJECT_PATH + File.separator +"views";
    // js 输出路径
    //private static final String JS_OUTPUT_PATH = "G:\\java\\ideaWorkspace\\hicrm\\hicrm-crm-web\\src\\main\\webapp\\hicrm_web\\layuiadmin";

    private static final boolean COLUMNS_LAYOUT = true;
    private static final boolean ROWS_LAYOUT = false;


    public static void main(String[] args) {

        String tableName = "pro_threedefense";     // 需要生成的表
//        String tableName = "CHECK_RACK";     // 需要生成的表
//        String tableName = "WORKDOOR";     // 需要生成的表
        String packageAlias = underLineToCamel(tableName);
        generateByTables(PROJECT_PATH, PROJECT_PACKAGE_NAME, packageAlias, tableName);
    }

    public static void generateByTables(String outputPath, String packageName, String packageAlias, String tableName) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
                // 全局配置
                new GlobalConfig()
                        .setOutputDir(outputPath + "/src/main/java" )
//                        .setOutputDir(outputPath)
                        .setFileOverride(true)
                        .setActiveRecord(false)
                        .setEnableCache(false)
                        .setBaseResultMap(true)
                        .setBaseColumnList(false)
                        .setAuthor(AUTHOR)
                        // 自定义文件命名，注意 %s为占位符，会自动填充表实体属性
                        .setControllerName("%sController" )
                        .setServiceImplName("%sServiceImpl" )
                        .setServiceName("I%sService" )
                        .setMapperName("%sMapper" )

        ).setDataSource(
                // 数据源配置
                new DataSourceConfig()
                        .setDbType(DbType.ORACLE)
                        .setDriverName(DRIVER_NAME)
                        .setUsername(USERNAME)
                        .setPassword(PASSWORD)
                        .setUrl(URL)

        ).setStrategy(
                // 策略配置
                new StrategyConfig()
                        .setNaming(NamingStrategy.underline_to_camel)   // 表名生成策略
                        .setInclude(tableName)          // 需要生成的表
                        .setRestControllerStyle(true)   // Controller使用Rest风格

        ).setPackageInfo(
                // 包配置
                new PackageConfig()
                        .setParent(packageName)                      // 所在包路径
                        .setController("controller." + packageAlias)    // 这里是控制器包名
                        .setEntity("entity." + packageAlias)            // 这里是实体类包名
                        .setMapper("mapper." + packageAlias)            // 这里是Mapper接口包名
                        .setService("service." + packageAlias)          // 这是服务类包名
                        .setServiceImpl("service." + packageAlias + ".impl" )      // 这是服务控制类包名
        );

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
//                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                map.put("packageName", PROJECT_PACKAGE_NAME);

                if (ROWS_LAYOUT) {  // html的新增、修改页面字段显示采用水平布局
                    map.put("layout", "rows" );
                }

                if (COLUMNS_LAYOUT) {       // html的新增、修改页面字段显示采用垂直布局
                    map.put("layout", "columns" );
                }

                this.setMap(map);
            }
        };


        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();

        // 生成mapper文件
        focList.add(new FileOutConfig("/templates/mapper.xml.vm" ) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                String tableName = tableInfo.getName();
                // 自定义输入文件名称
                return PROJECT_PATH + "/src/main/resources/mapper/" + packageAlias + "/" + packageAlias + "Mapper.xml";
            }

        });

        /*focList.add(new FileOutConfig("/ag_templates/query.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                String tableName = tableInfo.getName();
                // 自定义输入文件名称
                return HTML_OUTPUT_PATH + "/" + packageAlias + "/" + packageAlias + ".html";
            }

        });

        focList.add(new FileOutConfig("/ag_templates/query.component.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                String tableName = tableInfo.getName();
                // 自定义输入文件名称
                return HTML_OUTPUT_PATH + "/" + packageAlias + "/" + packageAlias + ".component.ts";
            }

        });*/


        focList.add(new FileOutConfig(File.separator +"ag_templates"+File.separator +"test.component.vm" ) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                String tableName = tableInfo.getName();
                // 自定义输入文件名称
                return HTML_OUTPUT_PATH + File.separator + packageAlias + File.separator + packageAlias + ".component.ts";
            }

        });

        focList.add(new FileOutConfig(File.separator +"ag_templates"+File.separator +"test.html.vm" ) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                String tableName = tableInfo.getName();
                return HTML_OUTPUT_PATH + File.separator + packageAlias + File.separator + packageAlias + ".component.html";
            }

        });

//        focList.add(new FileOutConfig("/crm_templates/edit_html.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                String tableName = tableInfo.getName();
//                return HTML_OUTPUT_PATH + "/" + packageAlias + "/" + packageAlias + "_edit.html";
//            }
//
//        });
//
//        focList.add(new FileOutConfig("/crm_templates/detail_html.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                String tableName = tableInfo.getName();
//                return HTML_OUTPUT_PATH + "/" + packageAlias + "/" + packageAlias + "_detail.html";
//            }
//
//        });
//
//        // 生成 js 文件
//        focList.add(new FileOutConfig("/crm_templates/query_js.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                String tableName = tableInfo.getName();
//                return JS_OUTPUT_PATH + "/business/" + packageAlias + "/" + packageAlias + "_query.js";
//            }
//
//        });
//
//        focList.add(new FileOutConfig("/crm_templates/add_js.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                String tableName = tableInfo.getName();
//                return JS_OUTPUT_PATH + "/business/" + packageAlias + "/" + packageAlias + "_add.js";
//            }
//
//        });
//
//        focList.add(new FileOutConfig("/crm_templates/edit_js.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                String tableName = tableInfo.getName();
//                return JS_OUTPUT_PATH + "/business/" + packageAlias + "/" + packageAlias + "_edit.js";
//            }
//
//        });
//
//        focList.add(new FileOutConfig("/crm_templates/detail_js.vm") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                String tableName = tableInfo.getName();
//                return JS_OUTPUT_PATH + "/business/" + packageAlias + "/" + packageAlias + "_detail.js";
//            }
//
//        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 自定义模板配置
        TemplateConfig tc = new TemplateConfig();


        /*tc.setXml(null);
        tc.setController(null);             // 禁止生成 controller文件
       tc.setEntity(null);                 // 禁止生成 entity 文件
        tc.setMapper(null);                 // 禁止生成 mapper 接口文件
        tc.setService(null);                // 禁止生成 service 接口文件
       tc.setServiceImpl(null);   */         // 禁止生成 serviceImpl文件
        mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();

        System.out.println("***********文件生成完成**************" );


        // 删除 resources 目录下的文件
        /*String resourcePath = outputPath + "/resources";
        File resourceDir = new File(resourcePath);
        File[] files = resourceDir.listFiles();
        for (int i = 0; i < files.length; i++) {
            files[i].delete();
        }*/

    }

    /**
     * 下划线转驼峰
     *
     * @param param
     * @return
     */
    private static String underLineToCamel(String param) {
        StringBuilder result = new StringBuilder();
        String[] words = param.split("_" );
        for (String s : words) {
            if (result.length() == 0) {
                result.append(s.toLowerCase());
            } else {
                result.append(s.substring(0, 1).toUpperCase());
                result.append(s.substring(1).toLowerCase());
            }
        }
        return result.toString().replace("$","");
    }


}
