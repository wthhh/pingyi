package com.linkstudio.controller;

import com.alibaba.fastjson.JSONObject;
import com.linkstudio.entity.BranchRating;
import com.linkstudio.entity.MemberRating;
import com.linkstudio.entity.SelfRating;
import com.linkstudio.entity.Student;
import com.linkstudio.service.IBranchRatingService;
import com.linkstudio.service.IMemberRatingService;
import com.linkstudio.service.ISelfRatingService;
import com.linkstudio.service.IStudentService;
import com.linkstudio.util.CommonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

@Controller
@SessionAttributes({"stu", "hupinglst","branchrecord"})
@RequestMapping({""})
public class StudentController {
    @Resource
    private IStudentService studentService;
    @Resource
    private IBranchRatingService branchRatingService;
    @Resource
    private ISelfRatingService selfRatingService;

    public StudentController() {
    }

    @RequestMapping(
            value = {"/stulogin"},
            method = {RequestMethod.GET}
    )
    public String loginstu() {
        return "stulogin";
    }


    @RequestMapping(
            value = {"/welcome"},
            method = {RequestMethod.GET}
    )
    public String welcome(@RequestParam String code, Model model, HttpServletRequest request) {
        String ServerID = "b30379a5-cebf-468e-9120-0ed974b3e604";
        String ServerSecret = "5qoCR!ZS?xpI";

        // String redirect_uri = "http://pingyi.fudan.edu.cn/welcome";
        String tokenacess = "https://tac.fudan.edu.cn/oauth2/token.act";
        String userinfoacess = "https://tac.fudan.edu.cn/resource/userinfo.act?access_token=";

        String UrltoGetToken = tokenacess
                + "?client_id="
                + ServerID
                + "&client_secret="
                + ServerSecret
                + "&redirect_uri=http://pingyi.fudan.edu.cn/welcome&grant_type=authorization_code&code="
                + code;
        try {
            StringBuffer sBuffer = CommonUtil.getWebContent(UrltoGetToken);
            JSONObject jsonObject = JSONObject.parseObject(sBuffer.toString());
            String tokenString = jsonObject.getString("access_token");
            StringBuffer tBuffer = CommonUtil.getWebContent(userinfoacess
                    + tokenString);

            JSONObject jsonObject1 = JSONObject.parseObject(tBuffer.toString());
            String id = jsonObject1.getString("user_id");
            Student stu = this.studentService.getStudentByStuId(id);
            if (stu == null) {
                //request.setAttribute("alert", "alert");
                return "redirect:/?alert=alert";
            }
            System.out.println(id);
            model.addAttribute("stu", stu);
            return "redirect:hello";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("222222222");
            System.out.println(e);
            e.printStackTrace();
            return "redirect:helloworld";
        }
    }


    @RequestMapping(
            value = {"/findStu"},
            method = {RequestMethod.POST}
    )
    public String getStu(@RequestParam int id, Model model) {
        model.addAttribute("stu", this.studentService.getStudentById(id));
        return "helloworld";
    }

    @RequestMapping({"/hello"})
    public String Hello() {
        return "helloworld";
    }

    @RequestMapping({"/index"})
    public String Index() {
        return "index";
    }

    @RequestMapping(
            value = {"/zhibu"},
            method = {RequestMethod.GET}
    )
    public String zhibu(Model model, @ModelAttribute("stu") Student stu) {
        return "zhibu";
    }

/*    @RequestMapping({"/zhibupingyi"})
    public String huping(Model model, @ModelAttribute("stu") Student stu) {
        List<Student> students = studentService.getStudentByBranch(stu.getBranch());
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(stu.getId()))
                index = i;
        }

        System.out.println(index);
        students.remove(index);
        model.addAttribute("students",students);
        return "huping";
    }*/

    @RequestMapping({"/ziping"})
    public String ziping() {
        return "ziping";
    }

