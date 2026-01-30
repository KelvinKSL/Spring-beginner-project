package com.example.security.users.service;

import com.example.security.users.User;
import com.example.security.users.data.CreateUserRequest;
import com.example.security.users.data.UserResponse;
import com.example.security.users.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public UserResponse create(@Valid CreateUserRequest request){
        User user = new User(request);
        user = userRepository.save(user);

        return new UserResponse(user);
    }
}

