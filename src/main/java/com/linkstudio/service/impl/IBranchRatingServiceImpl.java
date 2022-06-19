package com.linkstudio.service.impl;

import com.linkstudio.dao.BranchRatingMapper;
import com.linkstudio.entity.BranchRating;
import com.linkstudio.service.IBranchRatingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("BranchRatingService")
public class IBranchRatingServiceImpl implements IBranchRatingService {
    @Resource
    private BranchRatingMapper recordDao;

    public int insert(BranchRating record) {
        return recordDao.insert(record);
    }

    public BranchRating selectBykey(String stu_id) {
        return recordDao.selectBykey(stu_id);
    }

    public List<Map<String,Object>> selectbyschool() {
        return recordDao.selectbyschool();

    }
    public List<Map<String,Object>> selectbyall() {
        return recordDao.selectbyall();}

    public List<Map<String, Object>> selectbybranch(String school) {
        return recordDao.selectbybranch( school);
    }
}

