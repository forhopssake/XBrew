package com.forhopssake.xbrew.tools.gravity;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.*;

public class TestSGToPlatoConversion {

    // odd items in list are plato, even numbers are sg.
    double[] testData = {1.002,0.5,1.004,1.0,1.006,1.5,1.008,2.1,1.010,2.6,1.012,3.1,1.014,3.6,
            1.016,4.1,1.018,4.6,1.020,5.1,1.022,5.6,1.024,6.1,1.026,6.6,1.028,7.1,1.030,7.6,
            1.032,8.1,1.034,8.5,1.036,9.0,1.038,9.5,1.040,10.0,1.042,10.5,1.044,11.0,1.046,11.4,
            1.048,11.9,1.050,12.4,1.053,13.1,1.055,13.6,1.057,14.0,1.059,14.5,1.061,15.0,1.063,15.4,
            1.065,15.9,1.068,16.6,1.070,17.1,1.072,17.5,1.074,18.0,1.076,18.4,1.079,19.1,1.081,19.6,
            1.083,20.0,1.085,20.5,1.087,20.9,1.090,21.6,1.092,22.0,1.094,22.5,1.096,22.9,1.099,23.6,
            1.101,24.0,1.103,24.4,1.106,25.1,1.108,25.5,1.110,25.9,1.113,26.6,1.115,27.0,1.117,27.4,
            1.120,28.1,1.122,28.5,1.124,28.9,1.127,29.5,1.129,30.0,1.132,30.6,1.134,31.0,1.136,31.4,
            1.139,32.0,1.141,32.4,1.144,33.0,1.146,33.4,1.149,34.0,1.151,34.4,1.154,35.0,1.156,35.4,
            1.159,36.0,1.161,36.4,1.164,37.0,1.166,37.4,1.169,38.0,1.171,38.4,1.174,39.0,1.176,39.4,
            1.179,39.9};

    @Test
    public void testConversion() {
        GravityScaleConverter converter = getConverter();

        BigDecimal d = converter.convert(1.0);

        String s1 = d.toPlainString();
        assertTrue( "0.00".equals(s1));

    }

    @Test
    public void testSGToPlato() {
        GravityScaleConverter converter = getConverter();
        for (int i=0; i<testData.length-1;i+=2) {
            double sg = testData[i];
            String expectedPlato = "" + testData[i+1];
            BigDecimal result = converter.convert(sg);
            result = result.setScale(1,RoundingMode.HALF_UP);
            String plato = result.toPlainString();

            boolean match = expectedPlato.equals(plato);

            assertTrue("Failed to convert SG " + sg + "\nExpected " + expectedPlato + " SG but was " + plato,match);

        }
    }

    public GravityScaleConverter getConverter() {
        return new SGToPlatoConverter();
    }
}
