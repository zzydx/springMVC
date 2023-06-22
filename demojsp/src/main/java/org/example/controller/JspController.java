package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ZhangZengY
 * @Date 2023/5/30 17:29
 * @Package org.example.controller
 * @Project springMVC
 */
@Controller
public class JspController {
    @RequestMapping("/success")
    public String success() {
        return "success";
    }
}
