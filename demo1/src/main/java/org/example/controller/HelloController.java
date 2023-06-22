package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ZhangZengY
 * @Date 2023/5/26 21:35
 * @Package org.example.controller
 * @Project springMVC
 */
@Controller
public class HelloController {
    //@RequestMapping捕获地址栏的url是否与之对应
    @RequestMapping("/")
    public String index() {
        //返回视图名称,拼上前缀后缀找到对应的页面
        return "index";
    }

    @RequestMapping("/target")
    public String target() {
        //返回视图名称,拼上前缀后缀找到对应的页面
        return "target";
    }
}
