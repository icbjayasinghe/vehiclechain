package com.skyhigh.vehiclechain.util;

import com.skyhigh.vehiclechain.model.User;
import com.skyhigh.vehiclechain.model.dto.UserDto;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class UserToUserDtoConvertor implements Converter<User, UserDto> {
    @Override
    public UserDto convert(User source) {
        UserDto userDto = UserDto.builder()
                .id(source.getId())
                .email(source.getEmail())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .phone(source.getPhone())
                .userStatus(source.getUserStatus())
                .build();
        return userDto;
    }

    public UserToUserDtoConvertor() {
    }
}
