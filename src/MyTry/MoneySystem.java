package MyTry;
import java.io.*;
public class MoneySystem {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int m,s=0;
        System.out.print("Enter the money:-");
        m=Integer.parseInt(br.readLine());
        
        System.out.println("You will get:-");
        
        for(int i=2000;i<=m;i+=2000)
            s+=1;
        System.out.println("Rs.2000 X "+s);
        s=0;
        
        if(m%2000!=0) {
            for(int i=500;i<=m%2000;i+=500)
                s+=1;
            System.out.println("Rs.500 X "+s);
        }
        s=0;
        if(m%500!=0) {
            for (int i=200;i<=m%500;i+=200)
                s+=1;
            System.out.println("Rs.200 X "+s);
        }
        s=0;
        if(m%200!=0) {
            for (int i=100;i<=m%200;i+=100)
                s+=1;
            System.out.println("Rs.100 X "+s);
        }
        s=0;
        if(m%100!=0) {
            for (int i=50;i<=m%100;i+=50)
                s+=1;
            System.out.println("Rs.50 X "+s);
        }
        s=0;
        if(m%50!=0) {
            for (int i=20;i<=m%50;i+=20)
                s+=1;
            System.out.println("Rs.20 X "+s);
        }
        s=0;
        if(m%20!=0) {
            for (int i=10;i<=m%20;i+=10)
                s+=1;
            System.out.println("Rs.10 X "+s);
        }
        s=0;
        if(m%10!=0) {
            for (int i=5;i<=m%10;i+=5)
                s+=1;
            System.out.println("Rs.5 X "+s);
        }
        s=0;
        if(m%5!=0) {
            for (int i=2;i<=m%5;i+=2)
                s+=1;
            System.out.println("Rs.2 X "+s);
        }
        s=0;
        if(m%2!=0) {
            for (int i=1;i<=m%2;i+=1)
                s+=1;
            System.out.println("Rs.1 X "+s);
        }
        System.out.println();
            
    }
    
}
