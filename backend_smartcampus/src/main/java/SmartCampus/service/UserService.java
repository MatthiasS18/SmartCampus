package SmartCampus.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import SmartCampus.db.UserDB;
import SmartCampus.model.User;

@Service
public class UserService {

    private final UserDB userDB;

    public UserService(UserDB userDB) {
        this.userDB = userDB;
    }

    public Iterable<User> getAllUsers() {
        return userDB.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userDB.findById(id);
    }

    public User createUser(User user) {
        return userDB.save(user);
    }

    public User updateUser(User user) {
        return userDB.save(user);
    }

    public void deleteUser(Long id) {
        userDB.deleteById(id);
    }
}