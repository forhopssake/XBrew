package com.forhopssake.xbrew.tools.gravity;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlatoToSGConverter implements GravityScaleConverter {

    // SG = 1+ (plato / (258.6 – ( (plato/258.2) *227.1) ) )


    @Override
    public BigDecimal convert(double plato) {
        double sg = 1 + (plato / (258.6 - ( (plato/258.2) * 227.1) ) );

        BigDecimal bd = new BigDecimal(sg);
        bd = bd.setScale(3, RoundingMode.HALF_UP);

        return bd;
    }
}
