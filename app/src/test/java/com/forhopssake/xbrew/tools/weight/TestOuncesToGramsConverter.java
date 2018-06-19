package com.forhopssake.xbrew.tools.weight;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

public class TestOuncesToGramsConverter {

    private double[] testData = {};

    @Test
    public void testZero() {
        WeightConverter converter = getConverter();
        BigDecimal result = converter.convert(0);
        assertTrue("Error converting 0 ounces to grams", "0.00".equals(result.toPlainString()));
    }

    @Test
    public void testConverter() {
        WeightConverter converter = getConverter();
    }

    private WeightConverter getConverter() {
        return new OuncesToGramsConverter();
    }
}
