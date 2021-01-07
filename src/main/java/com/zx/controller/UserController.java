package com.zx.controller;

import com.zx.bean.ZxUser;
import com.zx.dao.ZxUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private ZxUserDao zxUserDao;

    @RequestMapping(value = "/user_all")
    public String getAllUsers(Model model){
        List<ZxUser> usrs = zxUserDao.getUsrs();


        for (ZxUser usr : usrs) {
            System.out.println(usr);
        }


        model.addAttribute("msg", usrs.get(0).getZxName());

        return "user";
    }

}
