package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * TODO
 *
 * @author xsqiang
 * @date 2020/12/5 16:56
 */
@Controller
public class SevenThymeleafController {
    /**
     * 访问localhost:8080/java003 页面
     * 将数据message填充到templates/index7.html
     * @param model
     * @return
     */

    @GetMapping("/seven")
    public String indexPage(Model model){
        //日期时间
        Date date = new Date();
        model.addAttribute("date",date);
        //小数的金额
        double price=128.5678D;
        model.addAttribute("price",price);
        //定义大文本数据
        String str = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("strTest",str);
        //定义字符串
        String str2="JAVA-offcn";
        model.addAttribute("str2",str2);
        return "index7";
    }
    public void fenzhi(){
        System.out.println("fenzhi新增方法");
    }
    public void fenzhi2(){
        System.out.println("fenzhi新增方法2");
    }
}
