package com.linkstudio.dao;

import com.linkstudio.entity.BranchInfo;

public interface BranchInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BranchInfo record);

    int insertSelective(BranchInfo record);

    BranchInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BranchInfo record);

    int updateByPrimaryKey(BranchInfo record);
}