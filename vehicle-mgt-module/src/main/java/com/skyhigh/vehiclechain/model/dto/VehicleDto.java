package com.skyhigh.vehiclechain.model.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VehicleDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-24T19:13:36.612862+05:30[Asia/Colombo]")
public class VehicleDto {

  @JsonProperty("id")
  private String id;

  @JsonProperty("vin")
  private String vin;

  @JsonProperty("cNumber")
  private String cNumber;

  @JsonProperty("vehicleNumber")
  private String vehicleNumber;

  @JsonProperty("brand")
  private String brand;

  @JsonProperty("model")
  private String model;

  /**
   * Vehicle Status
   */
  public enum TypeEnum {
    CAR("car"),
    
    VAN("van"),
    
    SUV_JEEP("suv/jeep"),
    
    CREW_CAB("crew cab"),
    
    PICK_UP_DOUBLE_CAB("pick-up/double-cab"),
    
    BUS("bus"),
    
    LORRY_TIPPER("lorry/tipper"),
    
    THREE_WHEEL("three wheel"),
    
    TRACTOR("tractor"),
    
    HEAVY_DUTY("heavy-duty"),
    
    MOTORCYCLE("motorcycle"),
    
    BICYCLE("bicycle"),
    
    OTHER("other");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("currentOwner")
  private UserDto currentOwner;

  @JsonProperty("prevOwners")
  @Valid
  private List<UserDto> prevOwners = null;

  /**
   * Vehicle Status
   */
  public enum StatusEnum {
    UNAPPROVED("unapproved"),
    
    APPROVED("approved"),
    
    DEACTIVE("deactive");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  public VehicleDto id(String id) {
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

  public VehicleDto vin(String vin) {
    this.vin = vin;
    return this;
  }

  /**
   * Get vin
   * @return vin
  */
  
  @Schema(name = "vin", required = false)
  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public VehicleDto cNumber(String cNumber) {
    this.cNumber = cNumber;
    return this;
  }

  /**
   * Get cNumber
   * @return cNumber
  */
  
  @Schema(name = "cNumber", required = false)
  public String getcNumber() {
    return cNumber;
  }

  public void setcNumber(String cNumber) {
    this.cNumber = cNumber;
  }

  public VehicleDto vehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
    return this;
  }

  /**
   * Get vehicleNumber
   * @return vehicleNumber
  */
  
  @Schema(name = "vehicleNumber", required = false)
  public String getVehicleNumber() {
    return vehicleNumber;
  }

  public void setVehicleNumber(String vehicleNumber) {
    this.vehicleNumber = vehicleNumber;
  }

  public VehicleDto brand(String brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  */
  
  @Schema(name = "brand", example = "Toyota", required = false)
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public VehicleDto model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  
  @Schema(name = "model", example = "Corolla", required = false)
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public VehicleDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Vehicle Status
   * @return type
  */
  
  @Schema(name = "type", example = "approved", description = "Vehicle Status", required = false)
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public VehicleDto currentOwner(UserDto currentOwner) {
    this.currentOwner = currentOwner;
    return this;
  }

  /**
   * Get currentOwner
   * @return currentOwner
  */
  @Valid 
  @Schema(name = "currentOwner", required = false)
  public UserDto getCurrentOwner() {
    return currentOwner;
  }

  public void setCurrentOwner(UserDto currentOwner) {
    this.currentOwner = currentOwner;
  }

  public VehicleDto prevOwners(List<UserDto> prevOwners) {
    this.prevOwners = prevOwners;
    return this;
  }

  public VehicleDto addPrevOwnersItem(UserDto prevOwnersItem) {
    if (this.prevOwners == null) {
      this.prevOwners = new ArrayList<>();
    }
    this.prevOwners.add(prevOwnersItem);
    return this;
  }

  /**
   * Get prevOwners
   * @return prevOwners
  */
  @Valid 
  @Schema(name = "prevOwners", required = false)
  public List<UserDto> getPrevOwners() {
    return prevOwners;
  }

  public void setPrevOwners(List<UserDto> prevOwners) {
    this.prevOwners = prevOwners;
  }

  public VehicleDto status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Vehicle Status
   * @return status
  */
  
  @Schema(name = "status", example = "approved", description = "Vehicle Status", required = false)
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleDto vehicleDto = (VehicleDto) o;
    return Objects.equals(this.id, vehicleDto.id) &&
        Objects.equals(this.vin, vehicleDto.vin) &&
        Objects.equals(this.cNumber, vehicleDto.cNumber) &&
        Objects.equals(this.vehicleNumber, vehicleDto.vehicleNumber) &&
        Objects.equals(this.brand, vehicleDto.brand) &&
        Objects.equals(this.model, vehicleDto.model) &&
        Objects.equals(this.type, vehicleDto.type) &&
        Objects.equals(this.currentOwner, vehicleDto.currentOwner) &&
        Objects.equals(this.prevOwners, vehicleDto.prevOwners) &&
        Objects.equals(this.status, vehicleDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, vin, cNumber, vehicleNumber, brand, model, type, currentOwner, prevOwners, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
    sb.append("    cNumber: ").append(toIndentedString(cNumber)).append("\n");
    sb.append("    vehicleNumber: ").append(toIndentedString(vehicleNumber)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    currentOwner: ").append(toIndentedString(currentOwner)).append("\n");
    sb.append("    prevOwners: ").append(toIndentedString(prevOwners)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

