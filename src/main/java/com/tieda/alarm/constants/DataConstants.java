package com.tieda.alarm.constants;

public class DataConstants {


    public  static void main(String a[]){
        System.out.println(DataConstants.WeekPlanStatus.getValue("1").getName());
    }

    // 技术科ORGID
    public static final String JISHUKEID = "KMBUR_KMNSEG_ORG_38";

    // 行政领导
    public static final String XINGZHENG = "KMBUR_KMNSEG_ORG_31";

    // 职务科长
    public static final String ZHIWU_KEZHANG = "KMBUR_KMNSEG_DIC_8";

    // 昆明南serverid
    public static final String VC_SERVER = "KMBUR_KMNSEG";




    public enum WeekPlanStatus {
        edit("0", "编辑"), subimt("1", "提交"),workshopApprove("2","车间批准"),workshopReject("3","车间驳回")
        ,duanApprove("4","段批准"),duanReject("5","段驳回"),techApprove("6","技术科批准"),techReject("7","技术科驳回");

        private String value;

        private String name;

        private WeekPlanStatus(String value, String name) {
            this.value = value;
            this.name = name;
        }

        public static WeekPlanStatus getValue(String step) {
            if (edit.value.equals(step) ) {
                return edit;
            } else if (subimt.value.equals(step)) {
                return subimt;
            }else if (workshopApprove.value.equals(step)) {
                return workshopApprove;
            }else if (workshopReject.value.equals(step)) {
                return workshopReject;
            }else if (duanApprove.value.equals(step)) {
                return duanApprove;
            }else if (duanReject.value.equals(step)) {
                return duanReject;
            }else if (techApprove.value.equals(step)) {
                return techApprove;
            }else if (techReject.value.equals(step)) {
                return techReject;
            }

            return null;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

}
