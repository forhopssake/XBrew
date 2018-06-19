package com.forhopssake.xbrew.tools.pressure;

import com.forhopssake.xbrew.tools.presure.PSIToBarConverter;
import com.forhopssake.xbrew.tools.presure.PressureConverter;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertTrue;

public class TestPSIToBarConverter {

    private double[] testData = {0.01,0,0.1,0.01,2,0.14,3,0.21,5,0.34,10,0.69,20,1.38,50,3.45,100,6.89};

    @Test
    public void testPSIToBarConverter() {
        PressureConverter converter = getConverter();

        for (int i=0;i<testData.length;i+=2) {
            double psi = testData[i];
            BigDecimal expected = new BigDecimal(testData[i+1]).setScale(2,RoundingMode.HALF_UP);
            BigDecimal result = converter.convert(psi);
            assertTrue("Failed to convert " + psi + " PSI to Bar. Expected " +
                    expected.toPlainString() + " but found " + result.toPlainString(), expected.equals(result));
        }
    }

    private PressureConverter getConverter() {
        return new PSIToBarConverter();
    }
}
