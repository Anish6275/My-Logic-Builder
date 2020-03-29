import java.io.*;
public class sinX {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double d,x,f=1,sgn=1;
        System.out.print("Enter the degree of Sine:-");
        d=Double.parseDouble(br.readLine());
        x=d*(22/7.0)/180.0;
        System.out.print("Enter the value of n:-");
        int n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            f*=i;
            if(i%2!=0 && i!=1)
            {
                x-=(sgn*(Math.pow(x,i)))/f;
                sgn*=-1;
            }
        }
        System.out.println("The value of Sine("+d+") is:-"+x);
        
        
        
        
        
        
    }
    
}
