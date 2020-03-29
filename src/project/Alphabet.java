
package project;
import java.io.*;

public class Alphabet
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char a;
        
		
        System.out.print("Enter a Character : ");
        a=br.readLine().trim().charAt(0);
		
        if((a>='a' && a<='z') || (a>='A' && a<='Z'))
        {
            System.out.println(a + " is an Alphabet");
        }
        else
        {
            System.out.println(a + " is not an Alphabet");
        }
    }
}

                   
        
            
        
       