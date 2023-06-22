package org.example.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author ZhangZengY
 * @Date 2023/6/2 22:56
 * @Package org.example.mvc.controller
 * @Project springMVC
 */
@ControllerAdvice
public class errorController {
    @ExceptionHandler()
    public String errorTest(Exception e, Model model) {
        model.addAttribute("ex",e);
        return "error";
    }
}
