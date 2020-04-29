package com.tieda.alarm.constants;

import com.github.abel533.echarts.Option;
import com.tieda.alarm.echarts.BarImpl;
import com.tieda.alarm.echarts.LineImpl;
import com.tieda.alarm.echarts.PieImpl;

import java.util.List;
import java.util.Map;

public class EchartsConstants {

    public static Option create(String type,Map dataMap){
        Option option=null;
        if(type.equals("pie")){
            option=new PieImpl().simple(dataMap);
        }else if(type.equals("line")){
            option=new LineImpl().simple(dataMap);
        }else if(type.equals("bar")){
            option=new BarImpl().simple(dataMap);
        }

        return option;
    }

}
