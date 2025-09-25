package com.mitocode.demo.services;

import com.mitocode.demo.UserRepository;
import com.mitocode.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Create user
    public User createUser(User user) {
        return userRepository.save(user);
    }

    // Get users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Get user by id
    public Optional<User> getUserById(Integer id) {
        return Optional.ofNullable(userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro el producto con el id " + id)));
    }

    // Update user
    public User updateUser(Integer id, User user) {
        User currentUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encontro el producto con el id " + id));

        if (user.getId() != null) {
            currentUser.setId(user.getId());
        }

        if (user.getName() != null) {
            currentUser.setName(user.getName());
        }
        if (user.getEmail() != null) {
            currentUser.setEmail(user.getEmail());
        }

        if (user.getAge() != null) {
            currentUser.setAge(user.getAge());
        }

        return userRepository.save(currentUser);
    }

    // Delete user
    public void deleteUserById(Integer id) {
        userRepository.findById(id)
                .ifPresentOrElse(
                        user -> userRepository.deleteById(id),
                        () -> {
                            throw new RuntimeException("No se encontró el producto con el id " + id);
                        }
                );
    }



}
