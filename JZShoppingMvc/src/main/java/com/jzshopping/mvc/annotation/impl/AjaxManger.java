package com.jzshopping.mvc.annotation.impl;

import com.jzshopping.entity.Router;
import com.jzshopping.util.ReadXmlAndJsonFileToObj;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * ajax请求访问权限管理
 *
 * @author lmz
 */
public class AjaxManger {
    public static void Go(HttpServletRequest req, HttpServletResponse resp, String[] urls, Router router) throws IOException, ServletException {
        String[] ajaxUrl = urls[1].split("/");
        if (ajaxUrl.length<2){
            req.getRequestDispatcher("/404.html").forward(req, resp);
            return;
        }
        //获取一级访问路径
        String oneAction = ajaxUrl[0];
        //获取二级访问路径
        String twoAction = ajaxUrl[1];
        //首先从session中获取ajax权限管理列表
        List<String> list = (List<String>) req.getSession().getAttribute("AjaxManger");
        //如果获取不到就直接重新读取配置文件，然后放在session中
        if (list == null) {
            list = ReadXmlAndJsonFileToObj.readXMLAjaxManger("classpath:AjaxManger.xml");
            req.getSession().setAttribute("AjaxManger", list);
        }
        //如果已经登陆，或者请求是在AjaxManger.xml中配置了，就能直接访问
        if (req.getSession().getAttribute("user") != null || list.contains(twoAction)) {
            //调用一二级访问路径映射器
            AccessUrlMapper.Go(req, resp, oneAction, twoAction, router.getController());
        } else {
            resp.setContentType("text/html;charset=utf-8");
            PrintWriter out = resp.getWriter();
            out.write("<script>alert('登陆态失效,请登录后在试！')</script>");
        }
    }
}
