/**Algorithm:
1. Start
2. Create a Scanner object for user input.
3. Initialize a boolean variable continueCalculation as true.
4. Display the title "Java Calculator".
5. Repeat the following steps while continueCalculation is true:
1. Try to:
1. Prompt the user to enter the first number.
2. Read the first number as a double.
3. Prompt the user to enter an operator (+, -, *, /).
4. Read the operator as a char.
5. Prompt the user to enter the second number.
6. Read the second number as a double.
7. Based on the operator, perform the corresponding calculation using a switch statement:
 If operator is +, add the numbers and display result.
 If operator is -, subtract the numbers and display result.
 If operator is *, multiply the numbers and display result.
 If operator is /, then:
 If second number is 0, display division by zero error.
 Else, divide the numbers and display result.
 If the operator is not valid, display an error message.

2. Catch any exception (like invalid input), display an error message, and clear the input buffer.
3. Ask the user if they want to perform another calculation (yes or no).
4. Convert the input to lowercase and update continueCalculation accordingly.
6. When the user chooses not to continue, exit the loop.
7. Close the Scanner object.
8. End
*/
 package Lab_Codes;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Java Calculator\n");

        while (continueCalculation) {
            try {
                System.out.print("Enter 1st Number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter an operator (+, -, *, /): ");
                char op = scanner.next().charAt(0);

                System.out.print("Enter 2nd Number: ");
                double num2 = scanner.nextDouble();

                switch (op) {
                    case '+':
                        System.out.println("Addition = " + (num1 + num2) + "\n");
                        break;
                    case '-':
                        System.out.println("Subtraction = " + (num1 - num2) + "\n");
                        break;
                    case '*':
                        System.out.println("Multiplication = " + (num1 * num2) + "\n");
                        break;
                    case '/':
                        if (num2 != 0) {
                            System.out.println("Division = " + (num1 / num2) + "\n");
                        } else {
                            System.out.println("Error: Division by 0 is not allowed\n");
                        }
                        break;
                    default:
                        System.out.println("Error: Invalid operator!\n");
                }
            } catch (Exception e) {
                System.out.println("Error: Invalid input! Please try again.\n");
                scanner.nextLine();
                continue;
            }

            System.out.print("Do you want to continue? yes OR no: ");
            scanner.nextLine();
            String cont = scanner.nextLine().toLowerCase();

            if (cont.equals("no")) {
                continueCalculation = false;
            }
        }

        scanner.close();
        System.out.println("Calculator Closed. Goodbye!");
    }
}
