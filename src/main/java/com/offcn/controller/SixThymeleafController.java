package com.offcn.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO
 *
 * @author xsqiang
 * @date 2020/12/5 16:51
 */
@Controller
public class SixThymeleafController {
    /**
     * 访问localhost:8080/java003 页面
     * 将数据message填充到templates/index6.html
     * @param model
     * @return
     */
    @GetMapping("/six")
    public String indexPage(Model model){
        return "index6";
    }
}
