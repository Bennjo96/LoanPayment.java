import java.util.Scanner;
public class ComputeLoanPayment {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter AnnualInterest rate");
        double AnnualInterestRate = input.nextDouble();

        double monthlyInterestRate = AnnualInterestRate/ 1200;

        System.out.println("Enter number of years ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount");
        double loanAmount = input.nextDouble();

        double monthlyPayment = loanAmount * monthlyInterestRate/ (1-1/ Math.pow(1+monthlyInterestRate,numberOfYears*12));
        double totalPayment = monthlyPayment * numberOfYears * 12;


        System.out.println(" The monthly Payment is " + (int)(monthlyPayment* 100)/100.0 );

        System.out.println(" The total Payment is " + (int)(totalPayment)/ 100.0);


    }
}
