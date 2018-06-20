package com.forhopssake.xbrew.tools;

import java.math.RoundingMode;

public class ToolsUtils {

    // Precision scale used by Big Integers
    private static int scale = 2;

    // Rounding method for Big Integers
    private static RoundingMode roundingMode = RoundingMode.HALF_UP;

    public static int getNumberScale() {
        return scale;
    }

    public static RoundingMode getMathRoundingMode() {
        return roundingMode;
    }


}
