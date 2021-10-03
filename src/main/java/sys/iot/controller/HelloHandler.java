/***
 null.java
 Created by  Allen
 Date:       2021/10/4 2:59
 package:    sys.iot.controller
 project:    My1stSpringBootThymeleaf
 ***/
package sys.iot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @GetMapping("/index")
    public ModelAndView index()
    {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("name","张三");
        return modelAndView;


    }
}
