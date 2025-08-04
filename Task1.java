import java.util.Scanner;

public class Task1 {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Basic Calculator using Java");


        while (true) {
            
            System.out.println("Operations:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your option (1-5): ");

            int option = sc.nextInt();

            if (option == 5) {
                System.out.println("Exiting Calculator");
                break;
            }
            if(option > 5 || option < 1 ){
                System.out.println("Invalid Option. Select again\n\n");
                continue;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            double res = 0;

            switch (option) {
                case 1:
                    res = add(a, b);
                    break;
                case 2:
                    res = sub(a, b);
                    break;
                case 3:
                    res = mul(a, b);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Cannot divide by zero!\n\n");
                        continue;
                    }
                    res = div(a, b);
                    break;
                default:
                    break;
            }

            System.out.println("Result = " + res + "\n\n");
        }
    }
}
