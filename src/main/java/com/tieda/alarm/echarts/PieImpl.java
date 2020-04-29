package com.tieda.alarm.echarts;

import com.github.abel533.echarts.Legend;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.Title;
import com.github.abel533.echarts.Tooltip;
import com.github.abel533.echarts.code.Orient;
import com.github.abel533.echarts.code.X;
import com.github.abel533.echarts.data.Data;
import com.github.abel533.echarts.series.Pie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PieImpl {


    public Option simple(Map dataMap){
        Option option = new Option();
        Title title=new Title();
        title.x(X.center);
        option.setTitle(title);
        Tooltip tooltip=new Tooltip();
        tooltip.formatter("{b} : {c} ({d}%)");
        option.setTooltip(tooltip);
        Legend legend=new Legend();
        legend.orient(Orient.vertical).left(5);
        option.setLegend(legend);
        List series=new ArrayList();
        Pie p1 = new Pie();
        List<Data> data=(List)dataMap.get("data");
        p1.setData(data);
        series.add(p1);
        option.setSeries(series);
        return option;
    }
}
