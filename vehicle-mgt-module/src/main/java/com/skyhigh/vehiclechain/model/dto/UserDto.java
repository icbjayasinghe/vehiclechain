package com.skyhigh.vehiclechain.model.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.NoArgsConstructor;


import javax.annotation.Generated;

/**
 * UserDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-05T12:55:01.298053+05:30[Asia/Colombo]")
@Builder
public class UserDto {

  @JsonProperty("id")
  private String id;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("userStatus")
  private Integer userStatus;

  public UserDto id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */

  @Schema(name = "id", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserDto firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */

  @Schema(name = "firstName", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserDto lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */

  @Schema(name = "lastName", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserDto email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */

  @Schema(name = "email", required = false)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserDto phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  */

  @Schema(name = "phone", required = false)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UserDto userStatus(Integer userStatus) {
    this.userStatus = userStatus;
    return this;
  }

  /**
   * User Status
   * @return userStatus
  */

  @Schema(name = "userStatus", description = "User Status", required = false)
  public Integer getUserStatus() {
    return userStatus;
  }

  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDto userDto = (UserDto) o;
    return Objects.equals(this.id, userDto.id) &&
        Objects.equals(this.firstName, userDto.firstName) &&
        Objects.equals(this.lastName, userDto.lastName) &&
        Objects.equals(this.email, userDto.email) &&
        Objects.equals(this.phone, userDto.phone) &&
        Objects.equals(this.userStatus, userDto.userStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, phone, userStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    userStatus: ").append(toIndentedString(userStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

