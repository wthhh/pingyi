package com.linkstudio.service.impl;

import com.linkstudio.dao.StudentMapper;
import com.linkstudio.entity.Student;
import com.linkstudio.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("studentService")
public class IStudentServiceImpl implements IStudentService {
    @Resource
    private StudentMapper stuDao;

    public Student getStudentById(int stuId) {
        return stuDao.selectByPrimaryKey(stuId);
    }

    public Student getStudentByStuId(String stuId) {
        return stuDao.selectByStuId(stuId);
    }
    public List<Student> selectAll() {
        return stuDao.selectAll();
    }

    public List<Student> getStudentByBranch(String branch) {
        return stuDao.selectByBranch(branch);
    }

    public List<Student> getDangyuanByBranch(String branch) {
        return stuDao.selectDangyuanByBranch(branch);
    }

    public int updateByPrimaryKey(Student stu) {
        return stuDao.updateByPrimaryKey(stu);

    }

    public int insertSelective(Student stu) {
        return stuDao.insertSelective(stu);

    }
    public List<Map<String,Object>> selectbyall() {
        return stuDao.selectbyall();}
    public List<Map<String,Object>> selectbyschoolall() {
        return stuDao.selectbyschoolall();}

    public List<Map<String, Object>> selectbybranchall(String school) {
        return stuDao.selectbybranchall(school);}
    public List<Map<String, Object>> countbybranchall(String school) {
        return stuDao.countbybranchall(school);}
    public List<Map<String, Object>> countqunzhongbyall() {
        return stuDao.countqunzhongbyall();}
    public List<Map<String, Object>> countqunzhongbyschoolall() {
        return stuDao.countqunzhongbyschoolall();}
}
