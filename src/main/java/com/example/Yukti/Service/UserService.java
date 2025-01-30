package com.example.Yukti.Service;
import com.example.Yukti.Model.User;
import com.example.Yukti.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    public User saveUser(User user)
    {
        return userRepository.save(user);
    }
}
