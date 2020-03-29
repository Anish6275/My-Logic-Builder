import java.util.Scanner;
public class ADDArr {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char a='a';
        String name[] = null;
        int i=0;
        for(char c='y'; c=='y';c=a){
            System.out.print("Enter the name:-");
            name[i]=sc.nextLine();
            System.out.print("Do you add more:-");
            c=sc.next().charAt(0);
            i++;
        }        
    }    
}
