
package project;
import java.io.*;
public class NegitivePositiveOrZero
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double a;
        System.out.print("Enter the number:-");
        a=Double.parseDouble(br.readLine());
        
        if(a<0)
            System.out.println("It's negative.");
        else if(a>0)
            System.out.println("It's positive.");
        else
            System.out.println("It's zero.");
        
    }
}
