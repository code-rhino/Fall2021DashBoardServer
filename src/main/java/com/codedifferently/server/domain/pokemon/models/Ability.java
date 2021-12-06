package com.codedifferently.server.domain.pokemon.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ability { //done

    private AbilityData data;
    @JsonProperty("is_hidden")
    private Boolean isHidden;
    private Integer slot;

    public AbilityData getData() {
        return data;
    }

    public void setData(AbilityData data) {
        this.data = data;
    }

    public Boolean getHidden() {
        return isHidden;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public Integer getSlot() {
        return slot;
    }

    public void setSlot(Integer slot) {
        this.slot = slot;
    }


    @Override
    public String toString() {
        return "Ability{" +
                "data=" + data +
                ", isHidden=" + isHidden +
                ", slot=" + slot +
                '}';
    }
}
