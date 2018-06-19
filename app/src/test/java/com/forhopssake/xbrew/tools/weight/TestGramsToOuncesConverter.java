package com.forhopssake.xbrew.tools.weight;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TestGramsToOuncesConverter {

    private double[] testData = {};

    @Test
    public void testZero() {
        WeightConverter converter = getConverter();
        BigDecimal result = converter.convert(0);
        assertTrue("Error converting 0 grams to ounces", "0.00".equals(result.toPlainString()));
    }

    @Test
    public void testConverter() {
        WeightConverter converter = getConverter();
    }

    private WeightConverter getConverter() {
        return new GramsToOuncesConvefter();
    }
}
