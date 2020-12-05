package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author xsqiang
 * @date 2020/12/5 16:08
 */
@Controller
public class SecondThymeleafController {
    /**
     * 访问localhost:8080 页面
     * 将数据message填充到templates/index2.html
     * @param model
     * @return
     */
    @GetMapping("/second")
    public String indexPage(Model model){
        String message = "hello,thymeleaf";
        User u = new User();
        u.setId(1);
        u.setName("优就业");
        u.setAge(18);
        Map<String,Object> map = new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        model.addAttribute("message", message);
        model.addAttribute("user", u);
        model.addAttribute("src", map);
        return "index2";
    }
}
