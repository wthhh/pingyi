package com.linkstudio.service;

import com.linkstudio.entity.MemberRating;

import java.util.List;
import java.util.Map;

public interface IMemberRatingService {
    public int insert(MemberRating memberRating);

  public  List<Map<String,Object>> selectbyschool();
    public List<Map<String,Object>> selectbyall();

    public List<Map<String,Object>> selectbybranch(String school);
}
