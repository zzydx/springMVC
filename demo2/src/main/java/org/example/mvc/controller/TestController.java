package org.example.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ZhangZengY
 * @Date 2023/5/27 19:13
 * @Package org.example.mvc.controller
 * @Project springMVC
 */
@Controller
public class TestController {
    @RequestMapping("/error")
    public String index(){
        int s = 10 / 0;
        return "success";
    }
}
