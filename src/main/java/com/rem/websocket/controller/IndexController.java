package com.rem.websocket.controller;

import com.rem.websocket.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @RequestMapping("/zs")
    String index(ModelMap map) {
        List<User> users = new ArrayList<>();
        users.add(new User(2,"李四"));
        users.add(new User(3,"王五"));
        map.put("users",users);
        map.put("user",new User(1,"张三"));
        return "index";
    }

    @RequestMapping("/ls")
    String index2(ModelMap map) {
        List<User> users = new ArrayList<>();
        users.add(new User(1,"张三"));
        users.add(new User(3,"王五"));
        map.put("users",users);
        map.put("user",new User(2,"李四"));
        return "index";
    }
}
