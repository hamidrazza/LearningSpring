package com.hamid.SpringWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // The .jsp extension, we have to mention in the application.properties
    @RequestMapping("/")
    public String home(){
        System.out.println("Home method called...");
        return "index";
    }

    @ModelAttribute("course")
    public String course(){
        return "Java";
    }

    /*@RequestMapping("add")
    public String add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, Model model){
        int result = num1 + num2;

        model.addAttribute("result", result);
        System.out.println(result);
        return "result";
    }*/

    /*@RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1,@RequestParam("num2") int num2, ModelAndView mv){
        int result = num1 + num2;

        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }*/

    @RequestMapping("addEng")
    public String addEng(Engineer engineer){

        return "result";
    }
}
