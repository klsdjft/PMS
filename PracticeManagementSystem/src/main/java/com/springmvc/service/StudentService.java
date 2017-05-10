package com.springmvc.service;

import com.springmvc.dao.StudentInfoMapper;
import com.springmvc.entity.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by liu on 2017/5/6.
 */
@Service
public class StudentService {
    @Autowired
    private StudentInfoMapper studentInfoMapper;

    public int insert(StudentInfo studentInfo) {
        return studentInfoMapper.insertSelective(studentInfo);
    }


    public int deleteByPrimaryKey(Integer id) {
        return studentInfoMapper.deleteByPrimaryKey(id);
    }


    public StudentInfo selectByPrimaryKey(Integer id) {
        return studentInfoMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(StudentInfo record) {
        return studentInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(StudentInfo record) {
        return studentInfoMapper.updateByPrimaryKey(record);
    }

    public int getCount() {
        return studentInfoMapper.getCount();
    }

    public ArrayList<StudentInfo> selectSelective(StudentInfo record) {
        return studentInfoMapper.selectSelective(record);
    }

    public ArrayList<StudentInfo> selectLike(StudentInfo record) {
        return studentInfoMapper.selectLike(record);
    }

}
