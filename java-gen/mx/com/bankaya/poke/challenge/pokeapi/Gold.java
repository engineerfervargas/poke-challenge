
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
    "back_shiny",
    "front_default",
    "front_shiny",
    "front_transparent"
})
public class Gold {

    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("back_shiny")
    private String backShiny;
    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_shiny")
    private String frontShiny;
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

    public Gold withBackDefault(String backDefault) {
        this.backDefault = backDefault;
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

    public Gold withBackShiny(String backShiny) {
        this.backShiny = backShiny;
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

    public Gold withFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
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

    public Gold withFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
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

    public Gold withFrontTransparent(String frontTransparent) {
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

    public Gold withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("backDefault", backDefault).append("backShiny", backShiny).append("frontDefault", frontDefault).append("frontShiny", frontShiny).append("frontTransparent", frontTransparent).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(frontTransparent).append(frontShiny).append(backDefault).append(frontDefault).append(additionalProperties).append(backShiny).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Gold) == false) {
            return false;
        }
        Gold rhs = ((Gold) other);
        return new EqualsBuilder().append(frontTransparent, rhs.frontTransparent).append(frontShiny, rhs.frontShiny).append(backDefault, rhs.backDefault).append(frontDefault, rhs.frontDefault).append(additionalProperties, rhs.additionalProperties).append(backShiny, rhs.backShiny).isEquals();
    }

}
