import java.util.Scanner;

public class Armstrong{
    public static void main(String[] agrs){

        Scanner williams = new Scanner(System.in);

        System.out.print("Enter a NUmber: ");
        int number = williams.nextInt();

        String binary = "";
            while(number != 0){
    
                int remainder = number % 2;
                binary = remainder + binary;
                number = number / 2;
        }
                System.out.println("Binary = " + binary);
        
    }
}

