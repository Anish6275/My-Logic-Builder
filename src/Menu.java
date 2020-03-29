import java.io.*;
public class Menu
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,n;
        double a,b,s,s1,s2,s3;
        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("Menu:-");
        System.out.println("For checking whether a number is odd or even press '1'.");
        System.out.println("For displayin the sum of two numbers press '2'.");
        System.out.println("For checking the sides of the triangle is valid or not press '3'.");
        System.out.println("///////////////////////////////////////////////////////////////////////");
        System.out.print("Enter your choice:-"); 
        m=Integer.parseInt(br.readLine());
        
        switch(m)
        {
            case 1:System.out.println("/////////////////////////////////////////////////////");
                   System.out.println("We are finding that a number is ODD or EVEN.");
                   System.out.println("/////////////////////////////////////////////////////");
                   System.out.print("Ente the number:-");
                   n=Integer.parseInt(br.readLine());
                   
                   if(n%2==0)
                       System.out.println("It's Even.");
                   else
                       System.out.println("It's Odd.");
                   
                   break;
            case 2:System.out.println("/////////////////////////////////////////////////////");
                   System.out.println("We are finding the sum of two numbers.");
                   System.out.println("/////////////////////////////////////////////////////");
                   System.out.print("Enter the first number:-");
                   a=Double.parseDouble(br.readLine());
                   System.out.print("Enter the second number:-");
                   b=Double.parseDouble(br.readLine());
                   
                   s=a+b;
                   
                   System.out.println("The sum is "+s);
                   
                   break;
            case 3:System.out.println("/////////////////////////////////////////////////////");
                   System.out.println("We are finding that a triangle is valid or not.");
                   System.out.println("/////////////////////////////////////////////////////");
                   System.out.print("Enter the first side:-");
                   s1=Double.parseDouble(br.readLine());
                   System.out.print("Enter the second side:-");
                   s2=Double.parseDouble(br.readLine());
                   System.out.print("Enter the third side:-");
                   s3=Double.parseDouble(br.readLine());
                   
                   if(s1+s1>s3 && s2+s3>s1 && s3+s1>s2 && s1!=0 && s2!=0 && s3!=0)
                       System.out.println("The triangle is Valid.");
                   else
                       System.out.println("The triangle is Invalid.");
                   
                   break;
                   
            default :System.out.println("Wrong Input.");
                   
        }
            
                
        
    }
}