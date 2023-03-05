package j3MM.task1;
import java.util.Scanner;

/**
 * Написать метод, принимающий число и определяющий, является ли оно палиндромом.
 * Метод должен возвращать ответ в виде boolean значения.
 */
public class task1 {
    public static boolean isPalindrome (int number) {
        int original = number; // оригинальное число, которое мы передаем в метод
        int reverse = 0; // перевернутое число
        while (number !=0) {
            reverse = reverse *10 + number % 10;
            number = number / 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        boolean isPalindrome = isPalindrome(number);
        if (isPalindrome) {
            System.out.println("Число " + number + " является палиндромом");
        } else {
            System.out.println("Число " + number + " не является палиндромом");
        }



    }
}
