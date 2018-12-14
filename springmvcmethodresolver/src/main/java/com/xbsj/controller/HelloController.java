package com.xbsj.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends MultiActionController {

    /**
     * 查询
     */
    public ModelAndView select(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("HelloController.select");
        return new ModelAndView("success", "result", "查询");
    }

    /**
     * 添加
     */
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("HelloController.add");
        return new ModelAndView("success", "result", "添加");
    }

    /**
     * 修改
     */
    public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("HelloController.update");
        return new ModelAndView("success", "result", "修改");
    }

    /**
     * 删除
     */
    public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("HelloController.delete");
        return new ModelAndView("success", "result", "删除");
    }

}
