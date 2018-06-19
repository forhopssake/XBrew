package com.forhopssake.xbrew.tools.weight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class GramsToOuncesConvefter implements WeightConverter {

    @Override
    public BigDecimal convert(double grams) {

        BigDecimal ounces = new BigDecimal(grams * 0.035274);
        ounces = ounces.setScale(2, RoundingMode.HALF_UP);

        return ounces;
    }
}
