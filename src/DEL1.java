//package javaclass;
import java.util.Scanner;
public class DEL1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the code:-");
        String message="",code=sc.nextLine();
        int size=code.length();
        
        for(int i=0;i<size;i++){
            String a="",b="";
            for(char c=code.charAt(i++);c!='('; c=code.charAt(i++))
                a+=c;
            int ai=Integer.parseInt(a);
            //for(char c=code.charAt(i++);c!=')'; c=code.charAt(i++))  
               // b+=c;
            //i++;
            char co=code.charAt(i);
            //int bi=Integer.parseInt(b);
            int bi=((int)co)+64;
            char preMessage=(char)(ai/bi);
            message+=preMessage;    
                        
        }
        System.out.println(message);
        
    }
    
}
// Thank You! For Watching 
// Seew in the next one!!