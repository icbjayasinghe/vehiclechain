/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.skyhigh.vehiclechain.controller;

import com.skyhigh.vehiclechain.model.dto.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-05T12:55:01.298053+05:30[Asia/Colombo]")
@Validated
@Tag(name = "user", description = "Operations about user")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Create user
     * Create user functionality
     *
     * @param body Created user object (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createUser",
        summary = "Create user",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user",
        produces = { "application/json" }
    )
    default ResponseEntity<UserDto> createUser(
        @Parameter(name = "body", description = "Created user object", required = true) @Valid @RequestBody UserDto body
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"userStatus\" : 0, \"phone\" : \"phone\", \"id\" : \"id\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /user/{email} : Delete user
     * This can only be done by the logged in user.
     *
     * @param email The name that needs to be deleted (required)
     * @return operation successful (status code 201)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "deleteUser",
        summary = "Delete user",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "201", description = "operation successful"),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user/{email}"
    )
    default ResponseEntity<Void> deleteUser(
        @Parameter(name = "email", description = "The name that needs to be deleted", required = true) @PathVariable("email") String email
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{email} : Get user by user name
     *
     * @param email The name that needs to be fetched. Use user1 for testing.  (required)
     * @return successful operation (status code 200)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserByName",
        summary = "Get user by user name",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{email}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserDto> getUserByName(
        @Parameter(name = "email", description = "The name that needs to be fetched. Use user1 for testing. ", required = true) @PathVariable("email") String email
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"userStatus\" : 0, \"phone\" : \"phone\", \"id\" : \"id\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /user/{email} : Updated user
     * This can only be done by the logged in user.
     *
     * @param email name that need to be updated (required)
     * @param body Updated user object (required)
     * @return successful operation (status code 200)
     *         or Invalid user supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "updateUser",
        summary = "Updated user",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid user supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/{email}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserDto> updateUser(
        @Parameter(name = "email", description = "name that need to be updated", required = true) @PathVariable("email") String email,
        @Parameter(name = "body", description = "Updated user object", required = true) @Valid @RequestBody UserDto body
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"userStatus\" : 0, \"phone\" : \"phone\", \"id\" : \"id\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
