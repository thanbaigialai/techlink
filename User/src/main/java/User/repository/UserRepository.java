package User.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import User.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}