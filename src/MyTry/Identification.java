package MyTry;
import java.io.*;
public class Identification
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a,b;
        System.out.print("Enter your name:-");
        a=br.readLine();
        if(a.equals("Anish Roy"))
        {
            System.out.print("Tnter your password:-");
            b=br.readLine();
            if(b.equals("Anish6275Roy"))
            {
                System.out.println("Welcome Master Anish Roy!");
                System.out.println("How are you?");
            }
            else
                System.out.println("Wrong Password!");
        }
        else
            System.out.println("Wrong name!");
        
        
    }
    
}
