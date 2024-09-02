package main;
import java.util.Scanner;
import java.lang.Math;

public class StudentLoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loan input
        System.out.print("Enter your loan amount: ");
        double loan = scanner.nextDouble();

        // Interest rate input
        System.out.print("Enter your interest rate: ");
        double interestRate = scanner.nextDouble();

        // Period input 
        System.out.print("Enter your period in months: ");
        int period = scanner.nextInt();
        scanner.nextLine();

        // Monthly interest rate 
        double monthlyRate = (interestRate / 100) / 12;

        // Monthly payment
        double monthly = (loan * monthlyRate * Math.pow(1 + monthlyRate, period))
                / (Math.pow(1 + monthlyRate, period) - 1);

        // Total payment 
        double totalPayments = monthly * period;

        // Loop until the user provides a valid choice
        boolean valid = false;
        do {
            // Asking the user what they want to know about their payments
            System.out.println("What do you want to know? Type Monthly, Total, or Both: ");
            String choose = scanner.next();
            
            switch (choose.toLowerCase()) {
                case "monthly":
                    System.out.println("Your monthly payment is: " + monthly);
                    valid = true;
                    break;
                case "total":
                    System.out.println("Your total payment is: " + totalPayments);
                    valid = true;
                    break;
                case "both":
                    System.out.println("Your monthly payment is: " + monthly);
                    System.out.println("Your total payment is: " + totalPayments);
                    valid = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose Monthly, Total, or Both.");
                    break;
            }
        } while(!valid);

        scanner.close();
    }
}

