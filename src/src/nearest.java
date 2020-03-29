package src;
import java.util.Scanner;
public class nearest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no=(int) sc.nextDouble();
        if(no%10<5)
            System.out.println(no-(no%10));
        else
            System.out.println(no+(10-(no%10)));
    }    
}
