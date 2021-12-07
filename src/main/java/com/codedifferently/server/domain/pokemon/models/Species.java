package com.codedifferently.server.domain.pokemon.models;

public class Species {
    private String name;
    private String url;

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

    @Override
    public String toString() {
        return "Species{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
