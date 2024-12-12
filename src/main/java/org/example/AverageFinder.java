package org.example;

public class AverageFinder {
    double computeAverage(int[] intArray) {
        // 코드를 입력하세요.
        int sum = 0;
        for(int i : intArray) {
            sum += i;
        }
        return (double) sum / intArray.length;
    }
}
