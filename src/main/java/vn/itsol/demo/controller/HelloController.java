package vn.itsol.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import vn.itsol.demo.entity.Member;
import vn.itsol.demo.service.MemberService;

@Controller
@RequestMapping({"/", "/home"})
public class HelloController {
    @Autowired
    public MemberService memberService;

    @GetMapping("/hello")
    public ModelAndView hello(){
        ModelAndView view = new ModelAndView();
        view.setViewName("Hello");
        return view;
    }

    @GetMapping()
    public ModelAndView register(){
        return new ModelAndView("Register","command", new Member());
    }

}
