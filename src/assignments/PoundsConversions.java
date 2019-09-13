package assignments;

import java.util.Scanner;

public class PoundsConversions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pounds;
        System.out.println("enter the amount of pounds >>> ");
        pounds = input.nextInt();
        poundsToOunces(pounds);
        poundsToMilligrams(pounds);
        poundsToKilograms(pounds);
    }
    public static void poundsToOunces(int pounds){
        double converted;
        converted = pounds * 16;
        System.out.println("Your converted number is " + converted + " Ounces ");
    }
    public static void poundsToMilligrams(int pounds){
        double converted;
        converted = pounds * 1453592;
        System.out.println("Your converted number is " + converted + " Milligrams ");
    }
    public static void poundsToKilograms(int pounds){
        double converted;
        converted = pounds * 0.453592;
        System.out.println("Your converted number is " + converted + " Kilograms ");
    }

}
