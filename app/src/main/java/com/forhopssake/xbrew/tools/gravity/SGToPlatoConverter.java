package com.forhopssake.xbrew.tools.gravity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SGToPlatoConverter implements GravityScaleConverter {

    // plato=135.997gravity3−630.272gravity2+1111.14gravity−616.868

    @Override
    public BigDecimal convert(double gravity) {
        double plato = (135.997*(gravity*gravity*gravity)) - (630.272*(gravity*gravity)) + (1111.14 * gravity) - 616.868;
        BigDecimal bd = new BigDecimal(plato);
        bd = bd.setScale(2, RoundingMode.HALF_EVEN);
        return bd;
    }
}
