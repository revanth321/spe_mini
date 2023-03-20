package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.System.exit;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public Main(){

    }

    public double squareRoot(double var){
        logger.info("Calculating Square Root of : " + var + "\n Result : " + Math.sqrt(var));
        return Math.sqrt(var);
    }
    public double factorial(double var){
        if(var < 0){
            logger.info("Factorial of negative number is not possible!");
            return Double.NaN;
        }
        else{
            double fact = 1;
            for(int i = 1; i <= var; i++){
                fact *= i;
            }
            logger.info("Factorial of the number : " + var + "\n Result is : " + fact);
            return fact;
        }
    }

    public double logarithm(double var){
        logger.info("Calculating Natural Logarithm of : " + var + "\n Result : " + Math.log(var));
        return Math.log(var);
    }

    public double power(double var1, double var2){
        logger.info("Power : " + var1 + "^" + var2 + "/n Result : " + Math.pow(var1, var2));
        return Math.pow(var1, var2);
    }

    public static void main(String[] args) {
        Main c = new Main();
        int choice;
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- !! calculator.Calculator Operations !! ----------");
        while(true){
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:  // For Square Root
                    System.out.println("Square Root Operation:");
                    System.out.print("Enter the number: ");
                    x = scanner.nextDouble();
                    System.out.println("Square Root of " + x + " : " + c.squareRoot(x));
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;

                case 2: // For Factorial
                    System.out.println("Factorial Operation:");
                    System.out.print("Enter the number: ");
                    x = scanner.nextDouble();
                    double result = c.factorial(x);
                    System.out.println("Factorial of " + x + " : " + result);
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;
                case 3:  // For Natural Logarithm
                    System.out.println("Natural Logarithm Operation:");
                    System.out.print("Enter the number: ");
                    x = scanner.nextDouble();
                    System.out.println("Natural Logarithm of " + x + " : " + c.logarithm(x));
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;
                case 4:  // For Power Function
                    System.out.println("Exponential Function:");
                    System.out.println("Enter the first number: ");
                    x = scanner.nextDouble();
                    System.out.println("Enter the second number : ");
                    y = scanner.nextDouble();
                    System.out.println("Power :" + x + "^" + y + " : " + c.power(x,y));
                    System.out.println("---------- !! Result evaluated !! ----------");
                    break;

                case 5:
                    System.out.println("---------- !! Exit !! ----------");
                    exit(0);
                default:
                    System.out.println("Invalid choice entered!");

            }
            System.out.println("\n");
        }

    }
}