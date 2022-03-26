package org.example;

/**
 * This is an Exercise that converts the Kilometer Per Hour to Miles Per Hour
 *
 */
public class SpeedConverter
{
    public static void main( String[] args ) {
        double kilo = 1.5;
        printConversion(kilo);
        double kilo2 = 10.25;
        printConversion(kilo2);
        double kilo3 = -5.6;
        printConversion(kilo3);
        double kilo4 = 25.42;
        printConversion(kilo4);
        double kilo5 = 75.114;
        printConversion(kilo5);
    }

    public static long toMilesPerHours(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
           long miles = Math.round(kilometersPerHour / 1.609);
           return miles;
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometerPerHour + " km/h = " + toMilesPerHours(kilometerPerHour) + " mi/h");
        }
    }
}