
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
    "rarity",
    "version"
})
public class VersionDetail {

    @JsonProperty("rarity")
    private Integer rarity;
    @JsonProperty("version")
    private Version_ version;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rarity")
    public Integer getRarity() {
        return rarity;
    }

    @JsonProperty("rarity")
    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public VersionDetail withRarity(Integer rarity) {
        this.rarity = rarity;
        return this;
    }

    @JsonProperty("version")
    public Version_ getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Version_ version) {
        this.version = version;
    }

    public VersionDetail withVersion(Version_ version) {
        this.version = version;
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

    public VersionDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rarity", rarity).append("version", version).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(version).append(rarity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionDetail) == false) {
            return false;
        }
        VersionDetail rhs = ((VersionDetail) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(version, rhs.version).append(rarity, rhs.rarity).isEquals();
    }

}
