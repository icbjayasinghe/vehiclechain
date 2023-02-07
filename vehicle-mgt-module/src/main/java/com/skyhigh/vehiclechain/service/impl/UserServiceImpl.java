package com.skyhigh.vehiclechain.service.impl;

import com.skyhigh.vehiclechain.model.User;
import com.skyhigh.vehiclechain.model.dto.UserDto;
import com.skyhigh.vehiclechain.repository.UserRepository;
import com.skyhigh.vehiclechain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    ConversionService conversionService;

    @Override
    public UserDto createUser(UserDto userDto) {
        UUID uuid = UUID.randomUUID();
        User user = User.builder()
                .id(uuid.toString())
                .email(userDto.getEmail())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .phone(userDto.getPhone())
                .userStatus(1)
                .createdAt(new Date())
                .build();
        user = userRepository.save(user);
        UserDto userDtoRes = conversionService.convert(user, UserDto.class);
        return userDtoRes;
    }
}
