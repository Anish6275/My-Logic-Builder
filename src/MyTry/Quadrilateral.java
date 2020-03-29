
package MyTry;
import java.io.*;
public class Quadrilateral
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        double a,b,c,d,aa,ba,ca,da;
        System.out.print("Enter the Length of First Side:-");
        a=Double.parseDouble(br.readLine());
        System.out.print("Enter the Length of Second Side:-");
        b=Double.parseDouble(br.readLine());
        System.out.print("Enter the Length of Third Side:-");
        c=Double.parseDouble(br.readLine());
        System.out.print("Enter the Length of Fourth Side:-");
        d=Double.parseDouble(br.readLine());
        
        if(a!=0 && b!=0 && c!=0 && d!=0)
        {
            System.out.println("It's a Quadrilateral!");
            aa=(a/(a+b+c+d))*360;
            ba=(b/(a+b+c+d))*360;
            ca=(c/(a+b+c+d))*360;
            da=(d/(a+b+c+d))*360;
            
            
            if(a==b && b==c && c==d && d==a && aa==90 && ba==90 && ca==90 && da==90)
                System.out.println("It's a Square!");
            else if(a==c && b==d && c!=d && d!=a && aa==90 && ba==90 && ca==90 && da==90)
                System.out.println("It's a Rectangle!");
            /*
            else if(a==b && b==c && c==d && d==a && aa==90 && ba!=90 && ca!=90 && da!=90 && aa==ca && ba==da)
                System.out.println("It's a Parallelogram(Square)!");
            else if(a==c && b==d && c!=d && d!=a && aa==90 && ba!=90 && ca!=90 && da!=90 && aa==ca && ba==da)
                System.out.println("It's a Parallelogram(Rectangle)!");
*/
            
            else
                System.out.println("Its an Irregular Quadrilateral!");



            System.out.println("The angles are"+aa+","+ba+","+ca+","+da+".");
            
        }   
        else 
            System.out.println("It's not a Quadrilaterl!");
            
            
        
        
        
        
        
    
    
    
    }            
                
                
}
