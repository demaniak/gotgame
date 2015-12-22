package net.pepperbytes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StartController {
    
    @RequestMapping(value = {"/"} , method = RequestMethod.GET)
    public String getStartPage () {
        return "start";
    }
    
    @RequestMapping("/startGame" )
    public String startGame (@RequestParam(value="a", required=true, defaultValue="n") String answer) {
        if ("y".equalsIgnoreCase(answer)) {
            return "play";
        }
        return "goodbye";
    }

}
