package com.xbsj.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse rep) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");   //视图名
        mv.addObject("msg","Hello Spring MVC !!!");
        return mv;
    }

}
