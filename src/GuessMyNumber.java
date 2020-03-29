import java.util.Scanner;
public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,guess,tries = 0;  
        
        number = (int)(Math.random() * 100) + 1;        
        
        System.out.println("Guess My Number Game"+number);
        System.out.println();        
        do
        {
            System.out.print("Enter a guess between 1 and 100 : ");
            guess = sc.nextInt();                
            tries++;                
        if (guess > number)
            System.out.println("Too high! Try Again");
        else if (guess < number)
            System.out.println("Too low! Try Again");
        else
            System.out.println("Correct! You got it in " + tries + " guesses!");  
        if (tries>10)
            break;
        }while (guess != number);
    }  
}