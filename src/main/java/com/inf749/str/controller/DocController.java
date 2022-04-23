package com.inf749.str.controller;

import com.inf749.str.repository.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class DocController {
    @Autowired
    private DocRepository docRepository;

    @RequestMapping(value = "/docs", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("docs");
        return modelAndView;
    }
}
