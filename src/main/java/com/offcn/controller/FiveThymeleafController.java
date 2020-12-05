package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO
 *
 * @author xsqiang
 * @date 2020/12/5 16:33
 */
@Controller
public class FiveThymeleafController {
    /**
     * 访问localhost:8080/ 页面
     * 将数据message填充到templates/index4.html
     * @param model
     * @return
     */
    @GetMapping("/five")
    public String indexPage(Model model){
        model.addAttribute("flag", "yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");
        return "index5";
    }
}
