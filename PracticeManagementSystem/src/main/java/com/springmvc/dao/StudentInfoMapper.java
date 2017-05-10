package com.springmvc.dao;

import com.springmvc.entity.StudentInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StudentInfoMapper {
    int deleteByPrimaryKey(Integer snumber);

    int insert(StudentInfo record);

    int insertSelective(StudentInfo record);

    StudentInfo selectByPrimaryKey(Integer snumber);

    int updateByPrimaryKeySelective(StudentInfo record);

    int updateByPrimaryKeyWithBLOBs(StudentInfo record);

    int updateByPrimaryKey(StudentInfo record);


    int getCount();

    ArrayList<StudentInfo> selectSelective(StudentInfo studentInfo);

    ArrayList<StudentInfo> selectLike(StudentInfo studentInfo);
}