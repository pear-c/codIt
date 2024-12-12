package org.example;

public class ShapePrinter {
    public void printTriangle(int height) {
        for(int i=0; i<height; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
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
}
