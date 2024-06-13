
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
    "back_female",
    "back_shiny",
    "back_shiny_female",
    "front_default",
    "front_female",
    "front_shiny",
    "front_shiny_female"
})
public class Animated {

    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("back_female")
    private Object backFemale;
    @JsonProperty("back_shiny")
    private String backShiny;
    @JsonProperty("back_shiny_female")
    private Object backShinyFemale;
    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_female")
    private Object frontFemale;
    @JsonProperty("front_shiny")
    private String frontShiny;
    @JsonProperty("front_shiny_female")
    private Object frontShinyFemale;
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

    public Animated withBackDefault(String backDefault) {
        this.backDefault = backDefault;
        return this;
    }

    @JsonProperty("back_female")
    public Object getBackFemale() {
        return backFemale;
    }

    @JsonProperty("back_female")
    public void setBackFemale(Object backFemale) {
        this.backFemale = backFemale;
    }

    public Animated withBackFemale(Object backFemale) {
        this.backFemale = backFemale;
        return this;
    }

    @JsonProperty("back_shiny")
    public String getBackShiny() {
        return backShiny;
    }

    @JsonProperty("back_shiny")
    public void setBackShiny(String backShiny) {
        this.backShiny = backShiny;
    }

    public Animated withBackShiny(String backShiny) {
        this.backShiny = backShiny;
        return this;
    }

    @JsonProperty("back_shiny_female")
    public Object getBackShinyFemale() {
        return backShinyFemale;
    }

    @JsonProperty("back_shiny_female")
    public void setBackShinyFemale(Object backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
    }

    public Animated withBackShinyFemale(Object backShinyFemale) {
        this.backShinyFemale = backShinyFemale;
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

    public Animated withFrontDefault(String frontDefault) {
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

    public Animated withFrontFemale(Object frontFemale) {
        this.frontFemale = frontFemale;
        return this;
    }

    @JsonProperty("front_shiny")
    public String getFrontShiny() {
        return frontShiny;
    }

    @JsonProperty("front_shiny")
    public void setFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
    }

    public Animated withFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
        return this;
    }

    @JsonProperty("front_shiny_female")
    public Object getFrontShinyFemale() {
        return frontShinyFemale;
    }

    @JsonProperty("front_shiny_female")
    public void setFrontShinyFemale(Object frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
    }

    public Animated withFrontShinyFemale(Object frontShinyFemale) {
        this.frontShinyFemale = frontShinyFemale;
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

    public Animated withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("backDefault", backDefault).append("backFemale", backFemale).append("backShiny", backShiny).append("backShinyFemale", backShinyFemale).append("frontDefault", frontDefault).append("frontFemale", frontFemale).append("frontShiny", frontShiny).append("frontShinyFemale", frontShinyFemale).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(frontShinyFemale).append(backFemale).append(frontShiny).append(backDefault).append(frontDefault).append(additionalProperties).append(frontFemale).append(backShinyFemale).append(backShiny).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Animated) == false) {
            return false;
        }
        Animated rhs = ((Animated) other);
        return new EqualsBuilder().append(frontShinyFemale, rhs.frontShinyFemale).append(backFemale, rhs.backFemale).append(frontShiny, rhs.frontShiny).append(backDefault, rhs.backDefault).append(frontDefault, rhs.frontDefault).append(additionalProperties, rhs.additionalProperties).append(frontFemale, rhs.frontFemale).append(backShinyFemale, rhs.backShinyFemale).append(backShiny, rhs.backShiny).isEquals();
    }

}
