package com.forhopssake.xbrew.tools.presure;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PSIToBarConverter implements PressureConverter {


    // 1 psi = 0.0689475729 bar

    @Override
    public BigDecimal convert(double psi) {
        BigDecimal bar = new BigDecimal(psi * 0.0689475729);
        bar = bar.setScale(2, RoundingMode.HALF_UP);
        return bar;
    }
}
