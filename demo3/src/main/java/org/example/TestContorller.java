package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ZhangZengY
 * @Date 2023/6/3 19:25
 * @Package org.example
 * @Project springMVC
 */
@Controller
public class TestContorller {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
