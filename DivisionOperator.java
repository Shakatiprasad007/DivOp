public class DivisionOperator {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;
        try {
            int div = a / b;
            System.out.println("Divison: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot Divided by zero.");
        }
    }
}