package com.springmvc.service;

import com.springmvc.dao.CompanyInfoMapper;
import com.springmvc.entity.CompanyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by liu on 2017/5/10.
 */

@Service
public class CompanyService {
    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    public int insert(CompanyInfo companyInfo) {
        return companyInfoMapper.insertSelective(companyInfo);
    }


    public int deleteByPrimaryKey(Integer id) {
        return companyInfoMapper.deleteByPrimaryKey(id);
    }


    public CompanyInfo selectByPrimaryKey(Integer id) {
        return companyInfoMapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(CompanyInfo record) {
        return companyInfoMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CompanyInfo record) {
        return companyInfoMapper.updateByPrimaryKey(record);
    }

    public int getCount() {
        return companyInfoMapper.getCount();
    }

    public ArrayList<CompanyInfo> selectSelective(CompanyInfo record) {
        return companyInfoMapper.selectSelective(record);
    }

    public ArrayList<CompanyInfo> selectLike(CompanyInfo record) {
        return companyInfoMapper.selectLike(record);
    }

}
