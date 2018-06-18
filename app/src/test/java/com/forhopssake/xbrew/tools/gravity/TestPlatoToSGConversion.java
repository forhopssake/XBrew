package com.forhopssake.xbrew.tools.gravity;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TestPlatoToSGConversion {

    // odd items in list are plato, even numbers are sg.
    double[] testData = {0.5,1.002,1.0,1.004,1.5,1.006,2.0,1.008,2.5,1.010,3.0,1.012,3.5,1.014,4.0,1.016,
            4.5,1.018,5.0,1.020,5.5,1.022,6.0,1.024,6.5,1.026,7.0,1.028,7.5,1.030,8.0,1.032,8.5,1.034,
            9.0,1.036,9.5,1.038,10.0,1.040,10.5,1.042,11.0,1.044,11.5,1.046,12.0,1.048,12.5,1.050,
            13.0,1.053,13.5,1.055,14.0,1.057,14.5,1.059,15.0,1.061,15.5,1.063,16.0,1.065,16.5,1.068,
            17.0,1.070,17.5,1.072,18.0,1.074,18.5,1.076,19.0,1.079,19.5,1.081,20.0,1.083,20.5,1.085,
            21.0,1.087,21.5,1.090,22.0,1.092,22.5,1.094,23.0,1.096,23.5,1.099,24.0,1.101,24.5,1.103,
            25.0,1.106,25.5,1.108,26.0,1.110,26.5,1.113,27.0,1.115,27.5,1.117,28.0,1.120,28.5,1.122,
            29.0,1.124,29.5,1.127,30.0,1.129,30.5,1.132,31.0,1.134,31.5,1.136,32.0,1.139,32.5,1.141,
            33.0,1.144,33.5,1.146,34.0,1.149,34.5,1.151,35.0,1.154,35.5,1.156,36.0,1.159,36.5,1.161,
            37.0,1.164,37.5,1.166,38.0,1.169,38.5,1.171,39.0,1.174,39.5,1.176,40.0,1.179};

    public void setUp() {

    }


    @Test
    public void test0Conversion() {
        GravityScaleConverter converter = getConverter();

        BigDecimal sg = converter.convert(0);
        String s1 = sg.toPlainString();
        assertTrue("1.000".equals(s1));
    }

    @Test
    public void testPlatoToSG() {
        GravityScaleConverter converter = getConverter();
        for (int i=0; i<testData.length;i+=2) {
            double plato = testData[i];
            BigDecimal expectedSG = new BigDecimal(testData[i+1]);
            expectedSG = expectedSG.setScale(3, RoundingMode.HALF_EVEN);
            BigDecimal result = converter.convert(plato);
            String sg = result.toPlainString();

            boolean match = expectedSG.toPlainString().equals(sg);

            assertTrue("Failed to convert Plato " + plato + "\nExpected " + expectedSG + " SG but was " + sg,match);

        }
    }

    @Test
    public void testBigPlato() {

    }

    public GravityScaleConverter getConverter() {
        return new PlatoToSGConverter();
    }
}
