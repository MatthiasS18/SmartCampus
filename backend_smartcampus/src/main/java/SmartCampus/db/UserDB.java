package SmartCampus.db;

import org.springframework.data.repository.CrudRepository;

import SmartCampus.model.User;

public interface UserDB extends CrudRepository<User, Long> {
    
}
