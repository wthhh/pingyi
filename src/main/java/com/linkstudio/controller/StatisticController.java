package com.linkstudio.controller;


import com.linkstudio.service.*;
import com.linkstudio.util.ExcelImportUtil;
import org.jfree.chart.servlet.ServletUtilities;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.linkstudio.util.ConstantValue.PIE_HEIGHT;
import static com.linkstudio.util.ConstantValue.PIE_WIDTH;

@Controller
@SessionAttributes({"school"})
@RequestMapping({""})
public class StatisticController {
    @Resource
    private IStudentService studentService;
    @Resource
    private ITeacherService teacherService;
    @Resource
    private IBranchRatingService branchRatingService;
    @Resource
    private ISelfRatingService selfRatingService;
    @Resource
    private IMemberRatingService memberRatingService ;
    public StatisticController() {
    }

    @RequestMapping({"/zhibuindex"})
    public String front(Model model ,HttpSession session) {
        List<Map<String,Object>> list = this.branchRatingService.selectbyschool();

        List<Map<String,Object>> listall = this.branchRatingService.selectbyall();

        List<Map<String,String>> newlist = new ArrayList<Map<String, String>>();
        Map<String,String> mapall = new HashMap<String, String>();
        try {
            int h1all = Integer.parseInt(listall.get(0).get("high1").toString());
            int m1all = Integer.parseInt(listall.get(0).get("middle1").toString());
            int l1all = Integer.parseInt(listall.get(0).get("low1").toString());
            int h2all = Integer.parseInt(listall.get(0).get("high2").toString());
            int m2all = Integer.parseInt(listall.get(0).get("middle2").toString());
            int l2all = Integer.parseInt(listall.get(0).get("low2").toString());
            int h3all = Integer.parseInt(listall.get(0).get("high3").toString());
            int m3all = Integer.parseInt(listall.get(0).get("middle3").toString());
            int l3all = Integer.parseInt(listall.get(0).get("low3").toString());
            int h4all = Integer.parseInt(listall.get(0).get("high4").toString());
            int m4all = Integer.parseInt(listall.get(0).get("middle4").toString());
            int l4all = Integer.parseInt(listall.get(0).get("low4").toString());
            int h5all = Integer.parseInt(listall.get(0).get("high5").toString());
            int m5all = Integer.parseInt(listall.get(0).get("middle5").toString());
            int l5all = Integer.parseInt(listall.get(0).get("low5").toString());
            int h6all = Integer.parseInt(listall.get(0).get("high6").toString());
            int m6all = Integer.parseInt(listall.get(0).get("middle6").toString());
            int l6all = Integer.parseInt(listall.get(0).get("low6").toString());

            int h7all = Integer.parseInt(listall.get(0).get("high7").toString());
            int m7all = Integer.parseInt(listall.get(0).get("middle7").toString());
            int l7all = Integer.parseInt(listall.get(0).get("low7").toString());


            int h8all = Integer.parseInt(listall.get(0).get("high8").toString());
            int m8all = Integer.parseInt(listall.get(0).get("middle8").toString());
            int l8all = Integer.parseInt(listall.get(0).get("low8").toString());

            int h9all = Integer.parseInt(listall.get(0).get("high9").toString());
            int m9all = Integer.parseInt(listall.get(0).get("middle9").toString());
            int l9all = Integer.parseInt(listall.get(0).get("low9").toString());
            String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1all,m1all,l1all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie1",fileNamePie1);
            System.out.println(m1all);
            String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2all,m2all,l2all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie2",fileNamePie2);
            String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3all,m3all,l3all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie3",fileNamePie3);
            String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4all,m4all,l4all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie4",fileNamePie4);
            String fileNamePie5= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5all,m5all,l5all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie5",fileNamePie5);
            String fileNamePie6= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h6all,m6all,l6all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie6",fileNamePie6);

            String fileNamePie7= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h7all,m7all,l7all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie7",fileNamePie7);
            String fileNamePie8= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h8all,m8all,l8all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie8",fileNamePie8);
            String fileNamePie9= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h9all,m9all,l9all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie9",fileNamePie9);
            model.addAttribute("h1all",h1all);
            model.addAttribute("m1all",m1all);
            model.addAttribute("l1all",l1all);
            model.addAttribute("h2all",h2all);
            model.addAttribute("m2all",m2all);
            model.addAttribute("l2all",l2all);
            model.addAttribute("h3all",h3all);
            model.addAttribute("m3all",m3all);
            model.addAttribute("l3all",l3all);
            model.addAttribute("h4all",h4all);
            model.addAttribute("m4all",m4all);
            model.addAttribute("l4all",l4all);
            model.addAttribute("h5all",h5all);
            model.addAttribute("m5all",m5all);
            model.addAttribute("l5all",l5all);
            model.addAttribute("h6all",h6all);
            model.addAttribute("m6all",m6all);
            model.addAttribute("l6all",l6all);

            model.addAttribute("h7all",h7all);
            model.addAttribute("m7all",m7all);
            model.addAttribute("l7all",l7all);

            model.addAttribute("h8all",h8all);
            model.addAttribute("m8all",m8all);
            model.addAttribute("l8all",l8all);

            model.addAttribute("h9all",h9all);
            model.addAttribute("m9all",m9all);
            model.addAttribute("l9all",l9all);

            model.addAttribute("mapall" ,mapall);
        }catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }


