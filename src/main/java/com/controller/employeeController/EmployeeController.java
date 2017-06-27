package com.controller.employeeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by user on 2017/5/12.
 * 员工Controller
 */

//@Controller注解：采用注解的方式，可以明确地定义该类为处理请求的Controller类；
@Controller
public class EmployeeController {

    //@RequestMapping()注解：用于定义一个请求映射，value为请求的url，值为 / ，该请求首页请求，method用以指定该请求类型，一般为get和post；
    @RequestMapping(value = "/",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    public String index(){
        //return "index"：处理完该请求后返回的页面，此请求返回 index.jsp页面。
        return "index";
    }

    //@RequestMapping()注解：用于定义一个请求映射，value为请求的url，值为 / 说明，该请求首页请求，method用以指定该请求类型，一般为get和post；
    @RequestMapping(value = "/two",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    //HttpServletResponse,HttpServletRequest为后台返回对象及前端请求对象
    public ModelAndView success(HttpServletResponse response, HttpServletRequest request, String test){
        //获取前端传来的数据,也可以直接使用方法参数里的test,会去自动读取请求中名为test的key
        String s = request.getParameter("test");
        //通过ModelAndView,将后台处理结果,返回success页面
        ModelAndView  mav = new ModelAndView("success");
        //返回对象的key及value,ModelAndView是map的子类,因此返回参数都是key-value的形式
        mav.addObject("msg", "获取到的信息为:"+s);
        return mav;
    }



}
