public class Main {
    public static void main(String[] args)  {
        double number1 = MyInput.number("Input base: ");
        double number2 = MyInput.number("Input exponent: ");
        PowerCalculator pc = new PowerCalculator();
        try {
            System.out.println(pc.calculatePower(number1, number2));
        }catch (InvalidInputException ex){
            System.out.println(ex.getMessage());
        }
    }
}