        try {
            for(int i = 0 ;i<list.size();i++){
                Map<String,String> map = new HashMap<String, String>();
                Map<String, Object> map1 = list.get(i);


                //
                Integer h1 = Integer.parseInt(map1.get("high1").toString());
                Integer m1 = Integer.parseInt(map1.get("middle1").toString());
                Integer l1 = Integer.parseInt(map1.get("low1").toString());
                Integer h2 = Integer.parseInt(map1.get("high2").toString());
                Integer m2 = Integer.parseInt(map1.get("middle2").toString());
                Integer l2 = Integer.parseInt(map1.get("low2").toString());
                Integer h3 = Integer.parseInt(map1.get("high3").toString());
                Integer m3 = Integer.parseInt(map1.get("middle3").toString());
                Integer l3 = Integer.parseInt(map1.get("low3").toString());
                Integer h4 = Integer.parseInt(map1.get("high4").toString());
                Integer m4 = Integer.parseInt(map1.get("middle4").toString());
                Integer l4 = Integer.parseInt(map1.get("low4").toString());
                Integer h5 = Integer.parseInt(map1.get("high5").toString());
                Integer m5 = Integer.parseInt(map1.get("middle5").toString());
                Integer l5 = Integer.parseInt(map1.get("low5").toString());
                Integer h6 = Integer.parseInt(map1.get("high6").toString());
                Integer m6 = Integer.parseInt(map1.get("middle6").toString());
                Integer l6 = Integer.parseInt(map1.get("low6").toString());

                Integer h7 = Integer.parseInt(map1.get("high7").toString());
                Integer m7 = Integer.parseInt(map1.get("middle7").toString());
                Integer l7 = Integer.parseInt(map1.get("low7").toString());
                Integer h8 = Integer.parseInt(map1.get("high8").toString());
                Integer m8 = Integer.parseInt(map1.get("middle8").toString());
                Integer l8 = Integer.parseInt(map1.get("low8").toString());
                Integer h9 = Integer.parseInt(map1.get("high9").toString());
                Integer m9 = Integer.parseInt(map1.get("middle9").toString());
                Integer l9 = Integer.parseInt(map1.get("low9").toString());
                String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1,m1,l1), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie1",fileNamePie1);
                String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2,m2,l2), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie2",fileNamePie2);
                String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3,m3,l3), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie3",fileNamePie3);
                String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4,m4,l4), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie4",fileNamePie4);
                String fileNamePie5= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5,m5,l5), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie5",fileNamePie5);
                String fileNamePie6= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h6,m6,l6), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie6",fileNamePie6);
                String fileNamePie7= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h7,m7,l7), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie7",fileNamePie7);
                String fileNamePie8= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h8,m8,l8), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie8",fileNamePie8);
                String fileNamePie9= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h9,m9,l9), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie9",fileNamePie9);
                String school = map1.get("school_name").toString();
                map.put("school",school);
                String low9 = l9.toString();
                map.put("l9",low9);
                String low8 = l8.toString();
                map.put("l8",low8);
                String low7 = l7.toString();
                map.put("l7",low7);
                String low6 = l6.toString();
                map.put("l6",low6);
                String low5 = l5.toString();
                map.put("l5",low5);
                String low4 = l4.toString();
                map.put("l4",low4);
                String low3 = l3.toString();
                map.put("l3",low3);
                String low2 = l2.toString();
                map.put("l2",low2);
                String low1 = l1.toString();
                map.put("l1",low1);
                String middle9 = m9.toString();
                map.put("m9",middle9);
                String middle8 = m8.toString();
                map.put("m8",middle8);
                String middle7 = m7.toString();
                map.put("m7",middle7);
                String middle6 = m6.toString();
                map.put("m6",middle6);
                String middle5 = m5.toString();
                map.put("m5",middle5);
                String middle4 = m4.toString();
                map.put("m4",middle4);
                String middle3 = m3.toString();
                map.put("m3",middle3);
                String middle2 = m2.toString();
                map.put("m2",middle2);
                String middle1 = m1.toString();
                map.put("m1",middle1);
                String high9 = h9.toString();
                map.put("h9",high9);
                String high8 = h8.toString();
                map.put("h8",high8);
                String high7 = h7.toString();
                map.put("h7",high7);
                String high6 = h6.toString();
                map.put("h6",high6);
                String high5 = h5.toString();
                map.put("h5",high5);
                String high4 = h4.toString();
                map.put("h4",high4);
                String high3 = h3.toString();
                map.put("h3",high3);
                String high2 = h2.toString();
                map.put("h2",high2);
                String high1 = h1.toString();
                map.put("h1",high1);

                //
                newlist.add(map);
            }
            model.addAttribute("newlist" ,newlist);
        }
        catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        for (Map<String, String> m : newlist){
            for (String k : m.keySet()){
                System.out.println(k + " : " + m.get(k));
            }

        }

        return "zhibuindex";//跳到index.jsp
    }
    @RequestMapping({"/selfindex"})
    public String selfindex(Model model ,HttpSession session) {
        List<Map<String,Object>> list = this.selfRatingService.selectbyschool();
        List<Map<String,Object>> listall = this.selfRatingService.selectbyall();
        List<Map<String,String>> newlist = new ArrayList<Map<String, String>>();
        Map<String,String> mapall = new HashMap<String, String>();
        try {
            Integer h1all = Integer.parseInt(listall.get(0).get("high1").toString());
            System.out.println("deps"+listall.get(0));
            Integer m1all = Integer.parseInt(listall.get(0).get("middle1").toString());
            System.out.println("deps"+m1all);
            Integer l1all = Integer.parseInt(listall.get(0).get("low1").toString());
            System.out.println("deps"+l1all);
            Integer h2all = Integer.parseInt(listall.get(0).get("high2").toString());
            Integer m2all = Integer.parseInt(listall.get(0).get("middle2").toString());
            Integer l2all = Integer.parseInt(listall.get(0).get("low2").toString());
            Integer h3all = Integer.parseInt(listall.get(0).get("high3").toString());
            Integer m3all = Integer.parseInt(listall.get(0).get("middle3").toString());
            Integer l3all = Integer.parseInt(listall.get(0).get("low3").toString());
            Integer h4all = Integer.parseInt(listall.get(0).get("high4").toString());
            Integer m4all = Integer.parseInt(listall.get(0).get("middle4").toString());
            Integer l4all = Integer.parseInt(listall.get(0).get("low4").toString());
            Integer h5all = Integer.parseInt(listall.get(0).get("high5").toString());
            Integer m5all = Integer.parseInt(listall.get(0).get("middle5").toString());
            Integer l5all = Integer.parseInt(listall.get(0).get("low5").toString());
            String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1all,m1all,l1all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie1",fileNamePie1);
            String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2all,m2all,l2all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie2",fileNamePie2);
            String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3all,m3all,l3all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie3",fileNamePie3);
            String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4all,m4all,l4all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie4",fileNamePie4);
            String fileNamePie5= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5all,m5all,l5all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie5",fileNamePie5);

            model.addAttribute("h1all",h1all);
            model.addAttribute("m1all",m1all);
            model.addAttribute("l1all",l1all);
            model.addAttribute("h2all",h2all);
            model.addAttribute("m2all",m2all);
            model.addAttribute("l2all",l2all);
            model.addAttribute("h3all",h3all);
            model.addAttribute("m3all",m3all);
            model.addAttribute("l3all",l3all);
            model.addAttribute("h4all",h4all);
            model.addAttribute("m4all",m4all);
            model.addAttribute("l4all",l4all);
            model.addAttribute("h5all",h5all);
            model.addAttribute("m5all",m5all);
            model.addAttribute("l5all",l5all);


            model.addAttribute("mapall" ,mapall);
        }catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }

        try {
            for(int i = 0 ;i<list.size();i++){
                Map<String,String> map = new HashMap<String, String>();
                Map<String, Object> map1 = list.get(i);

                //
                Integer h1 = Integer.parseInt(map1.get("high1").toString());
                Integer m1 = Integer.parseInt(map1.get("middle1").toString());
                Integer l1 = Integer.parseInt(map1.get("low1").toString());
                Integer h2 = Integer.parseInt(map1.get("high2").toString());
                Integer m2 = Integer.parseInt(map1.get("middle2").toString());
                Integer l2 = Integer.parseInt(map1.get("low2").toString());
                Integer h3 = Integer.parseInt(map1.get("high3").toString());
                Integer m3 = Integer.parseInt(map1.get("middle3").toString());
                Integer l3 = Integer.parseInt(map1.get("low3").toString());
                Integer h4 = Integer.parseInt(map1.get("high4").toString());
                Integer m4 = Integer.parseInt(map1.get("middle4").toString());
                Integer l4 = Integer.parseInt(map1.get("low4").toString());
                Integer h5 = Integer.parseInt(map1.get("high5").toString());
                Integer m5 = Integer.parseInt(map1.get("middle5").toString());
                Integer l5 = Integer.parseInt(map1.get("low5").toString());

                String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1,m1,l1), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie1",fileNamePie1);
                String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2,m2,l2), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie2",fileNamePie2);
                String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3,m3,l3), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie3",fileNamePie3);
                String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4,m4,l4), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie4",fileNamePie4);
                String fileNamePie5= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5,m5,l5), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie5",fileNamePie5);
                String school = map1.get("school_name").toString();

                String low5 = l5.toString();
                map.put("l5",low5);
                String low4 = l4.toString();
                map.put("l4",low4);
                String low3 = l3.toString();
                map.put("l3",low3);
                String low2 = l2.toString();
                map.put("l2",low2);
                String low1 = l1.toString();
                map.put("l1",low1);
                String middle5 = m5.toString();
                map.put("m5",middle5);
                String middle4 = m4.toString();
                map.put("m4",middle4);
                String middle3 = m3.toString();
                map.put("m3",middle3);
                String middle2 = m2.toString();
                map.put("m2",middle2);
                String middle1 = m1.toString();
                map.put("m1",middle1);
                String high5 = h5.toString();
                map.put("h5",high5);
                String high4 = h4.toString();
                map.put("h4",high4);
                String high3 = h3.toString();
                map.put("h3",high3);
                String high2 = h2.toString();
                map.put("h2",high2);
                String high1 = h1.toString();
                map.put("h1",high1);
                map.put("school",school);


                //
                newlist.add(map);
            }
            model.addAttribute("newlist" ,newlist);
        }
        catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        for (Map<String, String> m : newlist){
            for (String k : m.keySet()){
                //   System.out.println(k + " : " + m.get(k));
            }

        }

        return "dangyuanziping";//跳到index.jsp
    }
    @RequestMapping({"/hupingindex"})
    public String hupingindex(Model model, HttpSession session) {
        List<Map<String,Object>> list = this.memberRatingService.selectbyschool();
        List<Map<String,Object>> listall = this.memberRatingService.selectbyall();

        List<Map<String,Object>> qunzhongall = this.studentService.countqunzhongbyall();
        List<Map<String,Object>> qunzhongschool = this.studentService.countqunzhongbyschoolall();
        List<Map<String,String>> newlist = new ArrayList<Map<String, String>>();
        System.out.println(listall);
        Map<String,String> mapall = new HashMap<String, String>();
        try {
            Integer dangyuanlow = Integer.parseInt(listall.get(0).get("dangyuanlow").toString());
            Integer dangyuanmiddle = Integer.parseInt(listall.get(0).get("dangyuanmiddle").toString());
            Integer dangyuangood = Integer.parseInt(listall.get(0).get("dangyuangood").toString());
            Integer qunzhonglow = Integer.parseInt(listall.get(0).get("qunzhonglow").toString());
            Integer qunzhongmiddle = Integer.parseInt(listall.get(0).get("qunzhongmiddle").toString());
            Integer qunzhonggood = Integer.parseInt(listall.get(0).get("qunzhonggood").toString());
            Integer low = Integer.parseInt(listall.get(0).get("low").toString());
            Integer middle = Integer.parseInt(listall.get(0).get("middle").toString());
            Integer good = Integer.parseInt(listall.get(0).get("good").toString());
            Integer contact = Integer.parseInt(listall.get(0).get("contact").toString());
            Integer number = Integer.parseInt(qunzhongall.get(0).get("qunzhong").toString());
            Integer notknow = (number.intValue()-contact.intValue());
            String dylow = dangyuanlow.toString();
            mapall.put("dangyuanlow",dylow);
            String dymiddle = dangyuanmiddle.toString();
            mapall.put("dangyuanmiddle",dymiddle);
            String dyhigh = dangyuangood.toString();
            mapall.put("dangyuangood",dyhigh);
            String qzlow = qunzhonglow.toString();
            mapall.put("qunzhonglow",qzlow);
            String qzmiddle = qunzhongmiddle.toString();
            mapall.put("qunzhongmiddle",qzmiddle);
            String qzhigh = qunzhonggood.toString();
            mapall.put("qunzhonggood",qzhigh);
            String alllow = low.toString();
            mapall.put("low",alllow);
            String allmiddle = middle.toString();
            mapall.put("middle",allmiddle);
            String allhigh = good.toString();
            mapall.put("good",allhigh);
            String contactall = contact.toString();
            mapall.put("contact",contactall);
            String contactnum = notknow.toString();
            mapall.put("number",contactnum);

            String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(dangyuangood,dangyuanmiddle,dangyuanlow), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie1",fileNamePie1);
            String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(qunzhonggood,qunzhongmiddle,qunzhonglow), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie2",fileNamePie2);
            String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(good,middle,low), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie3",fileNamePie3);
            String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(contact,0,number-contact), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie4",fileNamePie4);


            model.addAttribute("mapall" ,mapall);
        }catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }

        try {
            for(int i = 0 ;i<list.size();i++){
                Map<String,String> map = new HashMap<String, String>();
                Map<String, Object> map1 = list.get(i);

                Map<String, Object> map2 = qunzhongschool.get(i);
                for(int j = 0; j <qunzhongschool.size();j++)
                    if(qunzhongschool.get(j).get("school").equals(map1.get("school_name")) )
                        map2= qunzhongschool.get(j);

                //
                Integer dangyuanlow = Integer.parseInt(map1.get("dangyuanlow").toString());
                Integer dangyuanmiddle = Integer.parseInt(map1.get("dangyuanmiddle").toString());
                Integer dangyuangood = Integer.parseInt(map1.get("dangyuangood").toString());
                Integer qunzhonglow = Integer.parseInt(map1.get("qunzhonglow").toString());
                Integer qunzhongmiddle = Integer.parseInt(map1.get("qunzhongmiddle").toString());
                Integer qunzhonggood = Integer.parseInt(map1.get("qunzhonggood").toString());
                Integer low = Integer.parseInt(map1.get("low").toString());
                Integer middle = Integer.parseInt(map1.get("middle").toString());
                Integer good = Integer.parseInt(map1.get("good").toString());
                Integer contact = Integer.parseInt(map1.get("contact").toString());
                Integer number = Integer.parseInt(map2.get("qunzhong").toString());

                String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(dangyuangood,dangyuanmiddle,dangyuanlow), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie1",fileNamePie1);
                String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(qunzhonggood,qunzhongmiddle,qunzhonglow), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie2",fileNamePie2);
                String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(good,middle,low), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie3",fileNamePie3);
                String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(contact,0,number-contact), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie4",fileNamePie4);



                String school = map1.get("school_name").toString();
                map.put("school",school);


                //
                newlist.add(map);
            }
            model.addAttribute("newlist" ,newlist);
        }
        catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }


        return "dangyuanpingyi";//跳到index.jsp
    }

    @RequestMapping(
            value = {"/findTeacher"},
            method = {RequestMethod.POST}
    )
    public String schoolzhibu(@RequestParam String school,@RequestParam String password, Model model, HttpSession session) {

        model.addAttribute("school", school);
        String pwd = new String();
        try{ pwd = this.teacherService.getteacherById(school).getPasswd();}
        catch(Exception e){};
        if(pwd.equals(password) ) {
            List<Map<String, Object>> list = this.branchRatingService.selectbybranch(school);
            List<Map<String, Object>> listall = this.branchRatingService.selectbyall();
            List<Map<String, Object>> listschool = this.branchRatingService.selectbyschool();
            int key = 0;
            Map<String, String> mapzhibu = new HashMap<String, String>();

            for (int j = 0; j < listschool.size(); j++) {
                //  System.out.println(listschool.get(j));
                if (listschool.get(j).get("school_name").toString().equals(school))
                    key = j;
            }
            try {
                int h1all = Integer.parseInt(listschool.get(key).get("high1").toString());
                int m1all = Integer.parseInt(listschool.get(key).get("middle1").toString());
                int l1all = Integer.parseInt(listschool.get(key).get("low1").toString());
                int h2all = Integer.parseInt(listschool.get(key).get("high2").toString());
                int m2all = Integer.parseInt(listschool.get(key).get("middle2").toString());
                int l2all = Integer.parseInt(listschool.get(key).get("low2").toString());
                int h3all = Integer.parseInt(listschool.get(key).get("high3").toString());
                int m3all = Integer.parseInt(listschool.get(key).get("middle3").toString());
                int l3all = Integer.parseInt(listschool.get(key).get("low3").toString());
                int h4all = Integer.parseInt(listschool.get(key).get("high4").toString());
                int m4all = Integer.parseInt(listschool.get(key).get("middle4").toString());
                int l4all = Integer.parseInt(listschool.get(key).get("low4").toString());
                int h5all = Integer.parseInt(listschool.get(key).get("high5").toString());
                int m5all = Integer.parseInt(listschool.get(key).get("middle5").toString());
                int l5all = Integer.parseInt(listschool.get(key).get("low5").toString());
                int h6all = Integer.parseInt(listschool.get(key).get("high6").toString());
                int m6all = Integer.parseInt(listschool.get(key).get("middle6").toString());
                int l6all = Integer.parseInt(listschool.get(key).get("low6").toString());
                int h7all = Integer.parseInt(listschool.get(key).get("high7").toString());
                int m7all = Integer.parseInt(listschool.get(key).get("middle7").toString());
                int l7all = Integer.parseInt(listschool.get(key).get("low7").toString());
                int h8all = Integer.parseInt(listschool.get(key).get("high8").toString());
                int m8all = Integer.parseInt(listschool.get(key).get("middle8").toString());
                int l8all = Integer.parseInt(listschool.get(key).get("low8").toString());
                int h9all = Integer.parseInt(listschool.get(key).get("high9").toString());
                int m9all = Integer.parseInt(listschool.get(key).get("middle9").toString());
                int l9all = Integer.parseInt(listschool.get(key).get("low9").toString());
                String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1all, m1all, l1all), PIE_WIDTH, PIE_HEIGHT, session);
                mapzhibu.put("fileNamePie1", fileNamePie1);
                String fileNamePie2 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2all, m2all, l2all), PIE_WIDTH, PIE_HEIGHT, session);
                mapzhibu.put("fileNamePie2", fileNamePie2);
                String fileNamePie3 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3all, m3all, l3all), PIE_WIDTH, PIE_HEIGHT, session);
                mapzhibu.put("fileNamePie3", fileNamePie3);
                String fileNamePie4 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4all, m4all, l4all), PIE_WIDTH, PIE_HEIGHT, session);
                mapzhibu.put("fileNamePie4", fileNamePie4);
                String fileNamePie5 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5all, m5all, l5all), PIE_WIDTH, PIE_HEIGHT, session);
                mapzhibu.put("fileNamePie5", fileNamePie5);
                String fileNamePie6 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h6all, m6all, l6all), PIE_WIDTH, PIE_HEIGHT, session);
                mapzhibu.put("fileNamePie6", fileNamePie6);
                String fileNamePie7 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h7all, m7all, l7all), PIE_WIDTH, PIE_HEIGHT, session);
                mapzhibu.put("fileNamePie7", fileNamePie7);
                String fileNamePie8 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h8all, m8all, l8all), PIE_WIDTH, PIE_HEIGHT, session);
                mapzhibu.put("fileNamePie8", fileNamePie8);
                String fileNamePie9 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h9all, m9all, l9all), PIE_WIDTH, PIE_HEIGHT, session);
                mapzhibu.put("fileNamePie9", fileNamePie9);
                mapzhibu.put("school", school);


                model.addAttribute("mapzhibu", mapzhibu);
            } catch (Exception e) {
                System.out.println(e.fillInStackTrace());
            }
            Map<String, String> mapall = new HashMap<String, String>();
            try {
                int h1all = Integer.parseInt(listall.get(0).get("high1").toString());
                int m1all = Integer.parseInt(listall.get(0).get("middle1").toString());
                int l1all = Integer.parseInt(listall.get(0).get("low1").toString());
                int h2all = Integer.parseInt(listall.get(0).get("high2").toString());
                int m2all = Integer.parseInt(listall.get(0).get("middle2").toString());
                int l2all = Integer.parseInt(listall.get(0).get("low2").toString());
                int h3all = Integer.parseInt(listall.get(0).get("high3").toString());
                int m3all = Integer.parseInt(listall.get(0).get("middle3").toString());
                int l3all = Integer.parseInt(listall.get(0).get("low3").toString());
                int h4all = Integer.parseInt(listall.get(0).get("high4").toString());
                int m4all = Integer.parseInt(listall.get(0).get("middle4").toString());
                int l4all = Integer.parseInt(listall.get(0).get("low4").toString());
                int h5all = Integer.parseInt(listall.get(0).get("high5").toString());
                int m5all = Integer.parseInt(listall.get(0).get("middle5").toString());
                int l5all = Integer.parseInt(listall.get(0).get("low5").toString());
                int h6all = Integer.parseInt(listall.get(0).get("high6").toString());
                int m6all = Integer.parseInt(listall.get(0).get("middle6").toString());
                int l6all = Integer.parseInt(listall.get(0).get("low6").toString());
                int h7all = Integer.parseInt(listall.get(0).get("high7").toString());
                int m7all = Integer.parseInt(listall.get(0).get("middle7").toString());
                int l7all = Integer.parseInt(listall.get(0).get("low7").toString());
                int h8all = Integer.parseInt(listall.get(0).get("high8").toString());
                int m8all = Integer.parseInt(listall.get(0).get("middle8").toString());
                int l8all = Integer.parseInt(listall.get(0).get("low8").toString());
                int h9all = Integer.parseInt(listall.get(0).get("high9").toString());
                int m9all = Integer.parseInt(listall.get(0).get("middle9").toString());
                int l9all = Integer.parseInt(listall.get(0).get("low9").toString());
                String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1all, m1all, l1all), PIE_WIDTH, PIE_HEIGHT, session);
                mapall.put("fileNamePie1", fileNamePie1);
                String fileNamePie2 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2all, m2all, l2all), PIE_WIDTH, PIE_HEIGHT, session);
                mapall.put("fileNamePie2", fileNamePie2);
                String fileNamePie3 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3all, m3all, l3all), PIE_WIDTH, PIE_HEIGHT, session);
                mapall.put("fileNamePie3", fileNamePie3);
                String fileNamePie4 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4all, m4all, l4all), PIE_WIDTH, PIE_HEIGHT, session);
                mapall.put("fileNamePie4", fileNamePie4);
                String fileNamePie5 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5all, m5all, l5all), PIE_WIDTH, PIE_HEIGHT, session);
                mapall.put("fileNamePie5", fileNamePie5);
                String fileNamePie6 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h6all, m6all, l6all), PIE_WIDTH, PIE_HEIGHT, session);
                mapall.put("fileNamePie6", fileNamePie6);

                String fileNamePie7 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h7all, m7all, l7all), PIE_WIDTH, PIE_HEIGHT, session);
                mapall.put("fileNamePie7", fileNamePie7);

                String fileNamePie8 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h8all, m8all, l8all), PIE_WIDTH, PIE_HEIGHT, session);
                mapall.put("fileNamePie8", fileNamePie8);

                String fileNamePie9 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h9all, m9all, l9all), PIE_WIDTH, PIE_HEIGHT, session);
                mapall.put("fileNamePie9", fileNamePie9);


                model.addAttribute("mapall", mapall);
            } catch (Exception e) {
                System.out.println(e.fillInStackTrace());
            }


            List<Map<String, String>> newlist = new ArrayList<Map<String, String>>();
            try {
                for (int i = 0; i < list.size(); i++) {
                    Map<String, String> map = new HashMap<String, String>();
                    Map<String, Object> map1 = list.get(i);


                    //
                    int h1 = Integer.parseInt(map1.get("high1").toString());
                    int m1 = Integer.parseInt(map1.get("middle1").toString());
                    int l1 = Integer.parseInt(map1.get("low1").toString());
                    int h2 = Integer.parseInt(map1.get("high2").toString());
                    int m2 = Integer.parseInt(map1.get("middle2").toString());
                    int l2 = Integer.parseInt(map1.get("low2").toString());
                    int h3 = Integer.parseInt(map1.get("high3").toString());
                    int m3 = Integer.parseInt(map1.get("middle3").toString());
                    int l3 = Integer.parseInt(map1.get("low3").toString());
                    int h4 = Integer.parseInt(map1.get("high4").toString());
                    int m4 = Integer.parseInt(map1.get("middle4").toString());
                    int l4 = Integer.parseInt(map1.get("low4").toString());
                    int h5 = Integer.parseInt(map1.get("high5").toString());
                    int m5 = Integer.parseInt(map1.get("middle5").toString());
                    int l5 = Integer.parseInt(map1.get("low5").toString());
                    int h6 = Integer.parseInt(map1.get("high6").toString());
                    int m6 = Integer.parseInt(map1.get("middle6").toString());
                    int l6 = Integer.parseInt(map1.get("low6").toString());

                    int h7 = Integer.parseInt(map1.get("high7").toString());
                    int m7 = Integer.parseInt(map1.get("middle7").toString());
                    int l7 = Integer.parseInt(map1.get("low7").toString());

                    int h8 = Integer.parseInt(map1.get("high8").toString());
                    int m8 = Integer.parseInt(map1.get("middle8").toString());
                    int l8 = Integer.parseInt(map1.get("low8").toString());

                    int h9 = Integer.parseInt(map1.get("high9").toString());
                    int m9 = Integer.parseInt(map1.get("middle9").toString());
                    int l9 = Integer.parseInt(map1.get("low9").toString());
                    String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1, m1, l1), PIE_WIDTH, PIE_HEIGHT, session);
                    map.put("fileNamePie1", fileNamePie1);
                    String fileNamePie2 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2, m2, l2), PIE_WIDTH, PIE_HEIGHT, session);
                    map.put("fileNamePie2", fileNamePie2);
                    String fileNamePie3 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3, m3, l3), PIE_WIDTH, PIE_HEIGHT, session);
                    map.put("fileNamePie3", fileNamePie3);
                    String fileNamePie4 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4, m4, l4), PIE_WIDTH, PIE_HEIGHT, session);
                    map.put("fileNamePie4", fileNamePie4);
                    String fileNamePie5 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5, m5, l5), PIE_WIDTH, PIE_HEIGHT, session);
                    map.put("fileNamePie5", fileNamePie5);
                    String fileNamePie6 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h6, m6, l6), PIE_WIDTH, PIE_HEIGHT, session);
                    map.put("fileNamePie6", fileNamePie6);

                    String fileNamePie7 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h7, m7, l7), PIE_WIDTH, PIE_HEIGHT, session);
                    map.put("fileNamePie7", fileNamePie7);

                    String fileNamePie8 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h8,m8,l8), PIE_WIDTH, PIE_HEIGHT, session);
                    map.put("fileNamePie8", fileNamePie8);

                    String fileNamePie9 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h9,m9,l9), PIE_WIDTH, PIE_HEIGHT, session);
                    map.put("fileNamePie9", fileNamePie9);
                    String branch = map1.get("branch_name").toString();
                    map.put("branch", branch);


                    //
                    newlist.add(map);
                }
                model.addAttribute("newlist", newlist);
            } catch (Exception e) {
                System.out.println(e.fillInStackTrace());
            }
            for (Map<String, String> m : newlist) {
                for (String k : m.keySet()) {
                    System.out.println(k + " : " + m.get(k));
                }

            }

            return "yx_bt_index";
        }else
            return "error";
    }
    @RequestMapping({"/teacherlogin"})
    public String teacherlogin() {

        return "schoollogin";
    }
    @RequestMapping(
            value = {"/yx_bt_index"},
            method = {RequestMethod.GET}
    )
    public String schoolzhibulogined(@ModelAttribute("school") String school, Model model,HttpSession session) {


        List<Map<String,Object>> list = this.branchRatingService.selectbybranch(school);
        List<Map<String,Object>> listall = this.branchRatingService.selectbyall();
        List<Map<String,Object>> listschool = this.branchRatingService.selectbyschool();
        int key = 0;
        Map<String,String> mapzhibu = new HashMap<String, String>();

        for(int j = 0 ;j<listschool.size();j++) {
            //  System.out.println(listschool.get(j));
            if (  listschool.get(j).get("school_name").toString().equals(school) )
                key = j;
        }
        try {
            int h1all = Integer.parseInt(listschool.get(key).get("high1").toString());
            int m1all = Integer.parseInt(listschool.get(key).get("middle1").toString());
            int l1all = Integer.parseInt(listschool.get(key).get("low1").toString());
            int h2all = Integer.parseInt(listschool.get(key).get("high2").toString());
            int m2all = Integer.parseInt(listschool.get(key).get("middle2").toString());
            int l2all = Integer.parseInt(listschool.get(key).get("low2").toString());
            int h3all = Integer.parseInt(listschool.get(key).get("high3").toString());
            int m3all = Integer.parseInt(listschool.get(key).get("middle3").toString());
            int l3all = Integer.parseInt(listschool.get(key).get("low3").toString());
            int h4all = Integer.parseInt(listschool.get(key).get("high4").toString());
            int m4all = Integer.parseInt(listschool.get(key).get("middle4").toString());
            int l4all = Integer.parseInt(listschool.get(key).get("low4").toString());
            int h5all = Integer.parseInt(listschool.get(key).get("high5").toString());
            int m5all = Integer.parseInt(listschool.get(key).get("middle5").toString());
            int l5all = Integer.parseInt(listschool.get(key).get("low5").toString());
            int h6all = Integer.parseInt(listschool.get(key).get("high6").toString());
            int m6all = Integer.parseInt(listschool.get(key).get("middle6").toString());
            int l6all = Integer.parseInt(listschool.get(key).get("low6").toString());

            int h7all = Integer.parseInt(listschool.get(key).get("high7").toString());
            int m7all = Integer.parseInt(listschool.get(key).get("middle7").toString());
            int l7all = Integer.parseInt(listschool.get(key).get("low7").toString());
            int h8all = Integer.parseInt(listschool.get(key).get("high8").toString());
            int m8all = Integer.parseInt(listschool.get(key).get("middle8").toString());
            int l8all = Integer.parseInt(listschool.get(key).get("low8").toString());
            int h9all = Integer.parseInt(listschool.get(key).get("high9").toString());
            int m9all = Integer.parseInt(listschool.get(key).get("middle9").toString());
            int l9all = Integer.parseInt(listschool.get(key).get("low9").toString());
            String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1all,m1all,l1all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie1",fileNamePie1);
            String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2all,m2all,l2all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie2",fileNamePie2);
            String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3all,m3all,l3all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie3",fileNamePie3);
            String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4all,m4all,l4all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie4",fileNamePie4);
            String fileNamePie5= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5all,m5all,l5all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie5",fileNamePie5);
            String fileNamePie6= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h6all,m6all,l6all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie6",fileNamePie6);

            String fileNamePie7= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h7all,m7all,l7all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie7",fileNamePie7);
            String fileNamePie8= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h8all,m8all,l8all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie8",fileNamePie8);
            String fileNamePie9= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h9all,m9all,l9all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie9",fileNamePie9);
            mapzhibu.put("school",school);


            model.addAttribute("mapzhibu" ,mapzhibu);
        }catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        Map<String,String> mapall = new HashMap<String, String>();
        try {
            int h1all = Integer.parseInt(listall.get(0).get("high1").toString());
            int m1all = Integer.parseInt(listall.get(0).get("middle1").toString());
            int l1all = Integer.parseInt(listall.get(0).get("low1").toString());
            int h2all = Integer.parseInt(listall.get(0).get("high2").toString());
            int m2all = Integer.parseInt(listall.get(0).get("middle2").toString());
            int l2all = Integer.parseInt(listall.get(0).get("low2").toString());
            int h3all = Integer.parseInt(listall.get(0).get("high3").toString());
            int m3all = Integer.parseInt(listall.get(0).get("middle3").toString());
            int l3all = Integer.parseInt(listall.get(0).get("low3").toString());
            int h4all = Integer.parseInt(listall.get(0).get("high4").toString());
            int m4all = Integer.parseInt(listall.get(0).get("middle4").toString());
            int l4all = Integer.parseInt(listall.get(0).get("low4").toString());
            int h5all = Integer.parseInt(listall.get(0).get("high5").toString());
            int m5all = Integer.parseInt(listall.get(0).get("middle5").toString());
            int l5all = Integer.parseInt(listall.get(0).get("low5").toString());
            int h6all = Integer.parseInt(listall.get(0).get("high6").toString());
            int m6all = Integer.parseInt(listall.get(0).get("middle6").toString());
            int l6all = Integer.parseInt(listall.get(0).get("low6").toString());
            int h7all = Integer.parseInt(listall.get(0).get("high7").toString());
            int m7all = Integer.parseInt(listall.get(0).get("middle7").toString());
            int l7all = Integer.parseInt(listall.get(0).get("low7").toString());


            int h8all = Integer.parseInt(listall.get(0).get("high8").toString());
            int m8all = Integer.parseInt(listall.get(0).get("middle8").toString());
            int l8all = Integer.parseInt(listall.get(0).get("low8").toString());

            int h9all = Integer.parseInt(listall.get(0).get("high9").toString());
            int m9all = Integer.parseInt(listall.get(0).get("middle9").toString());
            int l9all = Integer.parseInt(listall.get(0).get("low9").toString());
            String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1all,m1all,l1all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie1",fileNamePie1);
            String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2all,m2all,l2all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie2",fileNamePie2);
            String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3all,m3all,l3all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie3",fileNamePie3);
            String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4all,m4all,l4all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie4",fileNamePie4);
            String fileNamePie5= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5all,m5all,l5all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie5",fileNamePie5);
            String fileNamePie6= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h6all,m6all,l6all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie6",fileNamePie6);

            String fileNamePie7= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h7all,m7all,l7all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie7",fileNamePie7);
            String fileNamePie8= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h8all,m8all,l8all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie8",fileNamePie8);
            String fileNamePie9= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h9all,m9all,l9all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie9",fileNamePie9);


            model.addAttribute("mapall" ,mapall);
        }catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }



        List<Map<String,String>> newlist = new ArrayList<Map<String, String>>();
        try {
            for(int i = 0 ;i<list.size();i++){
                Map<String,String> map = new HashMap<String, String>();
                Map<String, Object> map1 = list.get(i);


                //
                int h1 = Integer.parseInt(map1.get("high1").toString());
                int m1 = Integer.parseInt(map1.get("middle1").toString());
                int l1 = Integer.parseInt(map1.get("low1").toString());
                int h2 = Integer.parseInt(map1.get("high2").toString());
                int m2 = Integer.parseInt(map1.get("middle2").toString());
                int l2 = Integer.parseInt(map1.get("low2").toString());
                int h3 = Integer.parseInt(map1.get("high3").toString());
                int m3 = Integer.parseInt(map1.get("middle3").toString());
                int l3 = Integer.parseInt(map1.get("low3").toString());
                int h4 = Integer.parseInt(map1.get("high4").toString());
                int m4 = Integer.parseInt(map1.get("middle4").toString());
                int l4 = Integer.parseInt(map1.get("low4").toString());
                int h5 = Integer.parseInt(map1.get("high5").toString());
                int m5 = Integer.parseInt(map1.get("middle5").toString());
                int l5 = Integer.parseInt(map1.get("low5").toString());
                int h6 = Integer.parseInt(map1.get("high6").toString());
                int m6 = Integer.parseInt(map1.get("middle6").toString());
                int l6 = Integer.parseInt(map1.get("low6").toString());

                int h7 = Integer.parseInt(map1.get("high7").toString());
                int m7 = Integer.parseInt(map1.get("middle7").toString());
                int l7 = Integer.parseInt(map1.get("low7").toString());

                int h8 = Integer.parseInt(map1.get("high8").toString());
                int m8 = Integer.parseInt(map1.get("middle8").toString());
                int l8 = Integer.parseInt(map1.get("low8").toString());

                int h9 = Integer.parseInt(map1.get("high9").toString());
                int m9 = Integer.parseInt(map1.get("middle9").toString());
                int l9 = Integer.parseInt(map1.get("low9").toString());

                String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1,m1,l1), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie1",fileNamePie1);
                String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2,m2,l2), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie2",fileNamePie2);
                String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3,m3,l3), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie3",fileNamePie3);
                String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4,m4,l4), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie4",fileNamePie4);
                String fileNamePie5= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5,m5,l5), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie5",fileNamePie5);
                String fileNamePie6= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h6,m6,l6), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie6",fileNamePie6);
                String fileNamePie7= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h7,m7,l7), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie7",fileNamePie7);
                String fileNamePie8= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h8,m8,l8), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie8",fileNamePie8);
                String fileNamePie9= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h9,m9,l9), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie9",fileNamePie9);
                String branch = map1.get("branch_name").toString();
                map.put("branch",branch);


                //
                newlist.add(map);
            }
            model.addAttribute("newlist" ,newlist);
        }
        catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        for (Map<String, String> m : newlist){
            for (String k : m.keySet()){
                //  System.out.println(k + " : " + m.get(k));
            }

        }

        return "yx_bt_index";
    }
    @RequestMapping({"/yx_zp_index"})
    public String schoolziping(@ModelAttribute("school") String school, Model model,HttpSession session) {
        List<Map<String,Object>> list = this.selfRatingService.selectbybranch(school);
        List<Map<String,Object>> listall = this.selfRatingService.selectbyall();
        List<Map<String,Object>> listschool = this.selfRatingService.selectbyschool();
        int key = 0;
        Map<String,String> mapzhibu = new HashMap<String, String>();

        for(int j = 0 ;j<listschool.size();j++) {
            //  System.out.println(listschool.get(j));
            if (  listschool.get(j).get("school_name").toString().equals(school) )
                key = j;
        }
        try {
            mapzhibu.put("school",school);

            int h1all = Integer.parseInt(listschool.get(key).get("high1").toString());
            int m1all = Integer.parseInt(listschool.get(key).get("middle1").toString());
            int l1all = Integer.parseInt(listschool.get(key).get("low1").toString());
            int h2all = Integer.parseInt(listschool.get(key).get("high2").toString());
            int m2all = Integer.parseInt(listschool.get(key).get("middle2").toString());
            int l2all = Integer.parseInt(listschool.get(key).get("low2").toString());
            int h3all = Integer.parseInt(listschool.get(key).get("high3").toString());
            int m3all = Integer.parseInt(listschool.get(key).get("middle3").toString());
            int l3all = Integer.parseInt(listschool.get(key).get("low3").toString());
            int h4all = Integer.parseInt(listschool.get(key).get("high4").toString());
            int m4all = Integer.parseInt(listschool.get(key).get("middle4").toString());
            int l4all = Integer.parseInt(listschool.get(key).get("low4").toString());
            int h5all = Integer.parseInt(listschool.get(key).get("high5").toString());
            int m5all = Integer.parseInt(listschool.get(key).get("middle5").toString());
            int l5all = Integer.parseInt(listschool.get(key).get("low5").toString());
            String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1all,m1all,l1all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie1",fileNamePie1);

            String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2all,m2all,l2all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie2",fileNamePie2);
            String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3all,m3all,l3all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie3",fileNamePie3);
            String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4all,m4all,l4all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie4",fileNamePie4);
            String fileNamePie5= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5all,m5all,l5all), PIE_WIDTH, PIE_HEIGHT, session);
            mapzhibu.put("fileNamePie5",fileNamePie5);



            model.addAttribute("mapzhibu" ,mapzhibu);
        }catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        Map<String,String> mapall = new HashMap<String, String>();
        try {
            int h1all = Integer.parseInt(listall.get(0).get("high1").toString());
            int m1all = Integer.parseInt(listall.get(0).get("middle1").toString());
            int l1all = Integer.parseInt(listall.get(0).get("low1").toString());
            int h2all = Integer.parseInt(listall.get(0).get("high2").toString());
            int m2all = Integer.parseInt(listall.get(0).get("middle2").toString());
            int l2all = Integer.parseInt(listall.get(0).get("low2").toString());
            int h3all = Integer.parseInt(listall.get(0).get("high3").toString());
            int m3all = Integer.parseInt(listall.get(0).get("middle3").toString());
            int l3all = Integer.parseInt(listall.get(0).get("low3").toString());
            int h4all = Integer.parseInt(listall.get(0).get("high4").toString());
            int m4all = Integer.parseInt(listall.get(0).get("middle4").toString());
            int l4all = Integer.parseInt(listall.get(0).get("low4").toString());
            int h5all = Integer.parseInt(listall.get(0).get("high5").toString());
            int m5all = Integer.parseInt(listall.get(0).get("middle5").toString());
            int l5all = Integer.parseInt(listall.get(0).get("low5").toString());
            String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1all,m1all,l1all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie1",fileNamePie1);
            String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2all,m2all,l2all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie2",fileNamePie2);
            String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3all,m3all,l3all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie3",fileNamePie3);
            String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4all,m4all,l4all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie4",fileNamePie4);
            String fileNamePie5= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5all,m5all,l5all), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie5",fileNamePie5);


            model.addAttribute("mapall" ,mapall);
        }catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }



        List<Map<String,String>> newlist = new ArrayList<Map<String, String>>();
        try {
            for(int i = 0 ;i<list.size();i++){
                Map<String,String> map = new HashMap<String, String>();
                Map<String, Object> map1 = list.get(i);


                //
                int h1 = Integer.parseInt(map1.get("high1").toString());
                int m1 = Integer.parseInt(map1.get("middle1").toString());
                int l1 = Integer.parseInt(map1.get("low1").toString());
                int h2 = Integer.parseInt(map1.get("high2").toString());
                int m2 = Integer.parseInt(map1.get("middle2").toString());
                int l2 = Integer.parseInt(map1.get("low2").toString());
                int h3 = Integer.parseInt(map1.get("high3").toString());
                int m3 = Integer.parseInt(map1.get("middle3").toString());
                int l3 = Integer.parseInt(map1.get("low3").toString());
                int h4 = Integer.parseInt(map1.get("high4").toString());
                int m4 = Integer.parseInt(map1.get("middle4").toString());
                int l4 = Integer.parseInt(map1.get("low4").toString());
                int h5 = Integer.parseInt(map1.get("high5").toString());
                int m5 = Integer.parseInt(map1.get("middle5").toString());
                int l5 = Integer.parseInt(map1.get("low5").toString());

                String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h1,m1,l1), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie1",fileNamePie1);
                String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h2,m2,l2), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie2",fileNamePie2);
                String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h3,m3,l3), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie3",fileNamePie3);
                String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h4,m4,l4), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie4",fileNamePie4);
                String fileNamePie5= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(h5,m5,l5), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie5",fileNamePie5);
                String branch = map1.get("branch_name").toString();
                map.put("branch",branch);


                //
                newlist.add(map);
            }
            model.addAttribute("newlist" ,newlist);
        }
        catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        for (Map<String, String> m : newlist){
            for (String k : m.keySet()){
                System.out.println(k + " : " + m.get(k));
            }

        }

        return "yx_zp_index";
    }
    @RequestMapping({"/yx_hp_index"})
    public String schoolhuping(@ModelAttribute("school") String school, Model model,HttpSession session) {
        System.out.println(school);
        List<Map<String,Object>> list = this.memberRatingService.selectbybranch(school);
        List<Map<String,Object>> listall = this.memberRatingService.selectbyall();
        List<Map<String,Object>> listschool = this.memberRatingService.selectbyschool();
        List<Map<String,Object>> qunzhong = this.studentService.countbybranchall(school);
        List<Map<String,Object>> qunzhongall = this.studentService.countqunzhongbyall();
        List<Map<String,Object>> qunzhongschool = this.studentService.countqunzhongbyschoolall();
        int key = 0;
        int key2 = 0;
        Map<String,String> maphuping = new HashMap<String, String>();

        for(int j = 0 ;j<listschool.size();j++) {
            //  System.out.println(listschool.get(j));
            if (  listschool.get(j).get("school_name").toString().equals(school)  )
                key = j;
            System.out.println("key"+key);
        }
        for(int j = 0 ;j<qunzhongschool.size();j++) {
            //  System.out.println(listschool.get(j));
            if (  qunzhongschool.get(j).get("school").toString().equals(school)  )
                key2 = j;

        }
        try {
            int dangyuanlow = Integer.parseInt(listschool.get(key).get("dangyuanlow").toString());
            int dangyuanmiddle = Integer.parseInt(listschool.get(key).get("dangyuanmiddle").toString());
            int dangyuangood = Integer.parseInt(listschool.get(key).get("dangyuangood").toString());
            int qunzhonglow = Integer.parseInt(listschool.get(key).get("qunzhonglow").toString());
            int qunzhongmiddle = Integer.parseInt(listschool.get(key).get("qunzhongmiddle").toString());
            int qunzhonggood = Integer.parseInt(listschool.get(key).get("qunzhonggood").toString());
            int low = Integer.parseInt(listschool.get(key).get("low").toString());
            int middle = Integer.parseInt(listschool.get(key).get("middle").toString());
            int good = Integer.parseInt(listschool.get(key).get("good").toString());
            int contact = Integer.parseInt(listschool.get(key).get("contact").toString());
            int number = Integer.parseInt(qunzhongschool.get(key2).get("qunzhong").toString());

            String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(dangyuangood,dangyuanmiddle,dangyuanlow), PIE_WIDTH, PIE_HEIGHT, session);
            maphuping.put("fileNamePie1",fileNamePie1);
            String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(qunzhonggood,qunzhongmiddle,qunzhonglow), PIE_WIDTH, PIE_HEIGHT, session);
            maphuping.put("fileNamePie2",fileNamePie2);
            String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(good,middle,low), PIE_WIDTH, PIE_HEIGHT, session);
            maphuping.put("fileNamePie3",fileNamePie3);
            String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(contact,0,number-contact), PIE_WIDTH, PIE_HEIGHT, session);
            maphuping.put("fileNamePie4",fileNamePie4);
            maphuping.put("school",school);

            model.addAttribute("maphuping" ,maphuping);
        }catch(Exception e) {
            System.out.println("test?");
            System.out.println(e.fillInStackTrace());
        }
        Map<String,String> mapall = new HashMap<String, String>();
        try {
            int dangyuanlow = Integer.parseInt(listall.get(0).get("dangyuanlow").toString());
            int dangyuanmiddle = Integer.parseInt(listall.get(0).get("dangyuanmiddle").toString());
            int dangyuangood = Integer.parseInt(listall.get(0).get("dangyuangood").toString());
            int qunzhonglow = Integer.parseInt(listall.get(0).get("qunzhonglow").toString());
            int qunzhongmiddle = Integer.parseInt(listall.get(0).get("qunzhongmiddle").toString());
            int qunzhonggood = Integer.parseInt(listall.get(0).get("qunzhonggood").toString());
            int low = Integer.parseInt(listall.get(0).get("low").toString());
            int middle = Integer.parseInt(listall.get(0).get("middle").toString());
            int good = Integer.parseInt(listall.get(0).get("good").toString());
            int contact = Integer.parseInt(listall.get(0).get("contact").toString());
            int number = Integer.parseInt(qunzhongall.get(0).get("qunzhong").toString());

            String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(dangyuangood,dangyuanmiddle,dangyuanlow), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie1",fileNamePie1);
            String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(qunzhonggood,qunzhongmiddle,qunzhonglow), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie2",fileNamePie2);
            String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(good,middle,low), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie3",fileNamePie3);
            String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(contact,0,number-contact), PIE_WIDTH, PIE_HEIGHT, session);
            mapall.put("fileNamePie4",fileNamePie4);

            model.addAttribute("mapall" ,mapall);
        }catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }



        List<Map<String,String>> newlist = new ArrayList<Map<String, String>>();
        try {
            for(int i = 0 ;i<list.size();i++){
                Map<String,String> map = new HashMap<String, String>();

                Map<String, Object> map1 = list.get(i);
                Map<String, Object> map2 = qunzhong.get(i);
                for(int j = 0; j <qunzhong.size();j++)
                    if(qunzhong.get(j).get("branch").toString().equals(map1.get("branch_name").toString()) )
                        map2= qunzhong.get(j);

                //
                int dangyuanlow = Integer.parseInt(map1.get("dangyuanlow").toString());
                int dangyuanmiddle = Integer.parseInt(map1.get("dangyuanmiddle").toString());
                int dangyuangood = Integer.parseInt(map1.get("dangyuangood").toString());
                int qunzhonglow = Integer.parseInt(map1.get("qunzhonglow").toString());
                int qunzhongmiddle = Integer.parseInt(map1.get("qunzhongmiddle").toString());
                int qunzhonggood = Integer.parseInt(map1.get("qunzhonggood").toString());
                int low = Integer.parseInt(map1.get("low").toString());
                int middle = Integer.parseInt(map1.get("middle").toString());
                int good = Integer.parseInt(map1.get("good").toString());
                int contact = Integer.parseInt(map1.get("contact").toString());
                int number = Integer.parseInt(map2.get("qunzhong").toString());

                String fileNamePie1 = ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(dangyuangood,dangyuanmiddle,dangyuanlow), PIE_WIDTH, PIE_HEIGHT, session);
                System.out.println("what??"+good+"m"+middle+low);
                map.put("fileNamePie1",fileNamePie1);
                String fileNamePie2= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(qunzhonggood,qunzhongmiddle,qunzhonglow), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie2",fileNamePie2);
                String fileNamePie3= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(good,middle,low), PIE_WIDTH, PIE_HEIGHT, session);

                map.put("fileNamePie3",fileNamePie3);
                String fileNamePie4= ServletUtilities.saveChartAsPNG(ExcelImportUtil.GetAcaPieChart(contact,0,number-contact), PIE_WIDTH, PIE_HEIGHT, session);
                map.put("fileNamePie4",fileNamePie4);
                String branch = map1.get("branch_name").toString();
                map.put("branch", branch);




                //
                newlist.add(map);
            }
            model.addAttribute("newlist" ,newlist);
        }
        catch(Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        for (Map<String, String> m : newlist){
            for (String k : m.keySet()){
                System.out.println(k + " : " + m.get(k));
            }

        }

        return "yx_hp_index";
    }
    @RequestMapping({"/logout"})
    public String schoolziping() {
        return "index";

    }
    @RequestMapping({"/questionindex"})
    public String questionindex() {
        return "questionindex";

    }
}
