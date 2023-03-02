package task3;

/**
 * Создать массив типа int на 10 элементов, после чего отсортировать
 * по возрастанию и вывести отсортированный массив на экран.
 */
public class Task3 {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        int c = b;
        b = a;
        a = c;
        int j;
        int [] array = {
                1, 4, 5, 2, 6, 8, 3};
        for (int k = 0; k < array.length; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    j = array [i+1];
                    array[i+1] = array[i];
                    array[i] = j;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
