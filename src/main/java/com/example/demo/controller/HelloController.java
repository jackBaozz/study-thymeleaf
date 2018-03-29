package com.example.demo.controller;


import com.example.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/6.
 */
@Controller
public class HelloController {
    @RequestMapping(value = {"/index","/"})
    public String index(Model  model)
    {
        Person single = new Person("hyj",21);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("dlp",21);
        Person p2 = new Person("tq",18);
        Person p3 = new Person("mk",12);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);
        return "index";
    }


    @RequestMapping(value = {"/login"})
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("jack","good");
        return mav;
    }

    @RequestMapping(value = {"/login2"})
    public String login2(){
        return "login";
    }

}
