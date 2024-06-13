
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
    "crystal",
    "gold",
    "silver"
})
public class GenerationIi {

    @JsonProperty("crystal")
    private Crystal crystal;
    @JsonProperty("gold")
    private Gold gold;
    @JsonProperty("silver")
    private Silver silver;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("crystal")
    public Crystal getCrystal() {
        return crystal;
    }

    @JsonProperty("crystal")
    public void setCrystal(Crystal crystal) {
        this.crystal = crystal;
    }

    public GenerationIi withCrystal(Crystal crystal) {
        this.crystal = crystal;
        return this;
    }

    @JsonProperty("gold")
    public Gold getGold() {
        return gold;
    }

    @JsonProperty("gold")
    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public GenerationIi withGold(Gold gold) {
        this.gold = gold;
        return this;
    }

    @JsonProperty("silver")
    public Silver getSilver() {
        return silver;
    }

    @JsonProperty("silver")
    public void setSilver(Silver silver) {
        this.silver = silver;
    }

    public GenerationIi withSilver(Silver silver) {
        this.silver = silver;
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

    public GenerationIi withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("crystal", crystal).append("gold", gold).append("silver", silver).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(gold).append(silver).append(additionalProperties).append(crystal).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenerationIi) == false) {
            return false;
        }
        GenerationIi rhs = ((GenerationIi) other);
        return new EqualsBuilder().append(gold, rhs.gold).append(silver, rhs.silver).append(additionalProperties, rhs.additionalProperties).append(crystal, rhs.crystal).isEquals();
    }

}
