package examples;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int userEntry1;
        int userEntry2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number >>>");
        userEntry1 = input.nextInt();
        System.out.println("Enter a number >>>");
        userEntry2 = input.nextInt();

        calculateAdittion(userEntry1, userEntry2);
        calculateSubtraction(userEntry1, userEntry2);
        calculateMultiplication(userEntry1, userEntry2);
        calculateDivision(userEntry1, userEntry2);
        calculateModulus(userEntry1, userEntry2);

    }
    public static void calculateAdittion(int userEntry1, int userEntry2){
        int total = userEntry1 + userEntry2;
        System.out.println(userEntry1 + " + " + userEntry2 + " = " + total);


    }
    public static void calculateSubtraction(int userEntry1, int userEntry2){
        int total = userEntry1 - userEntry2;
        System.out.println(userEntry1 + " - " + userEntry2 + " = " + total);


    }
    public static void calculateMultiplication(int userEntry1, int userEntry2){
        int total = userEntry1 * userEntry2;
        System.out.println(userEntry1 + " * " + userEntry2 + " = " + total);


    }
    public static void calculateDivision(int userEntry1, int userEntry2){
        int total = userEntry1 / userEntry2;
        System.out.println(userEntry1 + " / " + userEntry2 + " = " + total);


    }
    public static void calculateModulus(int userEntry1, int userEntry2) {
        int total = userEntry1 % userEntry2;
        System.out.println(userEntry1 + " % " + userEntry2 + " = " + total);
    }

}
