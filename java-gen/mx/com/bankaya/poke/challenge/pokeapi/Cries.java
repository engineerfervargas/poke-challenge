
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
    "latest",
    "legacy"
})
public class Cries {

    @JsonProperty("latest")
    private String latest;
    @JsonProperty("legacy")
    private String legacy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("latest")
    public String getLatest() {
        return latest;
    }

    @JsonProperty("latest")
    public void setLatest(String latest) {
        this.latest = latest;
    }

    public Cries withLatest(String latest) {
        this.latest = latest;
        return this;
    }

    @JsonProperty("legacy")
    public String getLegacy() {
        return legacy;
    }

    @JsonProperty("legacy")
    public void setLegacy(String legacy) {
        this.legacy = legacy;
    }

    public Cries withLegacy(String legacy) {
        this.legacy = legacy;
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

    public Cries withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("latest", latest).append("legacy", legacy).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(legacy).append(additionalProperties).append(latest).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cries) == false) {
            return false;
        }
        Cries rhs = ((Cries) other);
        return new EqualsBuilder().append(legacy, rhs.legacy).append(additionalProperties, rhs.additionalProperties).append(latest, rhs.latest).isEquals();
    }

}
