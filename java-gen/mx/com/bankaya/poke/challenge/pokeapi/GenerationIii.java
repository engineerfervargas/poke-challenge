
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
    "emerald",
    "firered-leafgreen",
    "ruby-sapphire"
})
public class GenerationIii {

    @JsonProperty("emerald")
    private Emerald emerald;
    @JsonProperty("firered-leafgreen")
    private FireredLeafgreen fireredLeafgreen;
    @JsonProperty("ruby-sapphire")
    private RubySapphire rubySapphire;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("emerald")
    public Emerald getEmerald() {
        return emerald;
    }

    @JsonProperty("emerald")
    public void setEmerald(Emerald emerald) {
        this.emerald = emerald;
    }

    public GenerationIii withEmerald(Emerald emerald) {
        this.emerald = emerald;
        return this;
    }

    @JsonProperty("firered-leafgreen")
    public FireredLeafgreen getFireredLeafgreen() {
        return fireredLeafgreen;
    }

    @JsonProperty("firered-leafgreen")
    public void setFireredLeafgreen(FireredLeafgreen fireredLeafgreen) {
        this.fireredLeafgreen = fireredLeafgreen;
    }

    public GenerationIii withFireredLeafgreen(FireredLeafgreen fireredLeafgreen) {
        this.fireredLeafgreen = fireredLeafgreen;
        return this;
    }

    @JsonProperty("ruby-sapphire")
    public RubySapphire getRubySapphire() {
        return rubySapphire;
    }

    @JsonProperty("ruby-sapphire")
    public void setRubySapphire(RubySapphire rubySapphire) {
        this.rubySapphire = rubySapphire;
    }

    public GenerationIii withRubySapphire(RubySapphire rubySapphire) {
        this.rubySapphire = rubySapphire;
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

    public GenerationIii withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("emerald", emerald).append("fireredLeafgreen", fireredLeafgreen).append("rubySapphire", rubySapphire).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fireredLeafgreen).append(rubySapphire).append(additionalProperties).append(emerald).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenerationIii) == false) {
            return false;
        }
        GenerationIii rhs = ((GenerationIii) other);
        return new EqualsBuilder().append(fireredLeafgreen, rhs.fireredLeafgreen).append(rubySapphire, rhs.rubySapphire).append(additionalProperties, rhs.additionalProperties).append(emerald, rhs.emerald).isEquals();
    }

}
