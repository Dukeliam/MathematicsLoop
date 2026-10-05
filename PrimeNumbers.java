import java.util.Scanner;

public class PrimeNumbers{
      public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      boolean isPrime = true;
      for(int count = 1; count <= 20; count++){    
           for(int index = 2; index < number; index++){
            if(number % index == 0){
            isPrime = false;
                 }
            }
      if(isPrime){
             System.out.println(number);                       
            }
            }
      }
}
