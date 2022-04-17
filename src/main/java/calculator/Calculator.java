package calculator;

import java.util.InputMismatchException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

import java.lang.Math;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator(){
    }
    
    public double sqroot(double x) {
        logger.info("[Operation] => Square Root : " + x + "\n");
        double result = Math.sqrt(x);
        logger.info("[Result] => Square Root is : " + result + "\n\n");
        return result;
    }
    
    public double fact(double x) {
        logger.info("[Operation] => Factorial: " + x + "\n");
        double factorial = 1;
        if(x<0)
            return 0;
        for(int i = 1;i <= x; i++){    
            factorial = factorial*i;    
        } 
        logger.info("[Result] => Factorial is : " + factorial + "\n\n");
        return factorial;
    }
    
    public double naturalLog(double x) {
        logger.info("[Operation] => Natural Log : " + x + "\n");
        double result = Math.log(x);
        logger.info("[Result] => Natural Log is : " + result + "\n\n");
        return result;
    }
    
    public double power(double x, double y) {
        logger.info("[Operation] => Power : " + x  + "^" + y + "\n");
        double result = Math.pow(x,y);
        logger.info("[Result] => Power is : " + result + "\n\n");
        return result;
    }

    public static void main(String[] args) {
        
        System.out.println("What operation? ('√', '!', 'ln', '^')");  
        System.out.println(" Enter 1 for Square Root");
        System.out.println(" Enter 2 for Factorial");
        System.out.println(" Enter 3 for naturalLog");
        System.out.println(" Enter 4 for power");
        System.out.println(" Enter any key to exit");

        int choice;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        double input1;
        double input2;

        while(true){
            try {
            System.out.println(" Enter choice : ");
            choice = scanner.nextInt();
            } 
            catch(InputMismatchException error) {
                return;
            }

            // try {
                // if(choice == 4){
                
                // }
            // } catch (InputMismatchException error) {
                // return;
            // }
            switch (choice) {
                case 1:  // Square Root
                
                    System.out.print("Enter number : ");
                    input1 = scanner.nextDouble();
                    System.out.println("Square Root result is : " + calculator.sqroot(input1));
                    break;
                case 2: // // Factorial

                    System.out.print("Enter number : ");
                    input1 = scanner.nextDouble();
                    System.out.println("Factorial result is : " + calculator.fact(input1));
                    break;
                case 3:  // Log

                    System.out.print("Enter number : ");
                    input1 = scanner.nextDouble();
                    System.out.println("log result is : " + calculator.naturalLog(input1));
                    break;
                case 4: // Power

                    System.out.print("Enter base : ");
                    input1 = scanner.nextDouble();

                    System.out.print("Enter the power : ");
                    input2 = scanner.nextDouble();
                    System.out.println("power result is : " + calculator.power(input1, input2));
                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        }          
    }

}