    @RequestMapping(
            value = {"/zhibupingyi"},
            method = {RequestMethod.POST}
    )
    public String zhibupingyi(Model model, BranchRating record, @ModelAttribute("stu") Student stu) {
        record.setStuId(stu.getStuId());
        record.setBranchName(stu.getBranch());
        record.setSchoolName(stu.getSchool());
        record.getScoreQ1();
        record.getScoreQ2();
        record.getScoreQ3();
        record.getScoreQ4();
        record.getScoreQ5();
        record.getScoreQ6();
        record.getScoreQ7();
        record.getScoreQ8();
        record.getScoreQ9();
        Date date = new Date();
        record.setTime(date);
        //this.branchRatingService.insert(record);
        model.addAttribute("branchrecord", record);

        System.out.println("what????"+record.getScoreQ1()+"zhibu");

       List<Student> students = studentService.getDangyuanByBranch(stu.getBranch());
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(stu.getId()))
                index = i;
        }

        System.out.println(index);




        if(index != -1) {
            students.remove(index);
        }
        model.addAttribute("students",students);

        return "huping";
    }

    @RequestMapping(
            value = {"/dangyuanziping"},
            method = {RequestMethod.POST}
    )
    public String dangyuanziping( SelfRating selfrecord, Model model,HttpServletRequest request,
                                 @ModelAttribute("stu") Student stu
            ,@ModelAttribute("hupinglst" )List<MemberRating> memberrecord) {
        selfrecord.setStuId(stu.getStuId());
        selfrecord.setBranchName(stu.getBranch());
        selfrecord.setSchoolName(stu.getSchool());
        selfrecord.setScoreQ1(selfrecord.getScoreQ1());
        selfrecord.getScoreQ2();
        selfrecord.getScoreQ3();
        selfrecord.getScoreQ4();
        selfrecord.getScoreQ5();

        Date date = new Date();
        selfrecord.setTime(date);
        HttpSession session = request.getSession();
        BranchRating record = (BranchRating)session.getAttribute("branchrecord");
        this.branchRatingService.insert(record);
        if(stu.getIdentity().intValue() == 1)
            this.selfRatingService.insert(selfrecord);

        System.out.println("what??123?"+record.getScoreQ1()+"ziping");
        //this.branchRatingService.insert(branchrecord);

        for (int i=0; i<memberrecord.size();i++) {

            this.memberRatingService.insert(memberrecord.get(i));

        }



            short i = 1;
            stu.setState(i);

            stu.setCompleteTime(new Date());
            this.studentService.updateByPrimaryKey(stu);

        return "ziping";
    }

    @Resource
    private IMemberRatingService memberRatingService;

    @RequestMapping(value = "/huping",method = RequestMethod.POST)
    public String dangyuanhuping(HttpServletRequest request, Model model, @ModelAttribute("stu") Student stu) {
        List<MemberRating> hupinglst = new ArrayList<MemberRating>();
        Enumeration enumeration = request.getParameterNames();
        MemberRating memberRating = null;
        for (Enumeration e = enumeration; e.hasMoreElements(); ) {
            String name = e.nextElement().toString();
            System.out.println(name);
            Integer index = name.indexOf("_");
            String prefix = name.substring(0, index);
            String stuId = name.substring(index+1);
            if (prefix.equals("item")) {
                if (memberRating != null) {
                    hupinglst.add(memberRating);
                    //memberRatingService.insert(memberRating);
                }

                memberRating = new MemberRating();
                memberRating.setIsContact(Short.parseShort("0"));
                memberRating.setIsWorst(Short.parseShort("0"));
                memberRating.setIsBest(Short.parseShort("0"));
                memberRating.setStuIdRating(stu.getStuId());
                memberRating.setStuIdRated(stuId);
                memberRating.setBranchName(stu.getBranch());
                memberRating.setSchoolName(stu.getSchool());
                memberRating.setIden(stu.getIdentity());
                String value = request.getParameter(name).toString();
                System.out.println("best: "+request.getParameter(name).toString());
                memberRating.setScore(value);

                memberRating.setTime(new Date());
            }
            else if (prefix.equals("best")) {
                System.out.println("best: "+request.getParameter(name).toString());
                Short value = Short.parseShort(request.getParameter(name).toString());
                memberRating.setIsBest(value);
            }
            else if (prefix.equals("worst")) {
                System.out.println("worst: "+request.getParameter(name).toString());
                Short value = Short.parseShort(request.getParameter(name).toString());
                memberRating.setIsWorst(value);
            }
            else if (prefix.equals("contact")) {
                System.out.println("contact: "+request.getParameter(name).toString());
                Short value = Short.parseShort(request.getParameter(name).toString());
                memberRating.setIsContact(value);
            }
        }
        if (memberRating != null) {
            hupinglst.add(memberRating);
            //memberRatingService.insert(memberRating);s
        }

        if(stu.getIdentity().intValue() == 2) {
            HttpSession session = request.getSession();
            BranchRating record = (BranchRating)session.getAttribute("branchrecord");
            for (int i=0; i<hupinglst.size();i++) {

                this.memberRatingService.insert(hupinglst.get(i));

            }
            this.branchRatingService.insert(record);
            short i = 1;
            stu.setState(i);

            stu.setCompleteTime(new Date());
            this.studentService.updateByPrimaryKey(stu);
        }
        model.addAttribute("hupinglst",hupinglst);
        return "ziping";
    }
}
