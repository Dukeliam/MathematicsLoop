import java.util.Scanner;

public class Armstrong{
    public static void main(String[] agrs){

        Scanner williams = new Scanner(System.in);

        System.out.print("Enter a NUmber: ");
        int number = williams.nextInt();

        int original = number;
        int sum = 0;

            while(number != 0){
    
                int digit = number % 10;
                sum = sum * 10 + digit * digit * digit;
                number = number / 10;
        }

                if(original == sum){
                    System.out.println("Armstrong");
        }

                else {
                    System.out.println("is not Armstrong");
        }
    }
}

