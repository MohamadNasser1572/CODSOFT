import java.util.Scanner;
public class numberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random, number, attempts = 0, maxTries=5;
        int repeat;
        do {
            random = (int) (Math.random() * 100);
            System.out.print("Enter the number to be guessed (between 0 and 100): ");
            do {
                number = sc.nextInt();
                attempts++;
                if(attempts==maxTries){
                    System.out.println("You have reached the maximum amount of tries. The correct nummber was "+random);
                    break;
                }
                 
                else if (number < 0 || number > 100)
                    System.out.println("Invalid input! Please enter a number between 0 and 100");
                else if (number > random)
                    System.out.println("Your number is too high!");

                else if (number < random)
                    System.out.println("Your number is too low!");

                else
                    System.out.println("You guessed the right number! ");
                    
            } while (number != random);
              System.out.println("You tried "+attempts+" times.");
              attempts=0;

             System.out.print("\nDo you want to repeat? (1:yes,0:no): ");
            repeat=sc.nextInt();

        } while(repeat!=0);
    }
}
