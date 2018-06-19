package com.forhopssake.xbrew.temperature;

import java.math.BigDecimal;

public interface TemperatureConverter {

    public BigDecimal convert(double temperature);
}
