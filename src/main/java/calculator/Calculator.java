package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.lang.Math;

public class Calculator {

    public Calculator(){
    }
    
    public double sqroot(double x) {
        return Math.sqrt(x);
    }
    
    public double fact(double x) {
        double factorial = 1;
        for(int i = 1;i <= x; i++){    
            factorial = factorial*i;    
        } 
        return factorial;
    }
    
    public double naturalLog(double x) {
        return Math.log(x);
    }
    
    public double power(double x, double y) {
        return Math.pow(x,y);
    }

    public static void main(String[] args) {
        
        System.out.println("What operation? ('√', '!', 'ln', '^')");  
        System.out.println(" Enter 1 for Square Root");
        System.out.println(" Enter 2 for Factorial");
        System.out.println(" Enter 3 for naturalLog");
        System.out.println(" Enter 4 for power");
        int choice;

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        double input1;
        double input2;

        while(true){
            try {
            choice = scanner.nextInt();
            } 
            catch(InputMismatchException error) {
                return;
            }

            try {
                System.out.print("Enter the first number : ");
                input1 = scanner.nextDouble();
                // if(choice == 4){
                
                // }
            } catch (InputMismatchException error) {
                return;
            }
            switch (choice) {
                case 1:
                
                    System.out.println("Square Root result is : " + calculator.sqroot(input1));
                    break;
                case 2:
                    
                    System.out.println("Factorial result is : " + calculator.fact(input1));
                    break;
                case 3:
                    System.out.println("log result is : " + calculator.naturalLog(input1));
                    break;
                case 4:
                    System.out.print("Enter the second number : ");
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
