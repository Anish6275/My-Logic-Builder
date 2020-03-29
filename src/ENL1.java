
import java.util.Scanner;
import java.util.Random;
public class ENL1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.print("Enter the message:-");
        String code="",message=sc.nextLine();
        for(int i=0;i<message.length();i++){
            int ascii=(int)message.charAt(i) ;
            int rand=r.nextInt(25)+1;
            char co=(char) (rand+64);
            int preCode=ascii*rand;
            code+= preCode + "("+co+") ";
        }
        System.out.println("The code is:- "+code);
    }
}
// now lets make it more secure.................