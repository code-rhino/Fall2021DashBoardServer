package com.codedifferently.server.domain.pokemon.models;

public class Ability {
    private String name;
    private String url;
    private Boolean isHidden;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    private Integer slot;

    @Override
    public String toString() {
        return "Abilities{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", isHidden=" + isHidden +
                ", slot=" + slot +
                '}';
    }
}
