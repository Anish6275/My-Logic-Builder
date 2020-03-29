
import java.io.*;
public class Factorial
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        long factorial = 1;

        System.out.print("Enter the positive number:-");
        n=Integer.parseInt(br.readLine());

        for(int i = 1; i <=n; ++i)
        factorial *= i;

        System.out.println("Factorial of "+ n+ " = " + factorial);
    }
}
