import java.util.Scanner;

public class functions {


    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();


        double average = calculateAverage(number1, number2, number3);


        System.out.println("The average of " + number1 + ", " + number2 + ", and " + number3 + " is: " + average);


        scanner.close();
    }
}
