package org.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WelcomeController {

    @RequestMapping("/")
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloWorld";
    }

    @RequestMapping("/showFormVersionTwo")
    public String showFormVersionTwo(){
        return "helloworld-formVersionTwo";
    }


//    @RequestMapping("/processFormVersionTwo")
//    public String processFormVersionTwo(HttpServletRequest request, Model model){
//
//        String theName=request.getParameter("studentName");
//        theName=theName.toUpperCase();
//
//        System.out.println("the name is"+theName);
//        String result="Yo! "+theName;
//        model.addAttribute("message",result);
//
//        return "helloWorldVersionTwo";
//    }

    @RequestMapping("/processFormVersionTwo")
    public String processFormVersionTwo(@RequestParam("studentName") String theName, Model model){

        theName=theName.toUpperCase();

        System.out.println("the name is"+theName);
        String result="Yo! "+theName;
        model.addAttribute("message",result);

        return "helloWorldVersionTwo";
    }
}
