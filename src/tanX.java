import java.io.*;
public class tanX {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double d,x,f=1,sgn=1;
        System.out.print("Enter the degree of Tangent:-");
        d=Double.parseDouble(br.readLine());
        x=d*(22/7.0)/180.0;
        for(int i=1;i<=9;i++)
        {
            f*=i;
            if(i%2!=0)
            {
                x-=(sgn*(Math.pow(x,i)))/f;
                sgn*=-1;
            }
        }
 
        double a=x;
        double fa=1,sign=1;
        double sum=1;
        x=d*(22/7.0)/180.0;
        for(int i=1;i<=8;i++)
	{
            fa*=i;
            if(i%2==0)
                {                                 
                       sum-=(Math.pow(x,i))*sign/fa;
                       sign*=-1;                    
                }                     
	}
        double b=sum;
        double tanX=a/b;
        System.out.println("The value of Tangent("+d+") is:-"+tanX);
        
        
        
        
        
    }
    
}            
 