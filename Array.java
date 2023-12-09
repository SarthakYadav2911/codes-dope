import java.util.Scanner;
public class Array {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the length of the array for bainary number:");
        int n= sc.nextInt();
        int num1[]=new int[n];
        int t= num1.length;
        int num2[]=new int[n];
        int y = num2.length;
       int result[]= new int[n+1];
        for(int j=n+1; j>0;j++)
        {
            for(int i=n; i>0; i++)
            {
              result[j]= num1[i]+ num2[i];
              
        }
        
    }
    sc.close();
}
}