package com.kayson.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author
 * @date 2020/9/27 - 19:33
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        //业务代码
        String result = "hellospringmvc";
        mv.addObject("msg",result);

        //视图跳转
        mv.setViewName("test");
        return mv;

    }
}
