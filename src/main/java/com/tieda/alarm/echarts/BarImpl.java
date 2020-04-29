package com.tieda.alarm.echarts;

import com.github.abel533.echarts.*;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Pie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BarImpl {


    public Option simple(Map dataMap){
        Option option = new Option();
        Grid grid=new Grid();
        grid.containLabel(true);
        option.grid(grid);
        option.tooltip(new Tooltip());
        List xList=(List)dataMap.get("text");
        CategoryAxis category = new CategoryAxis();
        category.setData(xList);
        option.xAxis(category);
        ValueAxis yaxis = new ValueAxis();
        option.yAxis(yaxis);
        List series=new ArrayList();
        Bar bar=new Bar();
        List data=(List)dataMap.get("data");
        bar.setData(data);
        series.add(bar);
        option.setSeries(series);
        return option;
    }
}
