import java.io.*;
import java.util.Scanner;
public class PrintWOsc {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String x;
        int vc=0,cc=0,spc=0,size;
        char ch;
        System.out.print("Enter  the Sentence:-");
        x=sc.nextLine();
        x=x.toLowerCase();
        size=x.length();
        for(int i=0;i<=size-1;i++)
        {
            ch=x.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if(ch=='a'  || ch=='e'  || ch=='i'  || ch=='o'  ||  ch=='u')
                    ++vc;
                else
                    ++cc;
            }
            else
                ++spc;           
        }
        System.out.println("Number of vowels;-"+vc);
        System.out.println("Number of consonents;-"+cc);
        System.out.println("Number of speecial characters;-"+spc);
    }
}
