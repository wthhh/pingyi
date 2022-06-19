package com.linkstudio.service;

import com.linkstudio.entity.BranchRating;

import java.util.List;
import java.util.Map;

public interface IBranchRatingService {

    public int insert(BranchRating record);

    public BranchRating selectBykey(String stu_id);

    public List<Map<String,Object>> selectbyschool();
    public List<Map<String,Object>> selectbyall();


    public List<Map<String,Object>> selectbybranch(String school);
}


