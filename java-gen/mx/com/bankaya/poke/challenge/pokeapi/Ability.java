
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
    "ability",
    "is_hidden",
    "slot"
})
public class Ability {

    @JsonProperty("ability")
    private Ability_ ability;
    @JsonProperty("is_hidden")
    private Boolean isHidden;
    @JsonProperty("slot")
    private Integer slot;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ability")
    public Ability_ getAbility() {
        return ability;
    }

    @JsonProperty("ability")
    public void setAbility(Ability_ ability) {
        this.ability = ability;
    }

    public Ability withAbility(Ability_ ability) {
        this.ability = ability;
        return this;
    }

    @JsonProperty("is_hidden")
    public Boolean getIsHidden() {
        return isHidden;
    }

    @JsonProperty("is_hidden")
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Ability withIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    @JsonProperty("slot")
    public Integer getSlot() {
        return slot;
    }

    @JsonProperty("slot")
    public void setSlot(Integer slot) {
        this.slot = slot;
    }

    public Ability withSlot(Integer slot) {
        this.slot = slot;
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

    public Ability withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ability", ability).append("isHidden", isHidden).append("slot", slot).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ability).append(slot).append(additionalProperties).append(isHidden).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ability) == false) {
            return false;
        }
        Ability rhs = ((Ability) other);
        return new EqualsBuilder().append(ability, rhs.ability).append(slot, rhs.slot).append(additionalProperties, rhs.additionalProperties).append(isHidden, rhs.isHidden).isEquals();
    }

}
