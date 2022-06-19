package com.linkstudio.service;

import com.linkstudio.entity.SelfRating;

import java.util.List;
import java.util.Map;

public interface ISelfRatingService {

    public int insert(SelfRating record);

    public List<Map<String,Object>> selectbyschool();
    public List<Map<String,Object>> selectbyall();


   public List<Map<String,Object>> selectbybranch(String school);
}


