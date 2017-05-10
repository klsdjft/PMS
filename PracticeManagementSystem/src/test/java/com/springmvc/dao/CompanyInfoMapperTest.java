package com.springmvc.dao;

import com.springmvc.entity.CompanyInfo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liu on 2017/5/5.
 */
public class CompanyInfoMapperTest {

    private ApplicationContext applicationContext;
    @Autowired//autowired==自动装配
    private CompanyInfoMapper companyInfoMapper;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");//加载spring配置文件
        companyInfoMapper=applicationContext.getBean(CompanyInfoMapper.class);//在这里导入要测试的
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        CompanyInfo companyInfo=new CompanyInfo();
        companyInfo.setCid(100001);
        companyInfo.setCname("百度");
        companyInfo.setCpassword("baidu");
        companyInfo.setPraiserate(90);

        int result = companyInfoMapper.insertSelective(companyInfo);
        System.out.println(result);
        assert (result == 1);
    }

}