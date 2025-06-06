public class Task005 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("Main Started");
        int additionResult = add(a, b);
        int subtractionResult = subtract(a, b);
        int multiplicationResult = multiply(a, b);
        int divisionResult = divide(a, b);
        System.out.println("Sum of 2 numbers is : "+additionResult);
        System.out.println("Diff of 2 numbers is : "+subtractionResult);
        System.out.println("Product of 2 numbers is : "+multiplicationResult);
        System.out.println("Division of 2 numbers is : "+divisionResult);
        System.out.println("Main Ended");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;

    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide (int a, int b) {
        return a / b;
    }
}