package com.unibta.PMIII.services;

import com.unibta.PMIII.models.User;
import com.unibta.PMIII.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void createUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAll() {
        List<User> userList = userRepository.findAll();

        if (userList.isEmpty()) {
            createUser(new User(1L, "João", "20/10/1995", "joao@email.com", "(21) 33710546", "joaologado", "123456"));
            createUser(new User(2L, "Leite", "20/10/1995", "leite@email.com", "(21) 33710546", "leitelogado", "123456"));
            createUser(new User(3L, "Mathias", "20/10/1995", "mathias@email.com", "(21) 33710546", "mathiaslogged", "123456"));
        }

        return userRepository.findAll();
    }

    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUseById(User user) {
        return userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public User login(String email, String password) {
        Optional<User> ret = userRepository.findByEmailAndPassword(email, password);

        return ret.orElse(new User());
    }
}
