package MyTry;
import java.io.*;
public class Moment_of_Inertia

{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b;
        double m,r,i;
        System.out.println("Choose you choice from here:-");
        System.out.println("For thin circular ring-----Press '1'||");
        System.out.println("For thin rod-----Press '2'||");
        System.out.println("For circular disc-----Press '3'||");
        System.out.println("For hollow cylinder-----Press '4'||");
        System.out.println("For solid cylinder-----Press '5'||");
        System.out.println("For solid sphere-----Press '6'||");
        System.out.print("Enter your choice here:-");
        a=Integer.parseInt(br.readLine());
        if(a==1)
        {
            System.out.println("\n\nChoose the axis:-");
            System.out.println("From perpendicilar axis from centre------Press '1'");
            System.out.println("From the diameter axis from centre------Press '2'");
            b=Integer.parseInt(br.readLine());
            if(b==1)
            {
                System.out.println("\nOK!");
                System.out.print("Enter the Mass:-");
                m=Double.parseDouble(br.readLine());
                System.out.print("Enter the Length of Radius:-");
                r=Double.parseDouble(br.readLine());
                
                i=m*r*r;
                System.out.println("The Moment of Inertia is:-"+i);
            }
            else if(b==2)
            {
                System.out.println("\nOK!");
                System.out.print("Enter the Mass:-");
                m=Double.parseDouble(br.readLine());
                System.out.print("Enter the Length of Radius:-");
                r=Double.parseDouble(br.readLine());
                
                i=m*r*r/2;
                System.out.println("The Moment of Inertia is:-"+i);
            }
            else
                System.out.println("Wrong Input!");
        }
        else if(a==2)
        
        {
                System.out.println("\nOK!");
                System.out.print("Enter the Mass:-");
                m=Double.parseDouble(br.readLine());
                System.out.print("Enter the Length:-");
                r=Double.parseDouble(br.readLine());
                
                i=m*r*r/12;
                System.out.println("The Moment of Inertia is:-"+i);
            
        }
        else if(a==3)
        {
            System.out.println("\n\nChoose the axis:-");
            System.out.println("From perpendicilar axis from centre------Press '1'");
            System.out.println("From the diameter axis from centre------Press '2'");
            b=Integer.parseInt(br.readLine());
            if(b==1)
            {
                System.out.println("\nOK!");
                System.out.print("Enter the Mass:-");
                m=Double.parseDouble(br.readLine());
                System.out.print("Enter the Length of radius:-");
                r=Double.parseDouble(br.readLine());
                
                i=m*r*r/2;
                System.out.println("The Moment of Inertia is:-"+i);
            }
            else if(b==2)
            {
                System.out.println("\nOK!");
                System.out.print("Enter the Mass:-");
                m=Double.parseDouble(br.readLine());
                System.out.print("Enter the Length of radius:-");
                r=Double.parseDouble(br.readLine());
                
                i=m*r*r/4;
                System.out.println("The Moment of Inertia is:-"+i);
            }
            else
                System.out.println("Wrong Password!");
            
        }
        else if(a==4)
        {
                System.out.print("Enter the Mass:-");
                m=Double.parseDouble(br.readLine());
                System.out.print("Enter the Length of radius:-");
                r=Double.parseDouble(br.readLine());
                
                i=m*r*r;
                System.out.println("The Moment of Inertia is:-"+i);
        }
        else if(a==5)
        {
                System.out.print("Enter the Mass:-");
                m=Double.parseDouble(br.readLine());
                System.out.print("Enter the Length of radius:-");
                r=Double.parseDouble(br.readLine());
                
                i=m*r*r/2;
                System.out.println("The Moment of Inertia is:-"+i);
        }
        else if(a==6)
        {
                System.out.print("Enter the Mass:-");
                m=Double.parseDouble(br.readLine());
                System.out.print("Enter the Length of radius:-");
                r=Double.parseDouble(br.readLine());
                
                i=m*r*r*2/4;
                System.out.println("The Moment of Inertia is:-"+i);
        }
        else
            System.out.println("Wrong Input!");
        
    }
    
}
