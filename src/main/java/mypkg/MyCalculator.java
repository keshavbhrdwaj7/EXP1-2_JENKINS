package mypkg;

public class MyCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static int power(int a, int b) {
        int answer = 1;
        for (int i = 0; i < b; i++)
            answer *= a;
        return answer;
    }

    public static int modulus(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed.");
        }
        return a % b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        MyCalculator myCalc = new MyCalculator();
        System.out.println(myCalc.add(1, 2));
        System.out.println(myCalc.subtract(1, 2));
        System.out.println(MyCalculator.multiply(1, 2));
        System.out.println(MyCalculator.divide(1, 2));
        System.out.println(MyCalculator.power(2, 3));
        System.out.println(MyCalculator.modulus(5, 3));
        System.out.println(MyCalculator.square(4));
    }
}
