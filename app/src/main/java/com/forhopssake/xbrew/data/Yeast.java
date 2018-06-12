package com.forhopssake.xbrew.data;

import java.util.List;

public interface Yeast extends Ingredient {

    public YeastType getType();

    public YeastForm getForm();

    public boolean isDry();

    public boolean isLiquid();

    public Flocculation getFlocculation();

    public float getAttenuation();

    public List<String> getBestForStyle();

    public int getMaxReuse();
}
