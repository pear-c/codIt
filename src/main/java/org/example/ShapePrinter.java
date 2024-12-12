package org.example;

public class ShapePrinter {
    // 삼각형 그리기
    public void printTriangle(int height) {
        for(int i=0; i<height; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // 피라미드 그리기
    public void printPyramid(int height) {
        for(int i=0; i<height; i++) {
            for(int j=height-1; j>i; j--) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // 플로이드 삼각형
    public void printFloydsPyramid(int height) {
        int padding = ((height * (height + 1) / 2) + "").length();
        int num = 1;

        for(int i=0; i<height; i++) {
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k < padding - (num + "").length(); k++)
                    System.out.print(" ");
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
