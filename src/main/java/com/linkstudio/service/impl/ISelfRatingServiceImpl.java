package com.linkstudio.service.impl;


import com.linkstudio.dao.SelfRatingMapper;
import com.linkstudio.entity.SelfRating;
import com.linkstudio.service.ISelfRatingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("SelfRatingService")
public class ISelfRatingServiceImpl implements ISelfRatingService {
    @Resource
    private SelfRatingMapper recordDao;

    public int insert(SelfRating record) {
        return recordDao.insert(record);
    }
    public List<Map<String,Object>> selectbyschool() {
        return recordDao.selectbyschool();}
    public List<Map<String,Object>> selectbyall() {
        return recordDao.selectbyall();}

    public List<Map<String, Object>> selectbybranch(String school) {
        return recordDao.selectbybranch( school);
    }
}
