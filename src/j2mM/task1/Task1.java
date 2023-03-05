package task1;

/**
 * Создать числовой массив на 100 элементов, заполнив его числами от 1 до 100.
 * После чего вывести на экран все простые числа из этого массива.
 */
public class Task1 {
        public static void main(String[] args) {
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
            for (int num : array) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }
        public static boolean isPrime(int values) {
            if (values <= 1) {
                return false;
            }
            for (int i = 2; i < values; i++) {
                if (values % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

