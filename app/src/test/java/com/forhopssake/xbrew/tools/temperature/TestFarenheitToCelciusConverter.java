package com.forhopssake.xbrew.tools.temperature;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TestFarenheitToCelciusConverter {

    @Test
    public void testZero() {
        BigDecimal c = getConverter().convert(0);
        assertTrue("-17.8".equals(c.toPlainString()));
    }

    private TemperatureConverter getConverter() {
        return new FarenheitToCelciusConverter();
    }
}
