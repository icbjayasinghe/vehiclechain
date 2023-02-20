package com.skyhigh.vehiclechain.service.impl;

import com.skyhigh.vehiclechain.exception.customException.AlreadyExistException;
import com.skyhigh.vehiclechain.model.User;
import com.skyhigh.vehiclechain.model.dto.UserDto;
import com.skyhigh.vehiclechain.repository.UserRepository;
import com.skyhigh.vehiclechain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.dao.DataIntegrityViolationException;
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
        try {
            UUID uuid = UUID.randomUUID();
            UserDto userDtoRes;
            User existUser = null;
            if (userDto.getEmail() != null) {
                existUser = userRepository.findUserByEmail(userDto.getEmail());
                if (existUser != null) {
                    throw new AlreadyExistException("User already exist");
                }
            }
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
            userDtoRes = conversionService.convert(user, UserDto.class);

            return userDtoRes;
        } catch (DataIntegrityViolationException dex) {
            throw new DataIntegrityViolationException(dex.getMessage());
        } catch (Exception e) {
            throw e;
        }

    }

    @Override
    public UserDto getUser(String email) {
        User user = userRepository.findUserByEmail(email);
        UserDto userDtoRes = conversionService.convert(user, UserDto.class);
        return userDtoRes;
    }
}
