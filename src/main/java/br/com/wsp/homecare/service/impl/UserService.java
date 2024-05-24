package br.com.wsp.homecare.service.impl;

import br.com.wsp.homecare.dto.UserDto;
import br.com.wsp.homecare.model.User;
import br.com.wsp.homecare.repository.UserRepository;
import br.com.wsp.homecare.service.IUserService;
import br.com.wsp.homecare.util.RandomUsernameGenerator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserService implements IUserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDto save(UserDto userDto) {


        String username = RandomUsernameGenerator.generateUsername(userDto.getFirstName());

        User user = User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .username(username)
                .email(userDto.getEmail())
                .birthdate(userDto.getBirthdate())
                .password(userDto.getPassword())
                .createdAt(LocalDateTime.now())
                .build();

        User saved = repository.save(user);


        return new UserDto(saved);
    }
}