package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String login(HttpServletRequest request, Model model) {
        String error = request.getParameter("error");
        String logout = request.getParameter("logout");

        if (error != null && logout != null) {
            model.addAttribute("errorMsg", "ユーザー名またはパスワードが正しくありません。");
        }
        if (logout != null) {
            model.addAttribute("msg", "ログアウトしました。");
        }
        return "login";
    }
}
