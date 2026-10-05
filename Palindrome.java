import java.util.Scanner;

public class Palindrome{
    public static void main(String[] agrs){

        Scanner williams = new Scanner(System.in);

        System.out.print("Enter a NUmber: ");
        int number = williams.nextInt();

        int original = number;
        int reverse = 0;

            while(number != 0){
    
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10;
        }

                if(original == reverse){
                    System.out.println("Palindrome");
        }

                else {
                    System.out.println("is not Palindrome");
        }
    }
}

