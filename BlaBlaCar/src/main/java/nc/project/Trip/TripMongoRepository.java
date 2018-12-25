package nc.project.Trip;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TripMongoRepository extends MongoRepository<Trip,String> {

}
