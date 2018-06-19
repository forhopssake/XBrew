package com.forhopssake.xbrew.tools.presure;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BarToPSIConverter implements PressureConverter {

    //1 bar = 14.503773773 psi

    @Override
    public BigDecimal convert(double bar) {
        BigDecimal psi = new BigDecimal(bar * 14.503773773);
        psi = psi.setScale(2, RoundingMode.HALF_UP);
        return psi;
    }


}
