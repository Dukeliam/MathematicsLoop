import java.util.Scanner;

public class Reverse{
    public static void main(String[] agrs){

        Scanner williams = new Scanner(System.in);

            System.out.print("Enter Number: ");
            int number = williams.nextInt();

                int reverse = 0;
            for(int index = 0; index <= number; index++){
                       int digit = number % 10;
                      reverse = reverse * 10 + digit;
                      number = number / 10;
            }               
                    System.out.println(reverse); 
   }
}
