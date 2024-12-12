package org.example;

public class UnitConverter {
    static final double KILOGRAMS_PER_POUND = 0.45359237;
    static final double POUNDS_PER_KILOGRAM = 1 / KILOGRAMS_PER_POUND;
    static final double INCHES_PER_CENTIMETER = 2.54;
    static final double CENTIMETERS_PER_INCH = 1 / INCHES_PER_CENTIMETER;

    private UnitConverter() {}

    public static double toPounds(double kilograms) {
        // 메소드 내부를 채워주세요
        return kilograms * POUNDS_PER_KILOGRAM;
    }
    public static double toKilograms(double pounds) {
        // 메소드 내부를 채워주세요
        return pounds * KILOGRAMS_PER_POUND;
    }
    public static double toCentimeters(double inches) {
        // 메소드 내부를 채워주세요
        return inches * INCHES_PER_CENTIMETER;
    }
    public static double toInches(double centimeters) {
        // 메소드 내부를 채워주세요
        return centimeters * CENTIMETERS_PER_INCH;
    }
    public static double toFahrenheit(double celsius) {
        // 메소드 내부를 채워주세요
        return celsius * 9 / 5 + 32;
    }
    public static double toCelsius(double fahrenheit) {
        // 메소드 내부를 채워주세요
        return (fahrenheit - 32) * 5 / 9;
    }
}
