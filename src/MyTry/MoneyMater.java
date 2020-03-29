package MyTry;
import java.io.*;
public class MoneyMater {
    public static void main(String args[])throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        System.out.print("Enter the amount:-");
        double amount=Double.parseDouble(br.readLine());
        if (amount>=2000) {
            s=(int) (amount/2000);
            amount=amount%2000;
            System.out.print("2000 X "+s+ " + ");
        }        
        if(amount>=500) {
            s=(int) (amount/500);
            amount=amount%500;
            System.out.print("500 X "+s+ " + ");
        }
        if(amount>=200) {
            s=(int) (amount/200);
            amount=amount%200;
            System.out.print("200 X "+s+ " + ");
        }
        if(amount>=100) {
            s=(int) (amount/100);
            amount=amount%100;
            System.out.print("100 X "+s+ " + ");
        }
        if(amount>=50) {
            s=(int) (amount/50);
            amount=amount%50;
            System.out.print("50 X "+s+ " + ");
        }
        if(amount>=20) {
            s=(int) (amount/20);
            amount=amount%20;
            System.out.print("20 X "+s+ " + ");
        }
        if(amount>=10) {
            s=(int) (amount/10);
            amount=amount%10;
            System.out.print("10 X "+s+ " + ");
        }
        if(amount>=5) {
            s=(int) (amount/5);
            amount=amount%5;
            System.out.print("5 X "+s+ " + ");
        }
        if(amount>=2) {
            s=(int) (amount/2);
            amount=amount%2;
            System.out.print("2 X "+s+ " + ");
        }
        if(amount>=1) {
            s=(int) (amount/1);
            amount=amount%1;
            System.out.print("1 X "+s+ " + ");
        }             
    }
}