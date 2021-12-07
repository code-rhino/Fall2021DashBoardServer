package com.codedifferently.server.domain.pokemon.models.moves;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VersionGroupDetails {
    @JsonProperty("level_learned_at")
    private Integer levelLearnedAt;
    @JsonProperty("move_learn_method")
    private Integer moveLearnMethod;
    @JsonProperty("version_group")
    private VersionGroup versionGroup;

    public Integer getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt(Integer levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    public Integer getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(Integer moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

    @Override
    public String toString() {
        return "VersionGroupDetails{" +
                "levelLearnedAt=" + levelLearnedAt +
                ", moveLearnMethod=" + moveLearnMethod +
                ", versionGroup=" + versionGroup +
                '}';
    }
}
