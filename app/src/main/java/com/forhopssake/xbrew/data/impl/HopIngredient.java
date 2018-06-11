package com.forhopssake.xbrew.data.impl;

import com.forhopssake.xbrew.data.AbstractIngredient;
import com.forhopssake.xbrew.data.Hop;
import com.forhopssake.xbrew.data.HopFormType;
import com.forhopssake.xbrew.data.HopUseType;

import java.util.List;

// Base implementation of a Hop.
public class HopIngredient extends AbstractIngredient implements Hop {
    private double alpha; // Required
    private double beta;
    // Hop Instability index as percent
    private double hsi;
    private double humulene;
    private double cohumulone;
    private double caryophyllene;
    private double myrcene;
    private HopUseType useType;
    private List<String> substitutes;
    private HopFormType hopFormType;

        public HopIngredient(String name) {
        super(name);
    }

    @Override
    public double getAlpha() {
        return 0;
    }

    public void setAlpha(double alpha) {
        this.alpha = alpha;
    }


    public double getBeta() {
        return beta;
    }

    public void setBeta(double beta) {
        this.beta = beta;
    }

    public double getHsi() {
        return hsi;
    }

    public void setHsi(double hsi) {
        this.hsi = hsi;
    }

    public double getHumulene() {
        return humulene;
    }

    public void setHumulene(double humulene) {
        this.humulene = humulene;
    }

    public double getCohumulone() {
        return cohumulone;
    }

    public void setCohumulone(double cohumulone) {
        this.cohumulone = cohumulone;
    }

    public double getCaryophyllene() {
        return caryophyllene;
    }

    public void setCaryophyllene(double caryophyllene) {
        this.caryophyllene = caryophyllene;
    }

    public double getMyrcene() {
        return myrcene;
    }

    public void setMyrcene(double myrcene) {
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
