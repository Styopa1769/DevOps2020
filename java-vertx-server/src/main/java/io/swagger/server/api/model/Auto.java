package io.swagger.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Auto   {
  
  private Long id = null;
  private String maker = null;
  private String model = null;
  private Long year = null;

  public Auto () {

  }

  public Auto (Long id, String maker, String model, Long year) {
    this.id = id;
    this.maker = maker;
    this.model = model;
    this.year = year;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("maker")
  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) {
    this.maker = maker;
  }

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("year")
  public Long getYear() {
    return year;
  }
  public void setYear(Long year) {
    this.year = year;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Auto auto = (Auto) o;
    return Objects.equals(id, auto.id) &&
        Objects.equals(maker, auto.maker) &&
        Objects.equals(model, auto.model) &&
        Objects.equals(year, auto.year);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
