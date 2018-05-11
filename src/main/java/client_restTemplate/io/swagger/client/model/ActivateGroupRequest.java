/*
 * API - ActivateGroup Service
 * Dokumentacja usługi do zarządzania grupami.
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package client_restTemplate.io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ActivateGroupRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-10T15:44:41.159+02:00")
public class ActivateGroupRequest {
  @JsonProperty("members")
  private List<String> members = null;

  @JsonProperty("ownerMsisdn")
  private String ownerMsisdn = null;

  public ActivateGroupRequest members(List<String> members) {
    this.members = members;
    return this;
  }

  public ActivateGroupRequest addMembersItem(String membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<String>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * Lista abonentów w grupie
   * @return members
  **/
  @ApiModelProperty(value = "Lista abonentów w grupie")
  public List<String> getMembers() {
    return members;
  }

  public void setMembers(List<String> members) {
    this.members = members;
  }

  public ActivateGroupRequest ownerMsisdn(String ownerMsisdn) {
    this.ownerMsisdn = ownerMsisdn;
    return this;
  }

   /**
   * Numer MSISDN ownera grupy
   * @return ownerMsisdn
  **/
  @ApiModelProperty(value = "Numer MSISDN ownera grupy")
  public String getOwnerMsisdn() {
    return ownerMsisdn;
  }

  public void setOwnerMsisdn(String ownerMsisdn) {
    this.ownerMsisdn = ownerMsisdn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivateGroupRequest activateGroupRequest = (ActivateGroupRequest) o;
    return Objects.equals(this.members, activateGroupRequest.members) &&
        Objects.equals(this.ownerMsisdn, activateGroupRequest.ownerMsisdn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(members, ownerMsisdn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivateGroupRequest {\n");
    
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    ownerMsisdn: ").append(toIndentedString(ownerMsisdn)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
