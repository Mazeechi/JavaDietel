package Chapter11;

import java.util.Scanner;

public class QuotientWithMethod {
    public static int quotient(int number1, int number2){
        if (number2 == 0){
          throw new ArithmeticException("Exception: an integer cannot be divided by zero");
        }

        return number1/number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try{
        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is " + result);
    } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Execution continues");
    }
}
