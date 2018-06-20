package com.forhopssake.xbrew.tools.weight;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertTrue;

public class TestOuncesToGramsConverter {

    private double[] testData = {1,28.35,2.3,65.30,3.5,99.22,4.7};

    @Test
    public void testZero() {
        WeightConverter converter = getConverter();
        BigDecimal result = converter.convert(0);
        assertTrue("Error converting 0 ounces to grams", "0.00".equals(result.toPlainString()));
    }

    @Test
    public void testConverter() {
        WeightConverter converter = getConverter();
        for (int i=0; i<testData.length; i+=2) {
            BigDecimal result = converter.convert(testData[i]);
            BigDecimal expected = new BigDecimal(testData[i+1]);
            expected = expected.setScale(2, RoundingMode.HALF_UP);
            assertTrue("Failed converting " + testData[i] + " ounces to gramms\n" +
                    "Expected " + testData[i+1] + " but was " + result.toPlainString(),
                    0 == expected.compareTo(result));
        }
    }

    private WeightConverter getConverter() {
        return new OuncesToGramsConverter();
    }
}
