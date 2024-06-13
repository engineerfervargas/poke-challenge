
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
    "level_learned_at",
    "move_learn_method",
    "version_group"
})
public class VersionGroupDetail {

    @JsonProperty("level_learned_at")
    private Integer levelLearnedAt;
    @JsonProperty("move_learn_method")
    private MoveLearnMethod moveLearnMethod;
    @JsonProperty("version_group")
    private VersionGroup versionGroup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("level_learned_at")
    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    @JsonProperty("level_learned_at")
    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    public VersionGroupDetail withLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
        return this;
    }

    @JsonProperty("move_learn_method")
    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    @JsonProperty("move_learn_method")
    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public VersionGroupDetail withMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
        return this;
    }

    @JsonProperty("version_group")
    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    @JsonProperty("version_group")
    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

    public VersionGroupDetail withVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
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

    public VersionGroupDetail withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("levelLearnedAt", levelLearnedAt).append("moveLearnMethod", moveLearnMethod).append("versionGroup", versionGroup).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(moveLearnMethod).append(additionalProperties).append(versionGroup).append(levelLearnedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionGroupDetail) == false) {
            return false;
        }
        VersionGroupDetail rhs = ((VersionGroupDetail) other);
        return new EqualsBuilder().append(moveLearnMethod, rhs.moveLearnMethod).append(additionalProperties, rhs.additionalProperties).append(versionGroup, rhs.versionGroup).append(levelLearnedAt, rhs.levelLearnedAt).isEquals();
    }

}
