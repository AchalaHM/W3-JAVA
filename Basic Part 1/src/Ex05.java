/*5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("First Input :");
        int x = scanner.nextInt();
        System.out.println("Second Input :");
        int y = scanner.nextInt();

        int answer = x * y ;
        System.out.println(answer);
    }
}
