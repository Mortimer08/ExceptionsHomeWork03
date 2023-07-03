import java.util.InputMismatchException;
import java.util.Scanner;

public class iInput {
    private static final Scanner iScanner = new Scanner(System.in);
    public static double number(String message) {

        double iNumber = 0;
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
