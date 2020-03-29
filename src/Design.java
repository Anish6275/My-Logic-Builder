/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Design {
    public static void main(String args[]) {
        int i,j;
        char c;
        for(c='C';c<='Z';c+=3)
            System.out.println(c);
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=10;j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(i=5;i>=2;i--)
        {
            for (j=1;j<=i;j++)
                System.out.print("  ");
            for (j=1;j<=5-i+1;j++)
                System.out.print(j+"   ");
            System.out.println();
        }
        for(i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++)
                System.out.print("  ");
            for (j=1;j<=5-i+1;j++)
                System.out.print(j+"   ");
            System.out.println();
        }
        
    }
    
}
