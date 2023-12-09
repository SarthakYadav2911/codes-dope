import java.util.Scanner;
public class abc {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array ");
        int n= sc.nextInt();int sum=0; double avg;
        int a[]= new int[n];
        for(int i=0; i<n; i++)
        {
           a[i]=sc.nextInt();
           
        }for(int j=0;j<n;j++){
         sum=sum+a[i];
         System.out.println("sum of numbers : "+sum);}
         avg=sum/n;
         System.out.println("average of the numbers:"+avg);
         sc.close();
    }
    
}
