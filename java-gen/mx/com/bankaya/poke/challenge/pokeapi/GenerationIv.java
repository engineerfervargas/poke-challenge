
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
    "diamond-pearl",
    "heartgold-soulsilver",
    "platinum"
})
public class GenerationIv {

    @JsonProperty("diamond-pearl")
    private DiamondPearl diamondPearl;
    @JsonProperty("heartgold-soulsilver")
    private HeartgoldSoulsilver heartgoldSoulsilver;
    @JsonProperty("platinum")
    private Platinum platinum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("diamond-pearl")
    public DiamondPearl getDiamondPearl() {
        return diamondPearl;
    }

    @JsonProperty("diamond-pearl")
    public void setDiamondPearl(DiamondPearl diamondPearl) {
        this.diamondPearl = diamondPearl;
    }

    public GenerationIv withDiamondPearl(DiamondPearl diamondPearl) {
        this.diamondPearl = diamondPearl;
        return this;
    }

    @JsonProperty("heartgold-soulsilver")
    public HeartgoldSoulsilver getHeartgoldSoulsilver() {
        return heartgoldSoulsilver;
    }

    @JsonProperty("heartgold-soulsilver")
    public void setHeartgoldSoulsilver(HeartgoldSoulsilver heartgoldSoulsilver) {
        this.heartgoldSoulsilver = heartgoldSoulsilver;
    }

    public GenerationIv withHeartgoldSoulsilver(HeartgoldSoulsilver heartgoldSoulsilver) {
        this.heartgoldSoulsilver = heartgoldSoulsilver;
        return this;
    }

    @JsonProperty("platinum")
    public Platinum getPlatinum() {
        return platinum;
    }

    @JsonProperty("platinum")
    public void setPlatinum(Platinum platinum) {
        this.platinum = platinum;
    }

    public GenerationIv withPlatinum(Platinum platinum) {
        this.platinum = platinum;
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

    public GenerationIv withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("diamondPearl", diamondPearl).append("heartgoldSoulsilver", heartgoldSoulsilver).append("platinum", platinum).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(platinum).append(heartgoldSoulsilver).append(additionalProperties).append(diamondPearl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GenerationIv) == false) {
            return false;
        }
        GenerationIv rhs = ((GenerationIv) other);
        return new EqualsBuilder().append(platinum, rhs.platinum).append(heartgoldSoulsilver, rhs.heartgoldSoulsilver).append(additionalProperties, rhs.additionalProperties).append(diamondPearl, rhs.diamondPearl).isEquals();
    }

}
