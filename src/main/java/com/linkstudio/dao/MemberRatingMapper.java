package com.linkstudio.dao;

import com.linkstudio.entity.MemberRating;

import java.util.List;
import java.util.Map;

public interface MemberRatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MemberRating record);



    MemberRating selectByPrimaryKey(Integer id);



    int updateByPrimaryKey(MemberRating record);
    List<Map<String,Object>> selectbyschool() ;
    List<Map<String,Object>> selectbyall() ;

    List<Map<String,Object>> selectbybranch(String school);
}