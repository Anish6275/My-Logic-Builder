/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTry;
import java.util.Scanner;
public class Pattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i, j;
        System.out.print("Enter how many line do you want:-");
        a=sc.nextInt();
        for(i=0; i<=a-1; ++i)
        {
            for(j=0; j<=a-1; ++j)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
