package com.forhopssake.xbrew.data.impl;

import com.forhopssake.xbrew.data.HopUse;

// Implementation of a Hop addition that appears in a Recipe
public class HopAddition extends HopIngredient {
    private double amount; // Required
    private HopUse use;
    // Time in minutes from the end of the boil.
    private int time; //

    public HopAddition(String name) {
        super(name);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public HopUse getUse() {
        return use;
    }

    public void setUse(HopUse use) {
        this.use = use;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
