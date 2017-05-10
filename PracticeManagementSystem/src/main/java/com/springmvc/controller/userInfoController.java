package com.springmvc.controller;

import com.springmvc.entity.StudentInfo;
import com.springmvc.service.StudentService;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by liu on 2017/5/6.
 */
@Controller
public class userInfoController {

    @Autowired
    private StudentService studentService;


    @RequestMapping(value = "/pms/studentInfo", method = RequestMethod.GET)
    public String toInfo(Model model, HttpSession session) {
        StudentInfo studentInfo = (StudentInfo) session.getAttribute("studentInfo");
        studentInfo.setSprofile(((StudentInfo)studentService.selectByPrimaryKey(studentInfo.getSnumber())).getSprofile());
//        System.out.println("1111"+((StudentInfo)studentService.selectByPrimaryKey(studentInfo.getSnumber())).getSprofile());
        if (studentInfo != null)
            model.addAttribute("studentInfo",studentInfo);
        return "./userInfo/studentInfo";
    }

    @RequestMapping(value = "/pms/studentInfo",method = RequestMethod.POST)
    public String editsprofile(HttpSession session, @ModelAttribute StudentInfo studentInfo, Model model ){
//        session里面存的是之前的，studentInfo是之后的（新的Sprofile）。
        StudentInfo studentInfo1 = (StudentInfo) session.getAttribute("studentInfo");
//        System.out.println(studentInfo1.getSname());
//        System.out.println(studentInfo1.getSnumber());
//        System.out.println(studentInfo1.getSmajor());
//
//        System.out.println(studentInfo1.getSprofile());

        //把Sprifile更新
        studentInfo1.setSprofile(studentInfo.getSprofile());
        studentInfo=studentInfo1;
        studentService.updateByPrimaryKeySelective(studentInfo);

        if (studentInfo != null)
            model.addAttribute("studentInfo",studentInfo);
//        if(studentService.updateByPrimaryKeySelective(studentInfo)==1)
//        System.out.print("insert ok");
//        else
//        System.out.print("insert error");
        return "./userInfo/studentInfo";
    }


}
