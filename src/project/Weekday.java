/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.io.*;
public class Weekday
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a;
        System.out.print("Enter the week number:-");
        a=Integer.parseInt(br.readLine());
        
        switch(a)
        {
            case 1 :System.out.println("Monday");
            break;
            case 2 :System.out.println("Tuesday");
            break;
            case 3 :System.out.println("Wednesday");
            break;
            case 4 :System.out.println("Thursday");
            break;
            case 5 :System.out.println("Friday");
            break;
            case 6 :System.out.println("Saturday");
            break;
            case 7 :System.out.println("Sunday");
            break;
            default : System.out.println("Invalid Input!");
        }
        
    }
    
}
