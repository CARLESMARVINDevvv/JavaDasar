public class UnaryOperator {
    public static void main(String[] args) {
        // Unary Operator
        int a = 10;
        int b = 20;

        // Unary Plus
        System.out.println("Unary Plus: " + (+a)); // 10

        // Unary Minus
        System.out.println("Unary Minus: " + (-b)); // -20

        // Increment
        a++;
        System.out.println("Increment: " + a); // 11

        // Decrement
        b--;
        System.out.println("Decrement: " + b); // 19

        // Logical Complement
        boolean isTrue = true;
        System.out.println("Logical Complement: " + (!isTrue)); // false
    }
}
