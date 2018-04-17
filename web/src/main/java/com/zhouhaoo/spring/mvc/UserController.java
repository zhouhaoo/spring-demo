package com.zhouhaoo.spring.mvc;

import com.zhouhaoo.spring.domain.Skills;
import com.zhouhaoo.spring.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Controller层
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public List<Skills> query(@RequestParam int page, @RequestBody String aaa) {
        List<Skills> skills = userService.skillData();
        return skills;
    }

    @RequestMapping("/query2")
    @ResponseBody
    public Skills query(@RequestParam int skillID) {
        try {
            return userService.skillData(skillID);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
