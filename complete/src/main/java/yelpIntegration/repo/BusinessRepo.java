package yelpIntegration.repo;


import org.springframework.data.repository.CrudRepository;
import yelpIntegration.domain.Business;

public interface BusinessRepo extends CrudRepository<Business, Long> {
}
