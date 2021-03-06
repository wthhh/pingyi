//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.linkstudio.controller;

import com.linkstudio.entity.Student;
import com.linkstudio.service.IStudentService;
import com.linkstudio.util.ExcelImportUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping({""})
public class InfoController {
    @Resource
    private IStudentService studentService;

    public InfoController() {
    }

    @RequestMapping({"/info"})
    public String getStu(Model model) {
        List<Student> liststu = this.studentService.selectAll();
        model.addAttribute("stu", liststu);
        return "test";
    }
    @RequestMapping({"/infoimport"})
    public String Front(Model model) {
        //List<Student> liststu = this.studentService.selectAll();
        //model.addAttribute("stu", liststu);
        return "excelimport";
    }

    @RequestMapping(
            value = {"/adminindex"},
            method = {RequestMethod.POST}
    )
    public String Adminindex(@RequestParam String id,@RequestParam String password,Model model) {
        //List<Student> liststu = this.studentService.selectAll();
        //model.addAttribute("stu", liststu);
        System.out.println(id);
        if(id.equals("adminlink") && password.equals("ysx666")) {
            List<Student> liststu = this.studentService.selectAll();
            model.addAttribute("stu", liststu);
            return "adminindex";
        }
        else
            return  "error";
    }
    @RequestMapping(
            value = {"/adminindex"},
            method = {RequestMethod.GET}
    )
    public String Adminlogined() {
        //List<Student> liststu = this.studentService.selectAll();
        //model.addAttribute("stu", liststu);
        return  "adminindex";
    }

    @RequestMapping({"/adminlogin"})
    public String Adminlogin(Model model) {
        //List<Student> liststu = this.studentService.selectAll();
        //model.addAttribute("stu", liststu);
        return "adminlogin";
    }

    @RequestMapping(value = "/import")
   // @ResponseBody
    public String importExcel(@RequestParam(value = "file") MultipartFile excelFile,
                              HttpServletRequest request) throws  IOException
    {
        if (null == excelFile) {

            return "excelimport";
        }

//      String path = request.getSession().getServletContext().getRealPath("demo2");

        String path = "/resource";
        //????????????
        File dir = new File(path);
        if(!dir.exists()) {
            dir.mkdirs();
        }
        String fileName = excelFile.getOriginalFilename();//report.xls
        String fileName2 = excelFile.getName();//excelFile

        InputStream fis = excelFile.getInputStream();

        List<Map<String, String>>  data = ExcelImportUtil.parseExcel(fis);
        Student stu = new Student();
        for (Map<String, String> m : data)
        {
            for (String k : m.keySet())
            {
                System.out.println(k + " : " + m.get(k));
                if(k.equals("??????"))
                    stu.setName(m.get(k));
                if(k.equals("??????"))
                    stu.setStuId(m.get(k));
                if(k.equals("??????"))
                    stu.setSchool(m.get(k));
                if(k.equals("??????"))
                    stu.setBranch(m.get(k));
                if(k.equals("??????")) {
                    short i = 2;
                    if((m.get(k).equals("??????")||(m.get(k).equals("??????????????????")))) {

                        i = 1;
                        stu.setIdentity(i);
                    }
                    else
                    {
                        i = 2;
                        stu.setIdentity(i);
                    }

                    }
                if(k.equals("??????"))
                    stu.setDuty(m.get(k));
               // System.out.println(stu.getName());
            }
            short j = 0 ;
            stu.setState(j);
            stu.setCompleteTime(new Date());
            System.out.println(studentService.insertSelective(stu));

        }
        //?????????????????????????????????????????????????????????????????????
        return "success";
    }
}
