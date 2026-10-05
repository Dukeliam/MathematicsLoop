import java.util.Scanner;

public class PrimeFactor{
    public static void main(String[] agrs){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

            for(int index = 2; index <= number; index++){
                    while(number % index == 0 ){ 
                        number = number / index;
                            System.out.println(index);
             }
        }
    }
}
