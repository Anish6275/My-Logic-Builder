import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args)     {
        Scanner console = new Scanner(System.in);     
        int n,re=0,x;
                
        System.out.print("Enter the number ");
        x= n = console.nextInt();        
        
        while(n>0)
        {
            re=re*10+n%10;
            n/=10;
        }
        System.out.println("Reverse of " + x + " is " + re);
    }
}