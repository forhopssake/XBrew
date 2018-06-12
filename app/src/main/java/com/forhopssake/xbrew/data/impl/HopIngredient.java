package com.forhopssake.xbrew.data.impl;

import com.forhopssake.xbrew.data.AbstractIngredient;
import com.forhopssake.xbrew.data.Hop;
import com.forhopssake.xbrew.data.HopFormType;
import com.forhopssake.xbrew.data.HopUseType;

import java.util.List;

// Base implementation of a Hop.
public class HopIngredient extends AbstractIngredient implements Hop {
    private float alpha; // Required
    private float beta;
    // Hop Instability index as percent
    private float hsi;
    private float humulene;
    private float cohumulone;
    private float caryophyllene;
    private float myrcene;
    private HopUseType useType;
    private List<String> substitutes;
    private HopFormType hopFormType;

        public HopIngredient(String name) {
        super(name);
    }

    @Override
    public float getAlpha() {
        return 0;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }


    public float getBeta() {
        return beta;
    }

    public void setBeta(float beta) {
        this.beta = beta;
    }

    public float getHsi() {
        return hsi;
    }

    public void setHsi(float hsi) {
        this.hsi = hsi;
    }

    public float getHumulene() {
        return humulene;
    }

    public void setHumulene(float humulene) {
        this.humulene = humulene;
    }

    public float getCohumulone() {
        return cohumulone;
    }

    public void setCohumulone(float cohumulone) {
        this.cohumulone = cohumulone;
    }

    public float getCaryophyllene() {
        return caryophyllene;
    }

    public void setCaryophyllene(float caryophyllene) {
        this.caryophyllene = caryophyllene;
    }

    public float getMyrcene() {
        return myrcene;
    }

    public void setMyrcene(float myrcene) {
        this.myrcene = myrcene;
    }

    public HopUseType getUseType() {
        return useType;
    }

    public void setUseType(HopUseType useType) {
        this.useType = useType;
    }

    public List<String> getSubstitutes() {
        return substitutes;
    }

    public void setSubstitutes(List<String> substitutes) {
        this.substitutes = substitutes;
    }

    public HopFormType getHopFormType() {
        return hopFormType;
    }

    public void setHopFormType(HopFormType hopFormType) {
        this.hopFormType = hopFormType;
    }
}
