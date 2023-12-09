import java.text.NumberFormat;
import java.util.Scanner;
public class project1 {
    public static void main (String []args){
        int Months_in_year=12;
        int PERCENT = 100;
        int principal=0;
        float montlyInterest =0 ;
        int numberofpayments =0;
        Scanner sc= new Scanner(System.in);

        while(true)
        {
        System.out.print("PRINCIPAL:");
         principal=sc.nextInt();
        if (principal >= 1000  && principal <=1000000 )
        break;
        System.out.println(" Enter a value between 1000 and 100000 ");
}
        while (true){
        System.out.print("Annual Interest Rate: ");
        float annualInterest = sc.nextFloat();
        if (annualInterest>=1 && annualInterest<=30){
        montlyInterest = annualInterest/ PERCENT / Months_in_year ;
        break;
        }
         System.out.println(" enter value between 1 and 30");
        }
        while(true){
        System.out.print("Period(Years): ");
        int years = sc.nextInt();
        if(years >= 1 && years <= 30){
        numberofpayments = years * Months_in_year;
        break;}
         System.out.println("enter value between 1 to 30");
        }

        double mortgage = principal * (montlyInterest * Math.pow(1 + montlyInterest , numberofpayments))/ (Math.pow(1+ montlyInterest, numberofpayments));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
        sc.close();
    }

    
}
