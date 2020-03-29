import java.util.Scanner;
     
    public class NewClass
    {
        public static void main(String[] args)
        {
            int min = 0;
        
         
        
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("Enter an integer number or 0 to quit: ");
        input = sc.nextInt();
                int max = 0;
        
         
        
        if (input == 0|| input== 0)
        {
            System.out.println("\nYou did not enter any numbers");
        }
                else
                {
        while (input != 0)
        {
        if (input > max)
        {
            max = input;
        }
        else if (input < min)
        {
            min = input;
        }
        System.out.print("Enter an integer number or 0 to quit: ");
        input = sc.nextInt();
        }
        System.out.print("\nLargest: " + max);
 
        System.out.print("\nSmallest:" + min);
        }
    }  

    }
 