package com.ssafy.mvc.model.controller;

import com.ssafy.mvc.model.dto.User;
import com.ssafy.mvc.model.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/register")
    public String registerForm() {
        return "user/register";
    }

    @PostMapping("/user/register")
    public String register(User user) {
        userService.register(user);
        return "redirect:/user/login";
    }

    @GetMapping("/user/login")
    public String loginForm() {
        return "user/login";
    }

    @PostMapping("/user/login")
    public String login(User user, HttpSession session, RedirectAttributes rttr) {
        User loginUser = userService.login(user);
        if (loginUser != null) {
            session.setAttribute("loginUser", loginUser);
            return "redirect:/board/list";
        } else {
            rttr.addFlashAttribute("msg", "로그인 실패");
            return "redirect:/user/login";
        }
    }

    @GetMapping("/user/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/user/login";
    }
}
