package com.kayson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author
 * @date 2020/10/13 - 19:02
 */
@Controller
public class HelloController {

    @RequestMapping("/01")
    public String sayHello(Model model){
        model.addAttribute("msg","hello,spring-annotation");
        return "test";
    }

}
