package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Auto
 */

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaPKMSTServerCodegen", date = "2020-11-14T17:17:21.195Z")

public class Auto   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("maker")
  private String maker = null;

  @JsonProperty("model")
  private String model = null;

  @JsonProperty("year")
  private Long year = null;

  public Auto id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Auto maker(String maker) {
    this.maker = maker;
    return this;
  }

   /**
   * Get maker
   * @return maker
  **/
  @ApiModelProperty(value = "")
  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public Auto model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Auto year(Long year) {
    this.year = year;
    return this;
  }

   /**
   * Get year
   * @return year
  **/
  @ApiModelProperty(value = "")
  public Long getYear() {
    return year;
  }

  public void setYear(Long year) {
    this.year = year;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auto auto = (Auto) o;
    return Objects.equals(this.id, auto.id) &&
        Objects.equals(this.maker, auto.maker) &&
        Objects.equals(this.model, auto.model) &&
        Objects.equals(this.year, auto.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maker, model, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Auto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maker: ").append(toIndentedString(maker)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

