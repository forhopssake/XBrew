package com.forhopssake.xbrew.data.impl;

import com.forhopssake.xbrew.data.Beer;

import java.util.ArrayList;
import java.util.List;

public class Recipe implements Beer {
    private String name;
    private int version;
    private List<HopAddition> hops;
    private List<Fermentable> fermentables;
    private String style;

    public Recipe() {
        hops = new ArrayList<>();
        fermentables = new ArrayList<>();
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addHop(HopAddition hop) {
        hops.add(hop);
    }

    public List<HopAddition> getHops() {
        return hops;
    }

    public void addFermentable(Fermentable fermentable) {
        this.fermentables.add(fermentable);
    }

    public List<Fermentable> getFermentables() {
        return fermentables;
    }

    // TODO: can this be an enum? need to take year into account
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
