package SmartCampus.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SmartCampus.dto.UserDTO;
import SmartCampus.model.User;
import SmartCampus.service.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Iterable<UserDTO> getAllUsers() {

        Iterable<User> users = userService.getAllUsers();

        List<UserDTO> userDTOs = new ArrayList<>();

        for (User user : users) {
            userDTOs.add(toDTO(user));
        }

        return userDTOs;
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(
            @PathVariable("id") Long id) {

        Optional<User> user = userService.getUserById(id);

        return user.map(this::toDTO)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @PostMapping
    public UserDTO createUser(
            @Valid @RequestBody UserDTO userDTO) {

        User user = new User(
                null,
                userDTO.name(),
                userDTO.email(),
                userDTO.role(),
                null,
                null
        );

        User savedUser = userService.createUser(user);

        return toDTO(savedUser);
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(
            @PathVariable("id") Long id,
            @Valid @RequestBody UserDTO userDTO) {

        User user = new User(
                id,
                userDTO.name(),
                userDTO.email(),
                userDTO.role(),
                null,
                null
        );

        User updatedUser = userService.updateUser(user);

        return toDTO(updatedUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(
            @PathVariable("id") Long id) {

        userService.deleteUser(id);
    }

    private UserDTO toDTO(User user) {

        return new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole()
        );
    }
}