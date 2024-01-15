import java.util.Scanner;

public class GradingSystem {

    static int getSum(int num, int[] array) {

        int sum = 0;

        for (int i = 0; i < num; i++)

            sum += array[i];

        return sum;
    }

    static int getAvg(int num, int[] array) {

        int sum = 0;

        for (int i = 0; i < num; i++)

            sum += array[i];

        return sum / num;

    }

    static int getMax(int num, int[] array) {

        int max = array[0];

        for (int i = 0; i < num; i++) {

            if (array[i] > max)

                max = array[i];

        }

        return max;
    }

    static int getMin(int num, int[] array) {

        int min = array[0];

        for (int i = 0; i < num; i++) {

            if (array[i] < min)

                min = array[i];

        }

        return min;
    }

   
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char repeat;
        do {
            System.out.print("\nWelcome to the grading system!\nHow many subjects do you have? ");
            int num = sc.nextInt();

            int[] array = new int[num];

            for (int i = 0; i < num; ) {
                System.out.print("Enter the grade for subject " + (i + 1) + ": ");
                array[i] = sc.nextInt();

                if (array[i] >= 0 && array[i] <= 100)
                    i++;
                else
                    System.out.println("Invalid number in subject " + (i + 1) + "...Please enter a number between 0 and 100");
            }

            double average = getAvg(num, array);

            System.out.println("\nThe sum of the grades is " + getSum(num, array));

            System.out.println("\nThe average of the grades is " + average);

            System.out.println("\nThe highest grade is " + getMax(num, array));

            System.out.println("The lowest grade is " + getMin(num, array));

            System.out.println("\nAverage    Score");

            if (average >= 90)
                System.out.println(getAvg(num, array) + "           " + "A");
            else if (average >= 80 && average <= 89)
                System.out.println(getAvg(num, array) + "           " + "B");
            else if (average >= 70 && average <= 79)
                System.out.println(getAvg(num, array) + "           " + "C");
            else if (average >= 60 && average <= 69)
                System.out.println(getAvg(num, array) + "           " + "D");
            else if (average < 60)
                System.out.println(getAvg(num, array) + "           " + "F");

            System.out.print("\nDo you want to repeat? (y for yes, n for no): ");
            repeat = sc.next().charAt(0);

        } while (repeat == 'y' || repeat == 'Y');

        System.out.println("Thanks for choosing the grading system.");
    }
}
