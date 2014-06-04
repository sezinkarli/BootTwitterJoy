/**
 *
 */
package main.controller;

import main.service.TwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sezin Karli
 */
@Controller
public class TwitterController {

    @Autowired
    private TwitterService twitterService;

    @RequestMapping(value = "/timeline/{twitterUser}")
    public String getUserTimeline(@PathVariable String twitterUser, Model model) {
        model.addAttribute("tweets", twitterService.getUserTimeline(twitterUser));
        model.addAttribute("user", twitterUser);

        return "timeline";
    }

    @RequestMapping(value = "/profile/{twitterUser}")
    public String getUserProfile(@PathVariable String twitterUser, Model model) {
        model.addAttribute("userProfile", twitterService.getUserProfile(twitterUser));

        return "profile";
    }
}

