package com.example.security.users;

import com.example.security.entity.AbstractEntity;
import com.example.security.util.ApplicationContextProvider;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@Entity
@Data
@NoArgsConstructor
public class User extends AbstractEntity {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private boolean verified = false;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(CreateUserRequest data){
        PasswordEncoder passwordEncoder = ApplicationContextProvider.bean(PasswordEncoder.class);
        this.email = data.getEmail();
        this.password = passwordEncoder.encode(data.getPassword());
        

    }
}
