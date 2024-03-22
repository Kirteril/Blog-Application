package com.example.AppBlog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Home(){
        return "Home";
    }

    @GetMapping("/WriteBlog")
    public String WriteBlog(){
        return "WriteBlog";
    }

    @GetMapping("/login")
    public String Login(Model model){
        model.addAttribute("user" , new User());
        return	"login";
    }
    @GetMapping("/register")
    public String Register(Model model){
        model.addAttribute("user" , new User());
        return	"register";
    }
}

