import java.util.Scanner;
import java.util.Random;
public class encrypting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random no=new Random();
        String message, code=" ";
        int rand;
        char ch;
        System.out.print("Enter the message:-");
        message=sc.nextLine();
        int size=message.length();
        for (int i=0;i<=size-1;i++) {
            ch=message.charAt(i);
            int ascii=(int)ch;
            for(rand=0;rand%2==0;rand=1+no.nextInt(10)){}
            int c = (ascii-65)*rand;
            code += c + "(" + rand + ").";
        }
        System.out.println("Code:-"+code);
    }    
}

/*
import java.util.LinkedHashMap;
public class encrypting {
    public static void main(String args[]){
        LinkedHashMap lh=new LinkedHashMap();
        lh.put("a",5);
        lh.put("a",10);
        System.out.println(lh);        
    }
}
*/