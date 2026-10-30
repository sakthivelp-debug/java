public class Sum {
    public static void main(String[] args) {
        class Calculator {
            int add(int a, int b) {
                return a + b;
            }
            int sub(int a, int b) {
                return a - b;
            }
            int mul(int a, int b) {
                return a * b;
            }
            int div(int a, int b) {
                return a / b;
            }
        }
        Calculator s = new Calculator();
        System.out.println("Addition: " + s.add(10, 5));
        System.out.println("Subtraction: " + s.sub(10, 5));
        System.out.println("Multiplication: " + s.mul(10, 5));
        System.out.println("Division: " + s.div(10, 5));
    }
}
