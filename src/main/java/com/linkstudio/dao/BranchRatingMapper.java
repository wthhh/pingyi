package com.linkstudio.dao;

import com.linkstudio.entity.BranchRating;

import java.util.List;
import java.util.Map;

public interface BranchRatingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BranchRating record);

    int insertSelective(BranchRating record);

    BranchRating selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BranchRating record);

    int updateByPrimaryKey(BranchRating record);

    BranchRating selectBykey(String stu_id);
    List<Map<String,Object>> selectbyschool() ;
    List<Map<String,Object>> selectbyall() ;

    List<Map<String,Object>> selectbybranch(String school);
}