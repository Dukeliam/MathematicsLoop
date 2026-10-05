import java.util.Scanner;

public class Reverse{
    public static void main(String[] agrs){

        Scanner williams = new Scanner(System.in);

            System.out.print("Enter Number: ");
            int number = williams.nextInt();

                int digit;
            for(int index = 0; index <= number; index++){
                       digit = number % 10;
                    System.out.println(digit); 

                      number = number / 10;
            }               
   }
}
