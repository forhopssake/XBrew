package com.forhopssake.xbrew.data;

public interface Water extends Ingredient {
    public float getCalcium();
    public float getBicarbonate();
    public float getSulphate();
    public float getSodium();
    public float getChloride();
    public float getMagnesium();
    // todo: PH as aobjct with validation
    public float getPH();
}
