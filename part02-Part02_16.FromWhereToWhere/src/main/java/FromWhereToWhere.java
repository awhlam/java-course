
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int toInput = Integer.valueOf(scanner.next());
        System.out.print("Where from? ");
        int fromInput = Integer.valueOf(scanner.next());
        
        if (toInput >= fromInput) {
            for (int i = fromInput; i <= toInput; i++) {
                System.out.println(i);
            }
        }
    }
}
