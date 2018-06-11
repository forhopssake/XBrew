package com.forhopssake.xbrew.data.impl;

import com.forhopssake.xbrew.data.AbstractIngredient;
import com.forhopssake.xbrew.data.Flocculation;
import com.forhopssake.xbrew.data.Yeast;
import com.forhopssake.xbrew.data.YeastForm;
import com.forhopssake.xbrew.data.YeastType;

import java.util.ArrayList;
import java.util.List;

public class YeastIngredient extends AbstractIngredient implements Yeast {
    private YeastType type;
    private YeastForm form;
    private boolean amountIsWeight = false;
    private String labratory;
    private String productID;
    // min fermentation temperature in deg c
    private int minTemperature;
    // max fermentation temperature in deg c
    private int maxTemperature;
    private Flocculation flocculation;
    private double attenuation;
    private List<String> bestForStyles;
    private int maxReuse;


    private YeastIngredient(String name) {
        super(name);
        bestForStyles = new ArrayList<>();
    }

    @Override
    public YeastType getType() {
        return type;
    }

    @Override
    public YeastForm getForm() {
        return form;
    }

    @Override
    public boolean isDry() {
        return amountIsWeight;
    }

    @Override
    public boolean isLiquid() {
        return !amountIsWeight;
    }

    @Override
    public Flocculation getFlocculation() {
        return null;
    }

    @Override
    public double getAttenuation() {
        return 0;
    }

    @Override
    public List<String> getBestForStyle() {
        return bestForStyles;
    }

    public void addBestForStyle(String style) {
        this.bestForStyles.add(style)
    }

    @Override
    public int getMaxReuse() {
        return maxReuse;
    }

    public void setMaxReuse(int maxReuse) {
        this.maxReuse = maxReuse;
    }
}
