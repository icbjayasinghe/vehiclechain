package com.skyhigh.vehiclechain.service;

import com.skyhigh.vehiclechain.model.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUser(String email);
}
