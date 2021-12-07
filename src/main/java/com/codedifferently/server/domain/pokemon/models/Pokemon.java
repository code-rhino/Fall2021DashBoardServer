package com.codedifferently.server.domain.pokemon.models;

import com.codedifferently.server.domain.pokemon.models.moves.Move;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Pokemon {

    @JsonProperty("base_experience")
    private Integer baseExperience;
    @JsonProperty("game_indices")
    private ArrayList <GameIndex> gameIndices;
    private ArrayList<Move> moves;
    @JsonProperty("abilities")
    private ArrayList<Ability> abilities;
    private ArrayList<Form> form;
    private Integer height;
    @JsonProperty("held_items")
    private ArrayList<HeldItem> heldItems;
    private Integer id;
    @JsonProperty("is_default")
    private Boolean isDefault;
    @JsonProperty("location_area_encounters")
    private String locationAreaEncounters;
    private String name;
    private Integer order;
    @JsonProperty("past_types")//*******
    private ArrayList<PastType> pastType;
    private Species species;
    private ArrayList<Stat> states;
    private ArrayList<Type> types;
    private Integer weight;

    public Integer getBaseExperience() {
        return baseExperience;
    }

    public ArrayList<GameIndex> getGameIndices() {
        return gameIndices;
    }

    public void setGameIndices(ArrayList<GameIndex> gameIndices) {
        this.gameIndices = gameIndices;
    }

    public void setBaseExperience(Integer baseExperience) {
        this.baseExperience = baseExperience;

    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public ArrayList<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(ArrayList<Ability> abilities) {
        this.abilities = abilities;
    }

    public ArrayList<Form> getForm() {
        return form;
    }

    public void setForm(ArrayList<Form> form) {
        this.form = form;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ArrayList<HeldItem> getHeldItems() {
        return heldItems;
    }

    public void setHeldItems(ArrayList<HeldItem> heldItems) {
        this.heldItems = heldItems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    public void setLocationAreaEncounters(String locationAreaEncounters) {
        this.locationAreaEncounters = locationAreaEncounters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public ArrayList<PastType> getPastType() {
        return pastType;
    }

    public void setPastType(ArrayList<PastType> pastType) {
        this.pastType = pastType;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public ArrayList<Stat> getStates() {
        return states;
    }

    public void setStates(ArrayList<Stat> states) {
        this.states = states;
    }

    public ArrayList<Type> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<Type> types) {
        this.types = types;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "baseExperience=" + baseExperience +
                ", gameIndices=" + gameIndices +
                ", moves=" + moves +
                ", abilities=" + abilities +
                ", form=" + form +
                ", height=" + height +
                ", heldItems=" + heldItems +
                ", id=" + id +
                ", isDefault=" + isDefault +
                ", locationAreaEncounters='" + locationAreaEncounters + '\'' +
                ", name='" + name + '\'' +
                ", order=" + order +
                ", pastType=" + pastType +
                ", species=" + species +
                ", states=" + states +
                ", types=" + types +
                ", weight=" + weight +
                '}';
    }
}
