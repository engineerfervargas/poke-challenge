
package mx.com.bankaya.poke.challenge.pokeapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "move",
    "version_group_details"
})
public class Move {

    @JsonProperty("move")
    private Move_ move;
    @JsonProperty("version_group_details")
    private List<VersionGroupDetail> versionGroupDetails = new ArrayList<VersionGroupDetail>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("move")
    public Move_ getMove() {
        return move;
    }

    @JsonProperty("move")
    public void setMove(Move_ move) {
        this.move = move;
    }

    public Move withMove(Move_ move) {
        this.move = move;
        return this;
    }

    @JsonProperty("version_group_details")
    public List<VersionGroupDetail> getVersionGroupDetails() {
        return versionGroupDetails;
    }

    @JsonProperty("version_group_details")
    public void setVersionGroupDetails(List<VersionGroupDetail> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
    }

    public Move withVersionGroupDetails(List<VersionGroupDetail> versionGroupDetails) {
        this.versionGroupDetails = versionGroupDetails;
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

    public Move withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("move", move).append("versionGroupDetails", versionGroupDetails).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(move).append(versionGroupDetails).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Move) == false) {
            return false;
        }
        Move rhs = ((Move) other);
        return new EqualsBuilder().append(move, rhs.move).append(versionGroupDetails, rhs.versionGroupDetails).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
