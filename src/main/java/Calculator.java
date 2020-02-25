import java.util.Scanner;

public class Calculator {
    public static int add(int...numbers) {
        char operator;
        int sum = 0;
        for (int number : numbers) sum += number;
        return sum;
    }
    public static int multiply(int...numbers) {
        char operator;
        int product = 1;
        for (int number : numbers) product *= number;
        return product;
    }

    public static void main(String[] args) {
//        System.out.println("Enter 5 numbers");
//        Scanner userInput= new Scanner(System.in);
//
//        int[] input = new int[5];     I was helped with user input code by T
//        for(int i=0; i < 5; i++){
//
//          input[i] = userInput.nextInt();
//
//        }
//        System.out.print("Sum = "+add(input));
        System.out.println("Product: "+multiply(2,5,5,6));
        System.out.println("Sum: "+add(2,5,5,9,9));

    }
}