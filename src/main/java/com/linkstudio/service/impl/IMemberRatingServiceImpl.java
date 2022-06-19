package com.linkstudio.service.impl;

import com.linkstudio.dao.MemberRatingMapper;
import com.linkstudio.entity.MemberRating;
import com.linkstudio.service.IMemberRatingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by daisuyang on 2017/8/31.
 */
@Service("MemberRatingService")
public class IMemberRatingServiceImpl implements IMemberRatingService {
    @Resource
    private MemberRatingMapper memberDAO;
    public int insert(MemberRating memberRating) {
        memberDAO.insert(memberRating);
        return 0;
    }

    public List<Map<String,Object>> selectbyschool() {
        return memberDAO.selectbyschool();}
    public List<Map<String,Object>> selectbyall() {
        return memberDAO.selectbyall();}

    public List<Map<String, Object>> selectbybranch(String school) {
        return memberDAO.selectbybranch(school);
    }
}
