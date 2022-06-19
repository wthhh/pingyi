package com.linkstudio.controller;


import com.linkstudio.service.IBranchRatingService;
import com.linkstudio.service.ISelfRatingService;
import com.linkstudio.service.IStudentService;
import com.linkstudio.util.EncodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes({"stu", "record", "mapall"})
@RequestMapping({""})
public class FrontController {
    @Resource
    private IStudentService studentService;
    @Resource
    private IBranchRatingService branchRatingService;
    @Resource
    private ISelfRatingService selfRatingService;

    public FrontController() {
    }

    @RequestMapping({"/"})
    public String front(Model model) {
        List<Map<String, Object>> list = this.studentService.selectbyschoolall();
        model.addAttribute("list", list);
        List<Map<String, Object>> listall = this.studentService.selectbyall();
        try {
            Map<String, String> mapall = new HashMap<String, String>();
            String tempall = listall.get(0).get("dangyuandone").toString();
            int numberdangyuandoneall = Integer.parseInt(tempall);
            tempall = listall.get(0).get("alldone").toString();
            int numberalldoneall = Integer.parseInt(tempall);
            tempall = listall.get(0).get("dangyuan").toString();
            int numberdangyuanall = Integer.parseInt(tempall);
            tempall = listall.get(0).get("zong").toString();
            int numberallall = Integer.parseInt(tempall);
            double percentall = 0;
            if (numberdangyuanall != 0) {
                percentall = numberdangyuandoneall * 1.0 / numberdangyuanall;
            } else {
                percentall = 1;
            }


            double perall = (numberalldoneall) * 1.0 / numberallall;
            percentall = percentall > 1 ? 1 : percentall;
            perall = perall > 1 ? 1 : perall;
            DecimalFormat dfall = new DecimalFormat("##%");
            String percentofdangyuanall = dfall.format(percentall);
            String percentofallall = dfall.format(perall);
            mapall.put("percentofdangyuan", percentofdangyuanall);
            mapall.put("percentofall", percentofallall);
            model.addAttribute("mapall", mapall);


            List<Map<String, String>> newlist = new ArrayList<Map<String, String>>();

            for (int i = 0; i < list.size(); i++) {
                Map<String, String> map = new HashMap<String, String>();
                Map<String, Object> map1 = list.get(i);


                String school = map1.get("school").toString();

                String tmp = map1.get("dangyuandone").toString();
                int numberdangyuandone = Integer.parseInt(tmp);
                tmp = map1.get("alldone").toString();
                int numberalldone = Integer.parseInt(tmp);
                tmp = map1.get("dangyuan").toString();
                int numberdangyuan = Integer.parseInt(tmp);
                tmp = map1.get("zong").toString();
                int numberall = Integer.parseInt(tmp);


                double percent;
                if (numberdangyuan != 0) {
                    percent = numberdangyuandone * 1.0 / numberdangyuan;
                } else {
                    percent = 1;
                }
                double per = (numberalldone) * 1.0 / numberall;
                percent = percent > 1 ? 1 : percent;
                per = per > 1 ? 1 : per;
                DecimalFormat df = new DecimalFormat("##%");
                String percentofdangyuan = df.format(percent);
                String percentofall = df.format(per);
                map.put("school", school);
                map.put("percentofdangyuan", percentofdangyuan);
                map.put("percentofall", percentofall);
                //
                newlist.add(map);
            }
            model.addAttribute("newlist", newlist);


            for (Map<String, String> m : newlist) {
                for (String k : m.keySet()) {
                    System.out.println(k + " : " + m.get(k));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "index";//跳到index.jsp
    }


    @RequestMapping({"/school"})
    public String schoolfront(@RequestParam String school, Model model, @ModelAttribute("mapall") Map<String, String> mapall) {
        school = EncodeUtil.encodeStr(school);
        System.out.println(school);
        System.out.println("asd");
        List<Map<String, Object>> list = this.studentService.selectbybranchall(school);
        List<Map<String, Object>> listall = this.studentService.selectbyschoolall();

        int key = 0;
        for (int j = 0; j < listall.size(); j++) {

            if (listall.get(j).get("school").toString().equals(school))
                key = j;
        }

        // System.out.println(listall.get(key).get("school").toString());
        Map<String, String> mapschool = new HashMap<String, String>();
        String tempall = listall.get(key).get("dangyuandone").toString();
        int numberdangyuandoneall = Integer.parseInt(tempall);
        tempall = listall.get(key).get("alldone").toString();
        int numberalldoneall = Integer.parseInt(tempall);
        tempall = listall.get(key).get("dangyuan").toString();
        int numberdangyuanall = Integer.parseInt(tempall);
        tempall = listall.get(key).get("zong").toString();
        int numberallall = Integer.parseInt(tempall);
        double percentall = numberdangyuandoneall * 1.0 / numberdangyuanall;
        double perall = (numberalldoneall) * 1.0 / numberallall;
        percentall = percentall > 1 ? 1 : percentall;
        perall = perall > 1 ? 1 : perall;
        DecimalFormat dfall = new DecimalFormat("##%");
        String percentofdangyuanall = dfall.format(percentall);
        String percentofallall = dfall.format(perall);
        mapschool.put("percentofdangyuan", percentofdangyuanall);
        mapschool.put("percentofall", percentofallall);
        mapschool.put("school", school);

        model.addAttribute("mapschool", mapschool);
        List<Map<String, String>> newlist = new ArrayList<Map<String, String>>();

        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = new HashMap<String, String>();
            Map<String, Object> map1 = list.get(i);


            String branch = map1.get("branch").toString();

            String tmp = map1.get("dangyuandone").toString();
            int numberdangyuandone = Integer.parseInt(tmp);
            tmp = map1.get("alldone").toString();
            int numberalldone = Integer.parseInt(tmp);
            tmp = map1.get("dangyuan").toString();
            int numberdangyuan = Integer.parseInt(tmp);
            tmp = map1.get("zong").toString();
            int numberall = Integer.parseInt(tmp);

            double percent = numberdangyuandone * 1.0 / numberdangyuan;
            double per = (numberalldone) * 1.0 / numberall;
            percent = percent > 1 ? 1 : percent;
            per = per > 1 ? 1 : per;
            DecimalFormat df = new DecimalFormat("##%");
            String percentofdangyuan = df.format(percent);
            String percentofall = df.format(per);
            //  System.out.println(branch);
            //  System.out.println(branch);System.out.println(branch);
            map.put("branch", branch);
            map.put("percentofdangyuan", percentofdangyuan);
            map.put("percentofall", percentofall);
            //
            newlist.add(map);
        }
        model.addAttribute("newlist", newlist);


        for (Map<String, String> m : newlist) {
            for (String k : m.keySet()) {
                System.out.println(k + " : " + m.get(k));
            }

        }

        return "yx_index";//跳到index.jsp
    }

}