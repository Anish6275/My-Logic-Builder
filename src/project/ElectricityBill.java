package project;
import java.io.*;
public class ElectricityBill
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double u,c,b,s;
        System.out.print("Enter the Electricity Unit Charges:-");
        u=Double.parseDouble(br.readLine());
        
        if(50>=u)
            c=u*0.50;
        
        else if(u<=150)
            c=(50*0.50)+((u-50)*0.75);
         
        else if(u<=250)
            c=(50*0.50)+(100*0.75)+((u-150)*1.20);
          
        else
            c=(50*0.50)+(100*0.75)+(100*1.20)+((u-250)*1.50);
  
        System.out.println("The total unit charge is Rs."+c);
        s=c*20/100.0;
        
        System.out.println("The additional surcharge is Rs."+s);
        b=c+s;
        
        System.out.println("The total bill is Rs."+b);
       
    }
    
}
