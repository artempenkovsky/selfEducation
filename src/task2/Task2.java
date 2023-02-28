package task2;

public class Task2 {
    public static void main(String[] args) {
        int value = 3;
        int result = factorial(value);
        System.out.println(result);
    }
    public static int factorial (int value) {
        int result = 1;
        for (int i = 1; i < value; i++) {
            result = result * i;
        }
        return result;
    }
}
