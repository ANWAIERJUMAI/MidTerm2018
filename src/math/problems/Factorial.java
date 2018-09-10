package math.problems;

import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner input=new Scanner(System.in);
        double num, a=1,i;
        System.out.println("Enter number to find factorial:");
        num=input.nextDouble();
        for(i=num; i>=1;i--)
            a=a*i;
        System.out.println("Factorial of " + num + "=" + a);

    }
}
