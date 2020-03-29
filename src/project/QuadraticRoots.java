package project;
import java.io.*;
public class QuadraticRoots
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double a,b,c,x1=0,x2=0,d;
        System.out.print("Enter the coefficient of x²:-");
        a=Double.parseDouble(br.readLine());
        System.out.print("Enter the coefficient of x:-");
        b=Double.parseDouble(br.readLine());
        System.out.print("Enter the constant:-");
        c=Double.parseDouble(br.readLine());
        
        d=(b*b)-4*a*c;
        
        if(d<0)
            System.out.println("No real roots found.");
        else if(d==0)
        {
            System.out.println("Two equal roots found.");
            x1=x2=-b/(2*a);
            System.out.println("The roots are "+x1+" and "+x2);
        }
        else
        {
            System.out.println("Two distinct roots found.");
            x1=(-b+Math.sqrt(d))/2*a;
            x2=(-b+Math.sqrt(d))/2*a;
            System.out.println("The roots are "+x1+" and "+x2);
        }
    }
}
