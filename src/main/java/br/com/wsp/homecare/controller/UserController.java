package br.com.wsp.homecare.controller;


import br.com.wsp.homecare.dto.UserDto;
import br.com.wsp.homecare.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    public final IUserService service;

    UserController(IUserService service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<UserDto> save(@RequestBody @Valid UserDto userDto) throws Exception {


        UserDto saved = service.save(userDto);

        return ResponseEntity.ok(saved);
    }
}