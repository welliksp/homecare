package br.com.wsp.homecare.service.impl;

import br.com.wsp.homecare.dto.UserDto;
import br.com.wsp.homecare.model.User;
import br.com.wsp.homecare.repository.UserRepository;
import br.com.wsp.homecare.service.IUserService;
import br.com.wsp.homecare.util.RandomUsernameGenerator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDto save(UserDto userDto) throws Exception {


        validate(userDto.getEmail());

        String username = RandomUsernameGenerator.generateUsername(userDto.getFirstName()).toLowerCase(Locale.ROOT);

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

    private void validate(String email) throws Exception {

        Optional<User> byEmail = repository.findByEmail(email);

        if (byEmail.isPresent())
            throw new Exception("Usuario Existente");
    }
}