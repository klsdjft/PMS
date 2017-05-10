package com.springmvc.dao;

import com.springmvc.entity.TeacherInfo;

public interface TeacherInfoMapper {
    int deleteByPrimaryKey(Integer tnumber);

    int insert(TeacherInfo record);

    int insertSelective(TeacherInfo record);

    TeacherInfo selectByPrimaryKey(Integer tnumber);

    int updateByPrimaryKeySelective(TeacherInfo record);

    int updateByPrimaryKey(TeacherInfo record);

    int getCount();
}