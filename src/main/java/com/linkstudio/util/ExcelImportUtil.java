package com.linkstudio.util;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.jfree.chart.ChartColor;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.linkstudio.util.ConstantValue.*;

public class ExcelImportUtil {
    public static List<Map<String, String>> parseExcel(InputStream fis) {
        List<Map<String, String>> data = new ArrayList<Map<String, String>>();;
        try {
            HSSFWorkbook book = new HSSFWorkbook(fis);
            HSSFSheet sheet = book.getSheetAt(0);
            int firstRow = sheet.getFirstRowNum();
            int lastRow = sheet.getLastRowNum();
            //除去表头和第一行
//          ComnDao dao = SysBeans.getComnDao();
            for(int i = firstRow + 1; i<lastRow+1; i++) {
                Map map = new HashMap();

                HSSFRow row = sheet.getRow(i);
                int firstCell = row.getFirstCellNum();
                int lastCell = row.getLastCellNum();


                for(int j=firstCell; j<lastCell; j++) {

                    HSSFCell cell2 = sheet.getRow(firstRow + 1).getCell(j);
                    String key = cell2.getStringCellValue();
                    //System.out.println(key);
                    HSSFCell cell = row.getCell(j);

                    if(cell.getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
                        cell.setCellType(HSSFCell.CELL_TYPE_STRING);
                    }
                    String val = cell.getStringCellValue();

//              System.out.println(val);

                    if(i == firstRow + 1) {
                        break;
                    }else{
                        map.put(key, val);

                    }
//              System.out.println(map);
                }
                if(i != firstRow + 1) {
                    data.add(map);
                 //   System.out.println(map);
                }
            }
          //  System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    private static DefaultPieDataset GetAcaDataSet(int good,int middle,int bad)
    {

        DefaultPieDataset dpd = new DefaultPieDataset();
        dpd.setValue(ConstantValue.cnNameArr[0], good);
        dpd.setValue(ConstantValue.cnNameArr[1], middle);
        dpd.setValue(ConstantValue.cnNameArr[2], bad);
        return dpd;
    }
    public static JFreeChart GetAcaPieChart(int good, int middle, int bad)
    {
        DefaultPieDataset dataSet = GetAcaDataSet(good,middle,bad);
        JFreeChart chart = ChartFactory.createPieChart("", dataSet, false, false, false);
//		System.out.println(good+":"+middle+":"+bad);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setBackgroundPaint(ChartColor.WHITE);
        plot.setInteriorGap(0.000001);
        plot.setOutlinePaint(ChartColor.WHITE); // 设置绘图面板外边的填充颜色
        plot.setShadowPaint(null);
        plot.setLabelGenerator(
                new StandardPieSectionLabelGenerator( "{0}:{2}",
                        NumberFormat.getNumberInstance(),
                        new DecimalFormat("0.0%")));
        plot.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0}"));

        PiePlot piePlot= (PiePlot) chart.getPlot();//获取图表区域对象
        piePlot.setLabelFont(new Font("微软雅黑",Font.PLAIN,33));
        piePlot.setLabelBackgroundPaint(ChartColor.WHITE);
        piePlot.setLabelLinksVisible(false);
        piePlot.setLabelBackgroundPaint(new Color(238,238,238));
        piePlot.setLabelLinksVisible(true);
        //piePlot.setLabelLinkMargin(-0.010);
        plot.setBackgroundPaint(new Color(238,238,238));
        plot.setInteriorGap(0.000001);
        plot.setOutlinePaint(new Color(238,238,238)); // 设置绘图面板外边的填充颜色
        plot.setSectionPaint(cnNameArr[0], new Color(240,107,150));
        plot.setSectionPaint(cnNameArr[1], new Color(1,183,207));
        plot.setSectionPaint(cnNameArr[2], new Color(238,29,35));
        return chart;
    }
}