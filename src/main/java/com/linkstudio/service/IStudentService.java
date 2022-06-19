package com.linkstudio.service;

import com.linkstudio.entity.Student;

import java.util.List;
import java.util.Map;

public interface IStudentService {

    public Student getStudentById(int stuId);

    public Student getStudentByStuId(String stuId);

    public List<Student> selectAll();

    public List<Student> getStudentByBranch(String branch);

    public List<Student> getDangyuanByBranch(String branch);

    public int updateByPrimaryKey(Student stu);

    public int insertSelective(Student stu);
    public List<Map<String,Object>> selectbyall();

    public List<Map<String,Object>> selectbybranchall(String school);

    public List<Map<String,Object>> selectbyschoolall();
    public List<Map<String,Object>> countbybranchall(String school);
    public List<Map<String,Object>> countqunzhongbyschoolall();
    public List<Map<String,Object>> countqunzhongbyall();
}


