
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int count = 0;
        float sum = 0;
        float average;

        while (true) {
            int number = Integer.valueOf(scan.nextLine());

           
            if (number > 0) {
                sum = sum + number;
                count = count + 1;
                
            }
            if (number < 0) {
                continue;
            }

            if (number == 0) {
                break;
            }

        }
       
        if (count == 0) {
            System.out.println("Cannot calculate the average.");
        } else {
            average = sum / (float) count;
            System.out.println(average);
        }
    }
}
