package task4;

/**
 * Написать метод, принимающий два параметра : массив чисел и какое-то число N
 * Метод должен вернуть индекс элемента N в принимаемом массиве.
 */
public class Task4 {
    public static void main(String[] args) {
        int[]  array =  {10,20,40, 6, 60};
        int N = 20;
        int index = findIndex (array, N);
        System.out.println("индекс элемента " + N + " в массиве " + index);
    }

    public static int findIndex (int[] array, int N) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == N){
                return i;
            }

        }
        return -1;
    }
}
