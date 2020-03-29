package YTTry;
import java.util.Scanner;
public class CS_Dojo_Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the data=");
        int z=1,a=0;
        char messChar;
        String data=sc.nextLine();
        int length=data.length();
        if(data.charAt(0)=='0'){
            System.out.println("No value!");
        }
        else{
        System.out.println("The possible output will be:-\nCase-I");
        for(a=0;a<length;a++){
            char no=data.charAt(a);
            int q=Character.getNumericValue(no);            
                int c=q+64;
                messChar=(char)c;
                System.out.print(messChar);                
        }
        System.out.println();
        System.out.println("Case-II");
        a=0;
        do{
            String no="";
            for(int i=0;i<=1;i++){
                no+=data.charAt(a);
                if(z<length){
                    z++;
                    a++;
                }
                else{
                    a++;
                    i=3;
                }
            }
            if(Integer.parseInt(no)<=26){
                int c=Integer.parseInt(no)+64;
                messChar=(char)c;
                System.out.print(messChar);
            }
            else{
                for(int w=0;w<2;w++){
                    int q=Character.getNumericValue(no.charAt(w));
                    int c=q+64;
                    messChar=(char)c;
                    System.out.print(messChar);
                }                                                                                                                                                                                                                                                               }   
            }while(a<length);
        System.out.println();
        }    
    }
}
