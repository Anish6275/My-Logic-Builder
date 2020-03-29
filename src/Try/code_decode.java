import java.util.Scanner;
public class code_decode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        String ascii = "";
        System.out.print("Enter your message:-");
        s=sc.nextLine();
        int length = s.length();
        for (int i = 0; i <= length-1 ; i++) {
            char ch = s.charAt(i);
            ascii += (int) ch;
        }
        System.out.println( "code : "+ascii );
        // DECODE'''''''''''''''''''''''''''''''''
        System.out.print( "Enter the code  :  ");
        int code = sc.nextInt();      
        String result="" ;
        String str = Integer.toString(code);
        System.out.println(str);         
        int srt_l = str.length();
        System.out.println(srt_l);
        for(int x=0 ; x <=srt_l-1;x+=2){
            char ch = ' ';
            for(int i=x ;i<=x+1 ;i++){
                System.out.println(i);                
                ch += str.charAt(i);                
                System.out.println(ch);
                }
                result += (char) ch ;
            }         
        System.out.println(""+result);      
    }
}