
package mx.com.bankaya.poke.challenge.pokeapi;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "back_default",
    "back_gray",
    "back_transparent",
    "front_default",
    "front_gray",
    "front_transparent"
})
public class Yellow {

    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("back_gray")
    private String backGray;
    @JsonProperty("back_transparent")
    private String backTransparent;
    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_gray")
    private String frontGray;
    @JsonProperty("front_transparent")
    private String frontTransparent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("back_default")
    public String getBackDefault() {
        return backDefault;
    }

    @JsonProperty("back_default")
    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    public Yellow withBackDefault(String backDefault) {
        this.backDefault = backDefault;
        return this;
    }

    @JsonProperty("back_gray")
    public String getBackGray() {
        return backGray;
    }

    @JsonProperty("back_gray")
    public void setBackGray(String backGray) {
        this.backGray = backGray;
    }

    public Yellow withBackGray(String backGray) {
        this.backGray = backGray;
        return this;
    }

    @JsonProperty("back_transparent")
    public String getBackTransparent() {
        return backTransparent;
    }

    @JsonProperty("back_transparent")
    public void setBackTransparent(String backTransparent) {
        this.backTransparent = backTransparent;
    }

    public Yellow withBackTransparent(String backTransparent) {
        this.backTransparent = backTransparent;
        return this;
    }

    @JsonProperty("front_default")
    public String getFrontDefault() {
        return frontDefault;
    }

    @JsonProperty("front_default")
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public Yellow withFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
        return this;
    }

    @JsonProperty("front_gray")
    public String getFrontGray() {
        return frontGray;
    }

    @JsonProperty("front_gray")
    public void setFrontGray(String frontGray) {
        this.frontGray = frontGray;
    }

    public Yellow withFrontGray(String frontGray) {
        this.frontGray = frontGray;
        return this;
    }

    @JsonProperty("front_transparent")
    public String getFrontTransparent() {
        return frontTransparent;
    }

    @JsonProperty("front_transparent")
    public void setFrontTransparent(String frontTransparent) {
        this.frontTransparent = frontTransparent;
    }

    public Yellow withFrontTransparent(String frontTransparent) {
        this.frontTransparent = frontTransparent;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Yellow withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("backDefault", backDefault).append("backGray", backGray).append("backTransparent", backTransparent).append("frontDefault", frontDefault).append("frontGray", frontGray).append("frontTransparent", frontTransparent).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(backTransparent).append(frontTransparent).append(backDefault).append(frontDefault).append(frontGray).append(additionalProperties).append(backGray).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Yellow) == false) {
            return false;
        }
        Yellow rhs = ((Yellow) other);
        return new EqualsBuilder().append(backTransparent, rhs.backTransparent).append(frontTransparent, rhs.frontTransparent).append(backDefault, rhs.backDefault).append(frontDefault, rhs.frontDefault).append(frontGray, rhs.frontGray).append(additionalProperties, rhs.additionalProperties).append(backGray, rhs.backGray).isEquals();
    }

}
