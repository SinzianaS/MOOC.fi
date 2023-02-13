
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average = 0.0;
        int numberOfElements = 0;

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        for(int i:list){
            sum +=i;
            numberOfElements++;
                   
        }
        average = ( 1.0 *sum)/ numberOfElements;
         System.out.println("Average: " + average);
    }
}
