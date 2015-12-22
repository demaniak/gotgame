package net.pepperbytes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewFriendsController {

    public NewFriendsController() {        
    }
    
    @RequestMapping(value="/newfriends", method=RequestMethod.GET)
    public String newFriendEntry(Model model) {
        model.addAttribute("newfriends", new NewFriend());
        return "spreadjoy";
    }
    
    @RequestMapping(value="/submitfriends", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute NewFriend greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "goodbye";
    }

}
