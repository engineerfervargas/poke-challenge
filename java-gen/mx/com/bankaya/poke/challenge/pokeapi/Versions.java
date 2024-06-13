
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
    "generation-i",
    "generation-ii",
    "generation-iii",
    "generation-iv",
    "generation-v",
    "generation-vi",
    "generation-vii",
    "generation-viii"
})
public class Versions {

    @JsonProperty("generation-i")
    private GenerationI generationI;
    @JsonProperty("generation-ii")
    private GenerationIi generationIi;
    @JsonProperty("generation-iii")
    private GenerationIii generationIii;
    @JsonProperty("generation-iv")
    private GenerationIv generationIv;
    @JsonProperty("generation-v")
    private GenerationV generationV;
    @JsonProperty("generation-vi")
    private GenerationVi generationVi;
    @JsonProperty("generation-vii")
    private GenerationVii generationVii;
    @JsonProperty("generation-viii")
    private GenerationViii generationViii;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("generation-i")
    public GenerationI getGenerationI() {
        return generationI;
    }

    @JsonProperty("generation-i")
    public void setGenerationI(GenerationI generationI) {
        this.generationI = generationI;
    }

    public Versions withGenerationI(GenerationI generationI) {
        this.generationI = generationI;
        return this;
    }

    @JsonProperty("generation-ii")
    public GenerationIi getGenerationIi() {
        return generationIi;
    }

    @JsonProperty("generation-ii")
    public void setGenerationIi(GenerationIi generationIi) {
        this.generationIi = generationIi;
    }

    public Versions withGenerationIi(GenerationIi generationIi) {
        this.generationIi = generationIi;
        return this;
    }

    @JsonProperty("generation-iii")
    public GenerationIii getGenerationIii() {
        return generationIii;
    }

    @JsonProperty("generation-iii")
    public void setGenerationIii(GenerationIii generationIii) {
        this.generationIii = generationIii;
    }

    public Versions withGenerationIii(GenerationIii generationIii) {
        this.generationIii = generationIii;
        return this;
    }

    @JsonProperty("generation-iv")
    public GenerationIv getGenerationIv() {
        return generationIv;
    }

    @JsonProperty("generation-iv")
    public void setGenerationIv(GenerationIv generationIv) {
        this.generationIv = generationIv;
    }

    public Versions withGenerationIv(GenerationIv generationIv) {
        this.generationIv = generationIv;
        return this;
    }

    @JsonProperty("generation-v")
    public GenerationV getGenerationV() {
        return generationV;
    }

    @JsonProperty("generation-v")
    public void setGenerationV(GenerationV generationV) {
        this.generationV = generationV;
    }

    public Versions withGenerationV(GenerationV generationV) {
        this.generationV = generationV;
        return this;
    }

    @JsonProperty("generation-vi")
    public GenerationVi getGenerationVi() {
        return generationVi;
    }

    @JsonProperty("generation-vi")
    public void setGenerationVi(GenerationVi generationVi) {
        this.generationVi = generationVi;
    }

    public Versions withGenerationVi(GenerationVi generationVi) {
        this.generationVi = generationVi;
        return this;
    }

    @JsonProperty("generation-vii")
    public GenerationVii getGenerationVii() {
        return generationVii;
    }

    @JsonProperty("generation-vii")
    public void setGenerationVii(GenerationVii generationVii) {
        this.generationVii = generationVii;
    }

    public Versions withGenerationVii(GenerationVii generationVii) {
        this.generationVii = generationVii;
        return this;
    }

    @JsonProperty("generation-viii")
    public GenerationViii getGenerationViii() {
        return generationViii;
    }

    @JsonProperty("generation-viii")
    public void setGenerationViii(GenerationViii generationViii) {
        this.generationViii = generationViii;
    }

    public Versions withGenerationViii(GenerationViii generationViii) {
        this.generationViii = generationViii;
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

    public Versions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("generationI", generationI).append("generationIi", generationIi).append("generationIii", generationIii).append("generationIv", generationIv).append("generationV", generationV).append("generationVi", generationVi).append("generationVii", generationVii).append("generationViii", generationViii).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(generationV).append(generationIii).append(generationIv).append(generationVii).append(generationVi).append(generationIi).append(additionalProperties).append(generationViii).append(generationI).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Versions) == false) {
            return false;
        }
        Versions rhs = ((Versions) other);
        return new EqualsBuilder().append(generationV, rhs.generationV).append(generationIii, rhs.generationIii).append(generationIv, rhs.generationIv).append(generationVii, rhs.generationVii).append(generationVi, rhs.generationVi).append(generationIi, rhs.generationIi).append(additionalProperties, rhs.additionalProperties).append(generationViii, rhs.generationViii).append(generationI, rhs.generationI).isEquals();
    }

}
