package com.linkstudio.dao;

import com.linkstudio.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student stu);

    List<Student> selectAll();

    List<Student> selectByBranch(String branch);

    List<Student> selectDangyuanByBranch(String branch);
    
    Student selectByStuId(String stuid);

    List<Map<String,Object>> selectbyall() ;
    List<Map<String,Object>> selectbyschoolall() ;
    List<Map<String,Object>> selectbybranchall(String branch) ;
    List<Map<String,Object>> countbybranchall(String school) ;
    List<Map<String,Object>> countqunzhongbyall() ;
    List<Map<String,Object>> countqunzhongbyschoolall() ;
}