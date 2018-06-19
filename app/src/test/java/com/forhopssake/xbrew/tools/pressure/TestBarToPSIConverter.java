package com.forhopssake.xbrew.tools.pressure;

import com.forhopssake.xbrew.tools.presure.BarToPSIConverter;
import com.forhopssake.xbrew.tools.presure.PressureConverter;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertTrue;

public class TestBarToPSIConverter {

    public double[] testData = {0.01,0.15,0.1,1.45,1,14.50,2,29.01,3,43.51,5,72.52,10,145.04,20,290.08,50,725.19};

    @Test
    public void testConverter() {

        PressureConverter converter = getConverter();

        for (int i=0; i<testData.length-1;i+=2) {
            double bar = testData[i];
            BigDecimal expected = new BigDecimal(testData[i+1]).setScale(2,RoundingMode.HALF_UP);
            BigDecimal result = converter.convert(bar);
            result = result.setScale(2,RoundingMode.HALF_UP);
            String resultStr = result.toPlainString();

            boolean match = expected.toPlainString().equals(resultStr);

            assertTrue("Failed to convert Bar to PSI " + bar + "\nExpected " + expected + " PSI but was " + result,match);

        }
    }

    private PressureConverter getConverter() {
        return new BarToPSIConverter();
    }
}
