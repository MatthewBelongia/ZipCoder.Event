package facebookIntegration.model;

import facebookIntegration.model.UserProfile;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by matthewb on 7/1/16.
 */
@Transactional
public interface UserRepo extends CrudRepository<UserProfile,Long>{

    UserProfile findById(Long id);



}
