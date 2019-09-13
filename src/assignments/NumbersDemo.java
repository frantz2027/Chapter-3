package assignments;

import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {
    int x;
    int y;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your x value");
        x = keyboard.nextInt();
        System.out.print("Enter your y value");
        y = keyboard.nextInt();
        displayTwiceTheNumber(x, y);
        displayNumberPlusFive(x, y);
    }



    public static void displayTwiceTheNumber(int x, int y){
        int x2;
        int y2;

        x2 = x *2;
        y2 = y *2;
        System.out.println(x2 + "  " + y2);
    }
    public static void displayNumberPlusFive(int x, int y) {
        int x3;
        int y3;

        x3 = x + 5;
        y3 = y + 5;

        System.out.println(x3 + "  " + y3);

    }
}
