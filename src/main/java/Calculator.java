public class Calculator {
    public float add(float a, float b) {
        return a + b;
    }

    public float subtract(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        if (b == 0f) {
            throw new IllegalArgumentException("Division by 0!");
        }
        return a / b;
////
    }

    public int raise(int a, int b) {
        int result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
        ////
    }

    public int sum(int a, int... rest) {
        int sum = a;
        for (int b : rest) {
            sum += b;
        }
        return sum;
    }

    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    public double cubeRoot(double a) {
        return Math.cbrt(a);
    }

    public static void main(String[] args) {
        System.out.println(999199.1231231234 == 999199.1231231235);
    }

    public double squareRoott(double a) {
        return Math.sqrt(a);
    }

    public double cubeRoott(double a) {
        return Math.cbrt(a);
    }
}
