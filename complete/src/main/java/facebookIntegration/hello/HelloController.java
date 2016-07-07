package facebookIntegration.hello;
/*
import javax.inject.Inject;

import facebookIntegration.model.UserProfile;
import facebookIntegration.model.UserRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.Page;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private Facebook facebook;
	private ConnectionRepository connectionRepository;

    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Autowired
    UserRepo userRepo;

    @Inject
    public HelloController(Facebook facebook, ConnectionRepository connectionRepository) {
        this.facebook = facebook;
		this.connectionRepository = connectionRepository;
    }

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String helloFacebook(Model model) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }
        PagedList<Page> likedPages = facebook.likeOperations().getPagesLiked();
        model.addAttribute("likedPages",likedPages);
        model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
        PagedList<Post> feed = facebook.feedOperations().getFeed();
        model.addAttribute("feed", feed);
        return "facebookIntegration/hello";
    }

    @RequestMapping(value = "adduser",method = RequestMethod.GET)
    public UserProfile createUser(){

        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return null;
        }
        UserProfile userProfile = null;


        try{
            String name = facebook.userOperations().getUserProfile().getFirstName();
            String gender = facebook.userOperations().getUserProfile().getGender();
            userProfile = new UserProfile(name,gender);
            userRepo.save(userProfile);
            log.info("user created");
        }catch (Exception ex){
            log.info("user not created");
        }
        return userProfile;

    }




}
*/