

import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        System.out.print("Enter the number:-");
        n=sc.nextInt();
        
        if(n==0)
            System.out.println("0 is neither Prime nor Composite Number.");
        else
        {
            for(i=2;i<=n-1;i++)
                if(n%i==0)
                    c++;
            if(c==0)
                System.out.println(n+" is a Prime Number.");
            else
                System.out.println(n+" is a Composite Number.");
        }
    }
            
    
}
