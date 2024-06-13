
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
    "abilities",
    "base_experience",
    "cries",
    "forms",
    "game_indices",
    "height",
    "held_items",
    "id",
    "is_default",
    "location_area_encounters",
    "moves",
    "name",
    "order",
    "past_abilities",
    "past_types",
    "species",
    "sprites",
    "stats",
    "types",
    "weight"
})
public class Pokemon {

    @JsonProperty("abilities")
    private List<Ability> abilities = new ArrayList<Ability>();
    @JsonProperty("base_experience")
    private Integer baseExperience;
    @JsonProperty("cries")
    private Cries cries;
    @JsonProperty("forms")
    private List<Form> forms = new ArrayList<Form>();
    @JsonProperty("game_indices")
    private List<GameIndex> gameIndices = new ArrayList<GameIndex>();
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("held_items")
    private List<HeldItem> heldItems = new ArrayList<HeldItem>();
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("is_default")
    private Boolean isDefault;
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;
    @JsonProperty("moves")
    private List<Move> moves = new ArrayList<Move>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("past_abilities")
    private List<Object> pastAbilities = new ArrayList<Object>();
    @JsonProperty("past_types")
    private List<Object> pastTypes = new ArrayList<Object>();
    @JsonProperty("species")
    private Species species;
    @JsonProperty("sprites")
    private Sprites sprites;
    @JsonProperty("stats")
    private List<Stat> stats = new ArrayList<Stat>();
    @JsonProperty("types")
    private List<Type> types = new ArrayList<Type>();
    @JsonProperty("weight")
    private Integer weight;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("abilities")
    public List<Ability> getAbilities() {
        return abilities;
    }

    @JsonProperty("abilities")
    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public Pokemon withAbilities(List<Ability> abilities) {
        this.abilities = abilities;
        return this;
    }

    @JsonProperty("base_experience")
    public Integer getBaseExperience() {
        return baseExperience;
    }

    @JsonProperty("base_experience")
    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
    }

    public Pokemon withBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;
        return this;
    }

    @JsonProperty("cries")
    public Cries getCries() {
        return cries;
    }

    @JsonProperty("cries")
    public void setCries(Cries cries) {
        this.cries = cries;
    }

    public Pokemon withCries(Cries cries) {
        this.cries = cries;
        return this;
    }

    @JsonProperty("forms")
    public List<Form> getForms() {
        return forms;
    }

    @JsonProperty("forms")
    public void setForms(List<Form> forms) {
        this.forms = forms;
    }

    public Pokemon withForms(List<Form> forms) {
        this.forms = forms;
        return this;
    }

    @JsonProperty("game_indices")
    public List<GameIndex> getGameIndices() {
        return gameIndices;
    }

    @JsonProperty("game_indices")
    public void setGameIndices(List<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public Pokemon withGameIndices(List<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
        return this;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Pokemon withHeight(Integer height) {
        this.height = height;
        return this;
    }

    @JsonProperty("held_items")
    public List<HeldItem> getHeldItems() {
        return heldItems;
    }

    @JsonProperty("held_items")
    public void setHeldItems(List<HeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    public Pokemon withHeldItems(List<HeldItem> heldItems) {
        this.heldItems = heldItems;
        return this;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Pokemon withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("is_default")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("is_default")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Pokemon withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    @JsonProperty("location_area_encounters")
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    @JsonProperty("location_area_encounters")
    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public Pokemon withLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
        return this;
    }

    @JsonProperty("moves")
    public List<Move> getMoves() {
        return moves;
    }

    @JsonProperty("moves")
    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Pokemon withMoves(List<Move> moves) {
        this.moves = moves;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Pokemon withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    public Pokemon withOrder(Integer order) {
        this.order = order;
        return this;
    }

    @JsonProperty("past_abilities")
    public List<Object> getPastAbilities() {
        return pastAbilities;
    }

    @JsonProperty("past_abilities")
    public void setPastAbilities(List<Object> pastAbilities) {
        this.pastAbilities = pastAbilities;
    }

    public Pokemon withPastAbilities(List<Object> pastAbilities) {
        this.pastAbilities = pastAbilities;
        return this;
    }

    @JsonProperty("past_types")
    public List<Object> getPastTypes() {
        return pastTypes;
    }

    @JsonProperty("past_types")
    public void setPastTypes(List<Object> pastTypes) {
        this.pastTypes = pastTypes;
    }

    public Pokemon withPastTypes(List<Object> pastTypes) {
        this.pastTypes = pastTypes;
        return this;
    }

    @JsonProperty("species")
    public Species getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(Species species) {
        this.species = species;
    }

    public Pokemon withSpecies(Species species) {
        this.species = species;
        return this;
    }

    @JsonProperty("sprites")
    public Sprites getSprites() {
        return sprites;
    }

    @JsonProperty("sprites")
    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public Pokemon withSprites(Sprites sprites) {
        this.sprites = sprites;
        return this;
    }

    @JsonProperty("stats")
    public List<Stat> getStats() {
        return stats;
    }

    @JsonProperty("stats")
    public void setStats(List<Stat> stats) {
        this.stats = stats;
    }

    public Pokemon withStats(List<Stat> stats) {
        this.stats = stats;
        return this;
    }

    @JsonProperty("types")
    public List<Type> getTypes() {
        return types;
    }

    @JsonProperty("types")
    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public Pokemon withTypes(List<Type> types) {
        this.types = types;
        return this;
    }

    @JsonProperty("weight")
    public Integer getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Pokemon withWeight(Integer weight) {
        this.weight = weight;
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

    public Pokemon withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("abilities", abilities).append("baseExperience", baseExperience).append("cries", cries).append("forms", forms).append("gameIndices", gameIndices).append("height", height).append("heldItems", heldItems).append("id", id).append("isDefault", isDefault).append("locationAreaEncounters", locationAreaEncounters).append("moves", moves).append("name", name).append("order", order).append("pastAbilities", pastAbilities).append("pastTypes", pastTypes).append("species", species).append("sprites", sprites).append("stats", stats).append("types", types).append("weight", weight).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cries).append(types).append(pastAbilities).append(weight).append(sprites).append(heldItems).append(abilities).append(isDefault).append(gameIndices).append(species).append(stats).append(moves).append(baseExperience).append(name).append(id).append(additionalProperties).append(forms).append(pastTypes).append(height).append(locationAreaEncounters).append(order).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Pokemon) == false) {
            return false;
        }
        Pokemon rhs = ((Pokemon) other);
        return new EqualsBuilder().append(cries, rhs.cries).append(types, rhs.types).append(pastAbilities, rhs.pastAbilities).append(weight, rhs.weight).append(sprites, rhs.sprites).append(heldItems, rhs.heldItems).append(abilities, rhs.abilities).append(isDefault, rhs.isDefault).append(gameIndices, rhs.gameIndices).append(species, rhs.species).append(stats, rhs.stats).append(moves, rhs.moves).append(baseExperience, rhs.baseExperience).append(name, rhs.name).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(forms, rhs.forms).append(pastTypes, rhs.pastTypes).append(height, rhs.height).append(locationAreaEncounters, rhs.locationAreaEncounters).append(order, rhs.order).isEquals();
    }

}
