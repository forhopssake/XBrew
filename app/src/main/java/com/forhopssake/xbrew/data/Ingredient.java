package com.forhopssake.xbrew.data;

public interface Ingredient {
    public String getName();

    public int getVersion();

    // The amount in Kilograms or litres if yeast starter
    public double getAmount();

    public String getNotes();
}
