package com.springmvc.dao;

import com.springmvc.entity.CompanyInfo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CompanyInfoMapper {
    public int deleteByPrimaryKey(Integer cid);

    public int insert(CompanyInfo record);

    public int insertSelective(CompanyInfo record);

    public CompanyInfo selectByPrimaryKey(Integer cid);

    public  int updateByPrimaryKeySelective(CompanyInfo record);

    public int updateByPrimaryKey(CompanyInfo record);

    public int getCount();

    public  ArrayList<CompanyInfo> selectSelective(CompanyInfo companyInfo);

    public ArrayList<CompanyInfo> selectLike(CompanyInfo companyInfo);
}