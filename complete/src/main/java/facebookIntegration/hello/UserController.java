package facebookIntegration.hello;

import facebookIntegration.model.UserRepo;
import facebookIntegration.model.UserProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by matthewb on 7/1/16.
 */
@CrossOrigin
@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    private final Logger log = LoggerFactory.getLogger(this.getClass());



    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserProfile getUserById(Long id){
        UserProfile userProfile = null;

        try{
            userProfile = userRepo.findById(id);
            log.info("user found");
        }catch (Exception ex){
            log.info("user not found");
        }
        return userProfile;
    }
}
