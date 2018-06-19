package com.forhopssake.xbrew.temperature;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CelciusToFarenheitConverter implements TemperatureConverter {

    // °C x 1.8 + 32 = °F

    @Override
    public BigDecimal convert(double celcius) {
        BigDecimal f = new BigDecimal(celcius * 1.8 + 32);
        f = f.setScale(1, RoundingMode.HALF_UP);
        return f;
    }
}
