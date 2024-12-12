package org.example;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return 0;
        }

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > maxValue) {
                maxValue = intArray[i];
            }
            if (intArray[i] < minValue) {
                minValue = intArray[i];
            }
        }
        return maxValue - minValue;
    }
}
