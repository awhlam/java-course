
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int countOfNumbers = 0;
        int evenNumbers = 0;
        System.out.println("Give numbers:");
        while(true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            countOfNumbers++;
            if (input % 2 == 0) {
                evenNumbers++;
            }
        }
        int oddNumbers = countOfNumbers - evenNumbers;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + countOfNumbers);
        System.out.println("Average: " + ((double) sum / countOfNumbers));
        System.out.println("Even: " + evenNumbers);
        System.out.println("Odd: " + oddNumbers);
    }
}
