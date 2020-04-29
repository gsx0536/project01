package com.tieda.alarm.echarts;

import com.github.abel533.echarts.Legend;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.Title;
import com.github.abel533.echarts.Tooltip;
import com.github.abel533.echarts.axis.Axis;
import com.github.abel533.echarts.axis.AxisLabel;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.AxisType;
import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.data.Data;
import com.github.abel533.echarts.series.Line;
import com.github.abel533.echarts.series.Pie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LineImpl {


    public Option simple(Map dataMap){
        Option option = new Option();
        List xList=(List)dataMap.get("text");
        CategoryAxis category = new CategoryAxis();
        category.setData(xList);
        option.xAxis(category);
        AxisLabel axisLabel=new AxisLabel();
        int interval=Integer.valueOf(xList.size()/6);
        axisLabel.setInterval(interval);
        category.setAxisLabel(axisLabel);
        ValueAxis yaxis = new ValueAxis();
        option.yAxis(yaxis);
        Tooltip tooltip=new Tooltip();
        tooltip.formatter("{b} : {c}");
        option.setTooltip(tooltip);

        List series=new ArrayList();
        Line line=new Line();
        List data=(List)dataMap.get("data");
        line.setData(data);
        series.add(line);
        option.setSeries(series);
        return option;
    }
}
