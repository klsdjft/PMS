package com.springmvc.controller;

import com.springmvc.entity.StudentInfo;
import com.springmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static com.springmvc.util.Encryption.MD5;

/**
 * Created by liu on 2017/5/6.
 */
@Controller
public class loginController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/pms/slogin", method = RequestMethod.GET)
    public String slogin() {
        return "./login/slogin";
    }

    //实现登录功能，将用户信息保存在session里面
    @RequestMapping(value = "/pms/slogin", method = RequestMethod.POST)
    public String slogin(HttpSession session, Model model, @ModelAttribute StudentInfo studentInfo) {
        List<StudentInfo> list =new ArrayList<StudentInfo>();
        StudentInfo record = new StudentInfo();
        record.setSnumber(studentInfo.getSnumber());
//        System.out.println("学号是："+record.getSnumber());
        list = studentService.selectSelective(record);
        if (list.size() == 0)
            model.addAttribute("result", "0");   //该账户不存在！
        else {
            record.setSpassword(MD5(studentInfo.getSpassword()));
            list = studentService.selectSelective(record);
            if (list.size() == 0)
                model.addAttribute("result", "1");   //密码错误！
            else {
                record = list.get(0);
                session.setAttribute("studentInfo", record);
                //将用户信息保存在session里面
                model.addAttribute("result", "2");   //登陆成功！
            }
        }
        return "./login/slogin";
    }
    //退出登录，注销账户
    @RequestMapping(value = "/pms/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.invalidate();
//        session.removeAttribute("user");
        return "./login/slogin";
    }

        @RequestMapping("/pms/clogin")
        public String clogin () {
            return "./login/clogin";
        }
        @RequestMapping("/pms/tlogin")
        public String tlogin () {
            return "./login/tlogin";
        }
    }

