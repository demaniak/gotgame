package net.pepperbytes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    public HomeController() {
        // TODO Auto-generated constructor stub
    }
    
    @RequestMapping("/start")
    public final  String greeting ( @RequestParam(value="name", required=false, defaultValue="Jarod") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
