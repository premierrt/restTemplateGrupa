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

/**
 * CheckResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-10T15:44:41.159+02:00")
public class CheckResponse {
  @JsonProperty("msisdn")
  private String msisdn = null;

  /**
   * Powód negatywnej weryfikacji
   */
  public enum ReasonEnum {
    NOT_PREPAID("NOT_PREPAID"),
    
    NOT_P4("NOT_P4"),
    
    GROUP_MEMBER("GROUP_MEMBER"),
    
    MIGRATION_REQUIRED("MIGRATION_REQUIRED"),
    
    INACTIVE("INACTIVE");

    private String value;

    ReasonEnum(String value) {
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
    public static ReasonEnum fromValue(String text) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("reason")
  private ReasonEnum reason = null;

  /**
   * Status weryfikacji numeru
   */
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    
    FAIL("FAIL");

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
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public CheckResponse msisdn(String msisdn) {
    this.msisdn = msisdn;
    return this;
  }

   /**
   * Get msisdn
   * @return msisdn
  **/
  @ApiModelProperty(value = "")
  public String getMsisdn() {
    return msisdn;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public CheckResponse reason(ReasonEnum reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Powód negatywnej weryfikacji
   * @return reason
  **/
  @ApiModelProperty(value = "Powód negatywnej weryfikacji")
  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public CheckResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status weryfikacji numeru
   * @return status
  **/
  @ApiModelProperty(value = "Status weryfikacji numeru")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckResponse checkResponse = (CheckResponse) o;
    return Objects.equals(this.msisdn, checkResponse.msisdn) &&
        Objects.equals(this.reason, checkResponse.reason) &&
        Objects.equals(this.status, checkResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(msisdn, reason, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckResponse {\n");
    
    sb.append("    msisdn: ").append(toIndentedString(msisdn)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

