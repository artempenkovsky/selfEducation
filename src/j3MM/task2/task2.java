package j3MM.task2;

/**
 *Создать метод, который принимает строку, переворачивает ее
 *и возвращает перевернутый результат. Пример : «Hello» - «olleH».
 */
public class task2 {
    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArrayReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = UserInputUtils.createNewArray();
        System.out.println("Введенный результат: ");
        printArray(array);
        System.out.println("Перевернутый результат: ");
        printArrayReverse(array);
    }
}
