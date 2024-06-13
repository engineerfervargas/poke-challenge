
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
    "front_default",
    "front_female"
})
public class Icons {

    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_female")
    private Object frontFemale;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("front_default")
    public String getFrontDefault() {
        return frontDefault;
    }

    @JsonProperty("front_default")
    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public Icons withFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
        return this;
    }

    @JsonProperty("front_female")
    public Object getFrontFemale() {
        return frontFemale;
    }

    @JsonProperty("front_female")
    public void setFrontFemale(Object frontFemale) {
        this.frontFemale = frontFemale;
    }

    public Icons withFrontFemale(Object frontFemale) {
        this.frontFemale = frontFemale;
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

    public Icons withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("frontDefault", frontDefault).append("frontFemale", frontFemale).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(frontDefault).append(additionalProperties).append(frontFemale).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Icons) == false) {
            return false;
        }
        Icons rhs = ((Icons) other);
        return new EqualsBuilder().append(frontDefault, rhs.frontDefault).append(additionalProperties, rhs.additionalProperties).append(frontFemale, rhs.frontFemale).isEquals();
    }

}
