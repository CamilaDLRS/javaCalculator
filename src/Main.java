import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello and welcome to our Calculator!");
        boolean loop = true;
        while (loop) {
            System.out.printf("Enter a number: ");
            double firstNumber = scan.nextDouble();

            System.out.printf("Enter a operation (*, +, - or /): ");
            char operation = scan.next().charAt(0);

            System.out.printf("Enter another number: ");
            double secondNumber = scan.nextDouble();

            double result = 0;
            switch (operation) {
                case '*':
                    result = firstNumber * secondNumber;
                    break;
                case '/':
                    result = firstNumber / secondNumber;
                    break;
                case '-':
                    result = firstNumber - secondNumber;
                    break;
                case '+':
                    result = firstNumber + secondNumber;
                    break;
                default:
                    System.out.printf("Not a valid operation.");
            }
            System.out.printf("Result: " + result);

            System.out.println("\n Do you want to continue? [S/N].");
            char continueLoop = scan.next().charAt(0);

            if (continueLoop == 'n' || continueLoop == 'N') {
                loop = false;
            }
        }

    }
}