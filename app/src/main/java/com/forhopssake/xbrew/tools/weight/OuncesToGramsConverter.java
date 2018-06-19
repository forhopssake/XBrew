package com.forhopssake.xbrew.tools.weight;

import com.forhopssake.xbrew.tools.weight.WeightConverter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OuncesToGramsConverter implements WeightConverter {

    @Override
    public BigDecimal convert(double ounces) {
        if (ounces == 0) {
            return new BigDecimal(0).setScale(2, RoundingMode.HALF_UP);
        }

        BigDecimal grams = new BigDecimal(ounces / 0.035274);
        grams = grams.setScale(2, RoundingMode.HALF_UP);

        return grams;
    }
}
