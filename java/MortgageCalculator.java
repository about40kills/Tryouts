import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your principal amount? \nPrincipal: ");
        int principal = scanner.nextInt();

        System.out.println("What is your annual interest rate? \nAnnual Interest Rate: ");
        float AnnualInterest = scanner.nextFloat();
        float MonthlyInterest = AnnualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("How long is your mortgage? \nPeriod(Years): ");
        byte period = scanner.nextByte();
        int NumberofPayments = period * MONTHS_IN_YEAR;

        final double mortgage = principal *((MonthlyInterest * (int)Math.pow(1 + MonthlyInterest, NumberofPayments))/ (int)Math.pow(1 + MonthlyInterest, NumberofPayments) - 1);

        String MortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage); 
        System.out.println("Your mortgage is: " + MortgageFormatted);
        scanner.close();




    }
    
}
