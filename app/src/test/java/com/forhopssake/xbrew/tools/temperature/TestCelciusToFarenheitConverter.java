package com.forhopssake.xbrew.tools.temperature;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TestCelciusToFarenheitConverter {

    @Test
    public void testZero() {
        TemperatureConverter converter = getConverter();
        BigDecimal f = converter.convert(0);
        assertTrue("32.0".equals(f.toPlainString()));

    }

    private TemperatureConverter getConverter() {
        return new CelciusToFarenheitConverter();
    }
}
