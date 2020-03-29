
package project;
import java.io.*;
public class MaximumOfThree
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double a,b,c;
        System.out.print("Enter the first number:-");
        a=Double.parseDouble(br.readLine());
        System.out.print("Enter the second number:-");
        b=Double.parseDouble(br.readLine());
        System.out.print("Enter the third number:-");
        c=Double.parseDouble(br.readLine());
        
        
        if(a>b && a>c)
            System.out.println(a+"is greater than"+b+"and"+c);
        else if(b>c && b>a)
            System.out.println(b+"is greater than"+a+"and"+c);
        else if(c>a && c>b)
            System.out.println(c+"is  greater than"+a+"and"+b);
        else if(a>b && a==c)
            System.out.println(a+"and"+c+"is greater than"+b);
        else if(a>c && a==b)
            System.out.println(a+"and"+b+"is greater than"+c);
        else if(b>a && b==c)
            System.out.println(b+"and"+c+"is greater than"+a);
        
        else 
            System.out.println("All are equal");
        
        
    }
    
}
