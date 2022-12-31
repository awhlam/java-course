
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String valStr = scan.nextLine();
        System.out.println("Give an integer:");
        int valInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double valDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean valBool = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + valStr);
        System.out.println("You gave the integer " + valInt);
        System.out.println("You gave the double " + valDouble);
        System.out.println("You gave the boolean " + valBool);
    }
}
