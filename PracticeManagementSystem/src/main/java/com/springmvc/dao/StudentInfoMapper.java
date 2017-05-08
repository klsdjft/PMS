package com.springmvc.dao;

import com.springmvc.entity.StudentInfo;

public interface StudentInfoMapper {
    int deleteByPrimaryKey(Integer snumber);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer snumber);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);
}