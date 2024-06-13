
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
    "dream_world",
    "home",
    "official-artwork",
    "showdown"
})
public class Other {

    @JsonProperty("dream_world")
    private DreamWorld dreamWorld;
    @JsonProperty("home")
    private Home home;
    @JsonProperty("official-artwork")
    private OfficialArtwork officialArtwork;
    @JsonProperty("showdown")
    private Showdown showdown;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dream_world")
    public DreamWorld getDreamWorld() {
        return dreamWorld;
    }

    @JsonProperty("dream_world")
    public void setDreamWorld(DreamWorld dreamWorld) {
        this.dreamWorld = dreamWorld;
    }

    public Other withDreamWorld(DreamWorld dreamWorld) {
        this.dreamWorld = dreamWorld;
        return this;
    }

    @JsonProperty("home")
    public Home getHome() {
        return home;
    }

    @JsonProperty("home")
    public void setHome(Home home) {
        this.home = home;
    }

    public Other withHome(Home home) {
        this.home = home;
        return this;
    }

    @JsonProperty("official-artwork")
    public OfficialArtwork getOfficialArtwork() {
        return officialArtwork;
    }

    @JsonProperty("official-artwork")
    public void setOfficialArtwork(OfficialArtwork officialArtwork) {
        this.officialArtwork = officialArtwork;
    }

    public Other withOfficialArtwork(OfficialArtwork officialArtwork) {
        this.officialArtwork = officialArtwork;
        return this;
    }

    @JsonProperty("showdown")
    public Showdown getShowdown() {
        return showdown;
    }

    @JsonProperty("showdown")
    public void setShowdown(Showdown showdown) {
        this.showdown = showdown;
    }

    public Other withShowdown(Showdown showdown) {
        this.showdown = showdown;
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

    public Other withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dreamWorld", dreamWorld).append("home", home).append("officialArtwork", officialArtwork).append("showdown", showdown).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(officialArtwork).append(showdown).append(additionalProperties).append(dreamWorld).append(home).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Other) == false) {
            return false;
        }
        Other rhs = ((Other) other);
        return new EqualsBuilder().append(officialArtwork, rhs.officialArtwork).append(showdown, rhs.showdown).append(additionalProperties, rhs.additionalProperties).append(dreamWorld, rhs.dreamWorld).append(home, rhs.home).isEquals();
    }

}
