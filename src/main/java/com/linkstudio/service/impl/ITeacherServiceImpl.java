package com.linkstudio.service.impl;

import com.linkstudio.dao.TeacherMapper;
import com.linkstudio.entity.Teacher;
import com.linkstudio.service.ITeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("teacherService")
public class ITeacherServiceImpl implements ITeacherService {
    @Resource
    private TeacherMapper teacherDao;


    public Teacher getteacherById(String tchrid) {
        return teacherDao.selectByKey(tchrid);
    }
}
