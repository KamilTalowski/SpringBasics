package com.kamiltalowki.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
/*  //Servlet Style
    @RequestMapping("home")
    public String home(HttpServletRequest req, HttpServletResponse res){
        HttpSession session = req.getSession(); //not needed in spring
        String name = req.getParameter("name"); //not needed in spring
        System.out.println("hi "+ name);
        session.setAttribute("name", name);
        return "home";
*/

/*  @RequestMapping("home")
    public String home(@RequestParam("name") String myName, HttpSession session){

        System.out.println("hi "+ myName);
        session.setAttribute("name", myName);
        return "home";
    }*/

/*    @RequestMapping("home")
    public ModelAndView home(@RequestParam("aName") String myName){ //without session,modelAndView is better for debugging

        ModelAndView mAV= new ModelAndView();
        mAV.addObject("aName", myName);
        mAV.setViewName("home");

        return mAV;
    }*/
    @RequestMapping("home")
    /*public ModelAndView home(@RequestParam "aName" String myName)*/
    public ModelAndView home(Alien alien){ //without session,modelAndView is better for debugging

        ModelAndView mAV= new ModelAndView();
        /*mAV.addObject("aName", myName);*/
        mAV.addObject("objAlien", alien);
        mAV.setViewName("home");

        return mAV;
    }


}

