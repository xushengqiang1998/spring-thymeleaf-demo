package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO
 *
 * @author xsqiang
 * @date 2020/12/5 16:01
 */
@Controller
public class FirstThymeleafController {
    /**
     * 访问http://localhost:8080/first
     * 将数据message填充到templates/index.html
     * @param model
     * @return
     */
    @GetMapping("/first")
    public String indexPage(Model model){
        String message = "Hello,thymeleaf!";
        model.addAttribute("message",message);
        return "index";
    }
}
