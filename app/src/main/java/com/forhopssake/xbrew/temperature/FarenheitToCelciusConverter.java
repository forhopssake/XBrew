package com.forhopssake.xbrew.temperature;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FarenheitToCelciusConverter implements TemperatureConverter {

    // (F - 32) x .5556 = °C

    @Override
    public BigDecimal convert(double farenheit) {

        BigDecimal c = new BigDecimal((farenheit - 32) * 0.5556);
        c =  c.setScale(1, RoundingMode.HALF_UP);
        return c;
    }
}
