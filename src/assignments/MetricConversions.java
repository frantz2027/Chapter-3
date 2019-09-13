package assignments;

import java.util.Scanner;

public class MetricConversions {
    public static void main(String[] args){


        double inches;
        double centimeters;
        double liters;
        double gallons;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter centimeters >>>");
        centimeters = keyboard.nextInt();
        System.out.print("Enter liters >>>");
        liters = keyboard.nextInt();
        gallons = liters * 3.7854;
        inches = centimeters * 2.54;
        centimetersToInches(centimeters, inches);
        litersToGallons(liters, gallons);

    }
    public static void centimetersToInches( double centimeters, double inches){

        inches = centimeters * 2.54;
        System.out.print(" The amount of inches is " + inches);


    }
    public static void litersToGallons(double liters, double gallons){
        gallons = liters * 3.7854;
        System.out.print(" The amount of gallons is " + gallons);
    }
}
