import java.io.*;
public class cosX {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double d,x,f=1,sum=1,sign=1;
        System.out.print("Enter the degree of Cosine:-");
        d=Double.parseDouble(br.readLine());
        x=d*(22/7.0)/180.0;
        System.out.print("Enter the value of 'n':-");
        int n=Integer.parseInt(br.readLine());
        
        for(int a=1;a<=n;a++)
	{
            f*=a;
            if(a%2==0)
                {                                 
                       sum-=(Math.pow(x,a))*sign/f;
                       sign*=-1;                    
                }                     
	}
        System.out.println("The value of Cosine("+d+") is:-"+sum);         
    }    
}