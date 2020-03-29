import java.io.*;
public class LCMandHCF
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n1,n2,a,l,h;
        System.out.print("Enter the first number:-");
        n1=Integer.parseInt(br.readLine());
        System.out.print("Enter the second number:-");
        n2=Integer.parseInt(br.readLine());
        
        if (n1>=n2)
            l=n1;
        else
            l=n2;
        do
        {
            if (l % n1 == 0 && l % n2 == 0)
            {
               a=l;
               break;
            }
            else
               l++;
        }while(true);
            
        h=(n1*n2)/a;// We know that LCM X HCF = number1 X number2
        System.out.println("HCF="+h);
        
    }
}