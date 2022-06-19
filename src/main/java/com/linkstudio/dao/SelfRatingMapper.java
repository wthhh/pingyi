package com.linkstudio.dao;

import com.linkstudio.entity.SelfRating;

import java.util.List;
import java.util.Map;

public interface SelfRatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SelfRating record);

    int insertSelective(SelfRating record);
    List<Map<String,Object>> selectbyschool() ;
    List<Map<String,Object>> selectbyall() ;
    SelfRating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SelfRating record);

    int updateByPrimaryKey(SelfRating record);
    List<Map<String,Object>> selectbybranch(String school);

}