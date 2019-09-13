package assignments;

import java.util.Scanner;

public class Percentages {
    public static void main(String[] args){

        double x;
        double y;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter your x value");
        x = keyboard.nextInt();
        System.out.print("etnter your y value");
        y = keyboard.nextInt();
        computePercent(x, y);



    }
    public static void computePercent(double x, double y){
     double x1;
     x1 = x / y;
     System.out.println("The percentage is " + x1 + "%");
    }
}
