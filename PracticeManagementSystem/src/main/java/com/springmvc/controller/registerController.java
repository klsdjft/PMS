package com.springmvc.controller;

import com.springmvc.entity.CompanyInfo;
import com.springmvc.entity.StudentInfo;
import com.springmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static com.springmvc.util.Encryption.MD5;


/**
 * Created by liu on 2017/5/6.
 */
@Controller
public class registerController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/pms/sregister",method = RequestMethod.GET)
    public String tosregister(){
        return "register/sregister";
    }
    @RequestMapping(value = "/pms/sregister",method = RequestMethod.POST)
    public String insertStudent(@ModelAttribute StudentInfo studentInfo, Model model){

            StudentInfo record = new StudentInfo();
            record.setSname(studentInfo.getSname());
            record.setSnumber(studentInfo.getSnumber());
            record.setSsex(studentInfo.getSsex());
            record.setSmajor(studentInfo.getSmajor());
            List<StudentInfo> list =studentService.selectSelective(record);
            if (list.size() == 0) {
                studentInfo.setSpassword(MD5(studentInfo.getSpassword()));   //安全性保证，加密用户密码
                if (studentService.insert(studentInfo) == 1)
                    model.addAttribute("result", 1);  //注册成功
                else
                    model.addAttribute("result", 0);  //未知错误，注册失败
            } else {
                model.addAttribute("result", 2);  //该账号已有人注册！
            }
        return "register/sregister";
    }
    @RequestMapping(value = "pms/cregister",method = RequestMethod.GET)
    public String tocregister(){
        return "register/cregister";
    }
    @RequestMapping(value = "pms/cregister",method = RequestMethod.POST)
    public String insertComany(@ModelAttribute CompanyInfo companyInfo,Model model){
        CompanyInfo record=new CompanyInfo();
        record.setCname(companyInfo.getCname());
        record.setCpassword(MD5(companyInfo.getCpassword()));
        record.s


        return "register/cregister";
    }
    @RequestMapping(value = "pms/tregister",method = RequestMethod.GET)
    public String totregister(){
        return "register/tregister";
    }
    @RequestMapping(value = "pms/tregister",method = RequestMethod.POST)
    public String insertTeacher(){
        return "register/tregister";
    }
}
