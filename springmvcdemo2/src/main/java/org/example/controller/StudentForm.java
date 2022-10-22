package org.example.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentForm {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {

        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }


    @RequestMapping("showForm")
    public String showForm(Model theModel){

        Student student=new Student();
        theModel.addAttribute("student",student);
        return "student-form";
    }

    @RequestMapping("processForm")
    public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResult){
        System.out.println(theStudent.getFirstName());
        System.out.println(theStudent.getLastName());
        System.out.println(theStudent.getGender());
        System.out.println(bindingResult.hasErrors());
        if(bindingResult.hasErrors()){
            return "student-form";
        }else{
            return "student-confirmation";

        }
    }
}
