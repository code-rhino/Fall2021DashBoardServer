package com.codedifferently.server.domain.pokemon.models.moves;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Move {
    @JsonProperty("move")
    private MoveData moveData;
    @JsonProperty("version_group_details")
    private ArrayList <VersionGroupDetails> versionGrDet;

    public MoveData getMoveData() {
        return moveData;
    }

    public void setMoveData(MoveData moveData) {
        this.moveData = moveData;
    }

    public ArrayList<VersionGroupDetails> getVersionGrDet() {
        return versionGrDet;
    }

    public void setVersionGrDet(ArrayList<VersionGroupDetails> versionGrDet) {
        this.versionGrDet = versionGrDet;
    }

    @Override
    public String toString() {
        return "Move{" +
                "moveData=" + moveData +
                ", versionGrDet=" + versionGrDet +
                '}';
    }
}
