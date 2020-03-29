import java.util.Scanner;
public class decrypting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String code,m="";
        char c;
        System.out.print("Enter the code:-");
        code=sc.nextLine();
        int size=code.length();
        for (int i=0;i<=size-1;i++){
            String ncod="",rcod="";
            for(c=code.charAt(i++);c!='(';c=code.charAt(i++))
                ncod += c;
            for(c=code.charAt(i++);c!=')';c=code.charAt(i++))
                rcod += c;
            int nc=Integer.parseInt(ncod);
            int rc=Integer.parseInt(rcod);
            int cod = (nc/rc)+65;
            m+=(char)cod;            
        }
        System.out.println("Message:- "+m);        
    }
}
