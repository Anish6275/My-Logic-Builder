package Try;
import java.util.Scanner;
public class Strings {
    public static void main(String args[]){
        Scanner br=new Scanner(System.in);
        String str;
        
        System.out.print("Enter the String:-");
        str=br.nextLine();
        String R="";
        
        int vowel = 0;
        for(int i = 0; i<str.length(); i++)
        {
            switch(str.charAt(i))
            {
                case 'A' :
                case 'E' :
                case 'I' :
                case 'O' :
                case 'U' :
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' : vowel++ ;
                R+=str.charAt(i);
            }
        }
        System.out.println("The number of vowels are:-"+vowel+". They are '"+R+"'.");
    }
        
}
    

