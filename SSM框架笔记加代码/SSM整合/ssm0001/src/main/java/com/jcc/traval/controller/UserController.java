package com.jcc.traval.controller;

import com.jcc.traval.entity.User;
import com.jcc.traval.service.IUserService;
import com.jcc.traval.vo.UserConditionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    IUserService userService ;

    @RequestMapping("/user/list")
    @ResponseBody
    public List<User> select(){
        return userService.list(new UserConditionVO()) ;
    }
}
