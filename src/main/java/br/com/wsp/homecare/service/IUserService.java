package br.com.wsp.homecare.service;


import br.com.wsp.homecare.dto.UserDto;

public interface IUserService {

    UserDto save(UserDto userDto);
}