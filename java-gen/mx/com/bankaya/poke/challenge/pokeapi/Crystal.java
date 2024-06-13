
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
    "back_shiny_transparent",
    "back_transparent",
    "front_default",
    "front_shiny",
    "front_shiny_transparent",
    "front_transparent"
})
public class Crystal {

    @JsonProperty("back_default")
    private String backDefault;
    @JsonProperty("back_shiny")
    private String backShiny;
    @JsonProperty("back_shiny_transparent")
    private String backShinyTransparent;
    @JsonProperty("back_transparent")
    private String backTransparent;
    @JsonProperty("front_default")
    private String frontDefault;
    @JsonProperty("front_shiny")
    private String frontShiny;
    @JsonProperty("front_shiny_transparent")
    private String frontShinyTransparent;
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

    public Crystal withBackDefault(String backDefault) {
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

    public Crystal withBackShiny(String backShiny) {
        this.backShiny = backShiny;
        return this;
    }

    @JsonProperty("back_shiny_transparent")
    public String getBackShinyTransparent() {
        return backShinyTransparent;
    }

    @JsonProperty("back_shiny_transparent")
    public void setBackShinyTransparent(String backShinyTransparent) {
        this.backShinyTransparent = backShinyTransparent;
    }

    public Crystal withBackShinyTransparent(String backShinyTransparent) {
        this.backShinyTransparent = backShinyTransparent;
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

    public Crystal withBackTransparent(String backTransparent) {
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

    public Crystal withFrontDefault(String frontDefault) {
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

    public Crystal withFrontShiny(String frontShiny) {
        this.frontShiny = frontShiny;
        return this;
    }

    @JsonProperty("front_shiny_transparent")
    public String getFrontShinyTransparent() {
        return frontShinyTransparent;
    }

    @JsonProperty("front_shiny_transparent")
    public void setFrontShinyTransparent(String frontShinyTransparent) {
        this.frontShinyTransparent = frontShinyTransparent;
    }

    public Crystal withFrontShinyTransparent(String frontShinyTransparent) {
        this.frontShinyTransparent = frontShinyTransparent;
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

    public Crystal withFrontTransparent(String frontTransparent) {
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

    public Crystal withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("backDefault", backDefault).append("backShiny", backShiny).append("backShinyTransparent", backShinyTransparent).append("backTransparent", backTransparent).append("frontDefault", frontDefault).append("frontShiny", frontShiny).append("frontShinyTransparent", frontShinyTransparent).append("frontTransparent", frontTransparent).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(backTransparent).append(frontTransparent).append(backShinyTransparent).append(frontShiny).append(frontShinyTransparent).append(backDefault).append(frontDefault).append(additionalProperties).append(backShiny).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Crystal) == false) {
            return false;
        }
        Crystal rhs = ((Crystal) other);
        return new EqualsBuilder().append(backTransparent, rhs.backTransparent).append(frontTransparent, rhs.frontTransparent).append(backShinyTransparent, rhs.backShinyTransparent).append(frontShiny, rhs.frontShiny).append(frontShinyTransparent, rhs.frontShinyTransparent).append(backDefault, rhs.backDefault).append(frontDefault, rhs.frontDefault).append(additionalProperties, rhs.additionalProperties).append(backShiny, rhs.backShiny).isEquals();
    }

}
