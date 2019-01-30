package com.jxtb.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jxtb on 2019/1/30.
 */
@RestController
public class UserController {

    //http://localhost:8764/hiUser?name=jxtb
    @RequestMapping("/hiUser")
    public String home(@RequestParam String name) {
        return "你好 "+name+",我来自-port:service-user";
    }
}
