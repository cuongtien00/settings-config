package com.codegym.controller;

import com.codegym.model.Setting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class SettingController {
    @GetMapping("/setting")
    public ModelAndView settingForm() {
//        Setting setting = new Setting(new String[4], new int[6], false, "");
        String[] languages = {"English", "Vietnamese", "Japanese", "Chinese"};
//        setting.setLanguages(languages);
        int[] sizes = {5, 10, 15, 25, 50, 100};
//        setting.setSize(sizes);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("setting", new Setting());
        modelAndView.addObject("languages", languages);
        modelAndView.addObject("sizes", sizes);
        return modelAndView;
    }
    @PostMapping("/save")
    public ModelAndView save(@ModelAttribute Setting setting){
        ModelAndView modelAndView = new ModelAndView("index");
        String[] languages = {"English", "Vietnamese", "Japanese", "Chinese"};
        int[] sizes = {5, 10, 15, 25, 50, 100};
        modelAndView.addObject("setting",setting);
        modelAndView.addObject("languages", languages);
        modelAndView.addObject("sizes", sizes);
        return modelAndView;

    }
}
