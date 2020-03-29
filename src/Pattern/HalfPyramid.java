package Pattern;
import java.util.Scanner;
public class HalfPyramid {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int i,a,r;
        System.out.print("Enter the number of rows:-");
        r=sc.nextInt();
        
        for(i=r;i>=1;i--)
        {
            for(a=r;a>=i;a--)
                System.out.print(" ");
            for(a=1;a<=i;a++)
                System.out.print(a+" ");            
            System.out.println("");
        }
    }
}