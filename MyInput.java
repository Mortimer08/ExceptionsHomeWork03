import java.util.InputMismatchException;
import java.util.Scanner;

public class MyInput {
    private static final Scanner iScanner = new Scanner(System.in);
    public static double number(String message) {

        double iNumber;
        while (true) {
            try {
                System.out.print(message);
                iNumber = iScanner.nextDouble();
                System.out.print("");
                return iNumber;
            } catch (InputMismatchException ex) {
                System.out.println("Only numbers permitted");
                iScanner.next();
            }
        }
    }
}
