import java.util.Scanner;
import java.util.Random;  

public class App {
    public static void main(String[] args){

        //Part 1 of homework--------------------------------------------------------------

        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Enter first number: ");
            int numOne = scan.nextInt();
            
            System.out.println("Enter Second number: ");
            int numTwo = scan.nextInt();
    
            int total = numOne + numTwo;
            System.out.println("The total when " + numOne + " and " + numTwo + " are added together is " + total);
        }catch(Exception InputMismatchException){
            System.out.println("Sorry, you did not provide two integers to use, please try again.");
        }

        //Part 2------------------------------------------------------------------

        Scanner randscan = new Scanner(System.in);
        int[] randomArray = new int[100];
        Random rand = new Random();

        
        for(int i = 0; i < 100; i++){
            int randNum = rand.nextInt(1000);
            randomArray[i] = randNum;
        }

        try{
            System.out.println("Type a number between 1 and 100 and see what the array hides: ");
            int in = randscan.nextInt();

            System.out.println("The number was " + randomArray[in-1]);
        }catch(Exception e){
            System.out.println("Out Of Bounds");
        }finally{
            randscan.close();
            scan.close();
        }
    }
}
