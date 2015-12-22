package net.pepperbytes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HarvestController {
    
    @RequestMapping(value = "/harvest", method=RequestMethod.GET)
    public String getInputPage () {
        return "harvest";
    }

}
