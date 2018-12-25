package nc.project.Driver;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DriverMongoRepository extends MongoRepository<Driver,String> {
    Driver findById(String id);
    Driver deleteByName(String name);
    Driver deleteById(String id);
}
