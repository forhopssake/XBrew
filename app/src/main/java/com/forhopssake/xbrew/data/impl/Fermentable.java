package com.forhopssake.xbrew.data.impl;

import com.forhopssake.xbrew.data.FermentableType;

public class Fermentable {
    private String name; // Required
    private int version = 1; // Required
    private FermentableType type; // Required
    // Weight of the fermentable, extract or sugar in Kilograms.
    private float amount; // Required
    // Percent dry yield (fine grain) for the grain, or the raw
    // yield by weight if this is an extract adjunct or sugar.
    private float yield; // Required
    // The color of the item in Lovibond Units (SRM for liquid extracts).
    private float colour; // Required
    // May be TRUE if this item is normally added after the boil.
    // The default value is FALSE since most grains are added during the mash or boil.
    private boolean addAfterBoil;
    // Country or place of origin
    private String origin;
    // Supplier of the grain/extract/sugar
    private String supplier;

    // Percent difference between the coarse grain yield and fine grain yield.
    // Only appropriate for a "Grain" or "Adjunct" type, otherwise this value is ignored.
    private float courseFineFine;
    // Percent moisture in the grain.
    // Only appropriate for a "Grain" or "Adjunct" type, otherwise this value is ignored.
    private float moisture;
    // The diastatic power of the grain as measured in "Lintner" units.
    // Only appropriate for a "Grain" or "Adjunct" type, otherwise this value is ignored.
    private float diasticPower;
    // The percent protein in the grain.
    // Only appropriate for a "Grain" or "Adjunct" type, otherwise this value is ignored.
    private float protein;
    // The recommended maximum percentage (by weight)
    // this ingredient should represent in a batch of beer.
    private float maxInBatch;
    // TRUE if it is recommended the grain be mashed, FALSE if it can be steeped.
    // A value of TRUE is only appropriate for a "Grain" or "Adjunct" types.
    // The default value is FALSE.  Note that this does NOT indicate whether the grain
    // is mashed or not – it is only a recommendation used in recipe formulation.
    private boolean mashRecommended;
    //For hopped extracts only - an estimate of the number of IBUs per pound of extract
    // in a gallon of water.  To convert to IBUs we multiply this number by the "AMOUNT"
    // field (in pounds) and divide by the number of gallons in the batch.
    // Based on a sixty minute boil.
    // Only suitable for use with an "Extract" type, otherwise this value is ignored.
    private int IBUPerGallonPerPound;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public FermentableType getType() {
        return type;
    }

    public void setType(FermentableType type) {
        this.type = type;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getYield() {
        return yield;
    }

    public void setYield(float yield) {
        this.yield = yield;
    }

    public float getColour() {
        return colour;
    }

    public void setColour(float colour) {
        this.colour = colour;
    }

    public boolean isAddAfterBoil() {
        return addAfterBoil;
    }

    public void setAddAfterBoil(boolean addAfterBoil) {
        this.addAfterBoil = addAfterBoil;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public float getCourseFineFine() {
        return courseFineFine;
    }

    public void setCourseFineFine(float courseFineFine) {
        this.courseFineFine = courseFineFine;
    }

    public float getMoisture() {
        return moisture;
    }

    public void setMoisture(float moisture) {
        this.moisture = moisture;
    }

    public float getDiasticPower() {
        return diasticPower;
    }

    public void setDiasticPower(float diasticPower) {
        this.diasticPower = diasticPower;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getMaxInBatch() {
        return maxInBatch;
    }

    public void setMaxInBatch(float maxInBatch) {
        this.maxInBatch = maxInBatch;
    }

    public boolean isMashRecommended() {
        return mashRecommended;
    }

    public void setMashRecommended(boolean mashRecommended) {
        this.mashRecommended = mashRecommended;
    }

    public int getIBUPerGallonPerPound() {
        return IBUPerGallonPerPound;
    }

    public void setIBUPerGallonPerPound(int IBUPerGallonPerPound) {
        this.IBUPerGallonPerPound = IBUPerGallonPerPound;
    }
}
