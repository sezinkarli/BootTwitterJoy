package main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Sezin Karli
 */
@Service
public class TwitterService {

    @Autowired
    private Twitter twitter;

    public List < Tweet > getUserTimeline(String twitterUser) {
        TimelineOperations timelineOps = twitter.timelineOperations();
        List<Tweet> tweets = timelineOps.getUserTimeline("@" + twitterUser);

        return tweets;
    }

    public TwitterProfile getUserProfile(String twitterUser) {
        UserOperations userOperations = twitter.userOperations();
        TwitterProfile userProfile = userOperations.getUserProfile(twitterUser);

        return userProfile;
    }
}
