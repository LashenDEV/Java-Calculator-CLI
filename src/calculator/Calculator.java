package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        double num1, num2;
        String answer = "D";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Operator (+, -, *, /)");
        operator = input.next().charAt(0);

        while (!(answer.equals("C"))) {
            System.out.println("Enter the two numbers one by one");
            num1 = input.nextDouble();
            num2 = input.nextDouble();


            switch (operator) {
                case '+' -> System.out.printf("%.2f + %.2f = %.2f", num1, num2, (num1 + num2));
                case '-' -> System.out.printf("%.2f - %.2f = %.2f", num1, num2, (num1 - num2));
                case '*' -> System.out.printf("%.2f * %.2f = %.2f", num1, num2, (num1 * num2));
                case '/' -> {
                    if (num2 != 0) {
                        System.out.printf("%.2f / %.2f = %.2f", num1, num2, (num1 / num2));
                    } else {
                        System.out.println("Dividing by Zero is undefined");
                    }
                }
                default -> {
                    System.out.printf("%c is an invalid operator", operator);
                }
            }
            System.out.println("\n" + "Press C to done the calculation");
            System.out.println("Enter the Operator (+, -, *, /)");
            answer = input.next();
        }
    }
}
