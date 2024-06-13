
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
    "red-blue",
    "yellow"
})
public class GenerationI {

    @JsonProperty("red-blue")
    private RedBlue redBlue;
    @JsonProperty("yellow")
    private Yellow yellow;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("red-blue")
    public RedBlue getRedBlue() {
        return redBlue;
    }

    @JsonProperty("red-blue")
    public void setRedBlue(RedBlue redBlue) {
        this.redBlue = redBlue;
    }

    public GenerationI withRedBlue(RedBlue redBlue) {
        this.redBlue = redBlue;
        return this;
    }

    @JsonProperty("yellow")
    public Yellow getYellow() {
        return yellow;
    }

    @JsonProperty("yellow")
    public void setYellow(Yellow yellow) {
        this.yellow = yellow;
    }

    public GenerationI withYellow(Yellow yellow) {
        this.yellow = yellow;
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

    public GenerationI withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("redBlue", redBlue).append("yellow", yellow).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(yellow).append(redBlue).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenerationI) == false) {
            return false;
        }
        GenerationI rhs = ((GenerationI) other);
        return new EqualsBuilder().append(yellow, rhs.yellow).append(redBlue, rhs.redBlue).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
