package com.skyhigh.vehiclechain.controller.impl;

import com.skyhigh.vehiclechain.controller.UserApi;
import com.skyhigh.vehiclechain.model.User;


import com.skyhigh.vehiclechain.model.dto.UserDto;
import com.skyhigh.vehiclechain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-01T22:13:59.065667+05:30[Asia/Colombo]")
@Controller
@RequestMapping("${openapi.vehicleChainVehicleDetails.base-path:/v2}")
public class UserApiController implements UserApi {

    private final NativeWebRequest request;

    private UserService userService;

    @Autowired
    public UserApiController(NativeWebRequest request, UserService userService) {
        this.request = request;
        this.userService = userService;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<UserDto> createUser(UserDto body) {
        UserDto userDto = userService.createUser(body);
        return ResponseEntity.ok(userDto);
    }
}
