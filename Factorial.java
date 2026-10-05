import java.util.Scanner;

public class Factorial{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextInt();

         long factorial = 1;

          for(long index = 1; index <= number; index++){
                factorial = factorial * index;

        }
                     System.out.println(factorial);
    }
}
