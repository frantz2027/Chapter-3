package assignments;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args){

        double area1;
        double area2;
        double totalArea;
        double length;
        double width;
        double height;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the lenght of the wall >>> ");
        length = keyboard.nextDouble();
        System.out.print("Enter the height of the wall >>> ");
        height = keyboard.nextDouble();
        System.out.print("Enter the width of the wall >>> ");
        width = keyboard.nextDouble();
        calcArea1(length, height, width);






    }
    public static void calcArea1(double length, double height, double width){
        double area1;
        double area2;
        area1 = length * height * 2;
        System.out.print("The area of the first wall section is " + area1);
        area2 = width * height * 2;
        System.out.print(" The area of the second wall section is " + area2);
        double totalArea;
        totalArea = area1 + area2;
        calcGallons(totalArea);
    }
    public static void calcGallons(double totalArea){
        double gallons = Math.ceil(totalArea / 350);
        double price = gallons * 32;

        System.out.print("The total amount of gallons needed " + gallons);
        System.out.print("the total price is " + price + "$");

    }





}
