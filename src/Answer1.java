import java.util.Arrays;

public class Answer1 {

    public static <T> void swapElements (T[] array, int index1, int index2) {
        if (array == null)
            throw new IllegalArgumentException("Нужен массив");

        chekIndex(array, index1);
        chekIndex(array, index2);
        swap(array, index1, index2);

    }

    private static <T> void swap (T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <T> void chekIndex (T[] array, int index) {
        if (index < 0 || index >= array.length)
            throw new  IllegalArgumentException("Неверный индекс");
    }

    public static void main(String[] args) {
        Integer[] IntegerArray = {1, 2, 3};
        System.out.println(Arrays.toString(IntegerArray));
        swapElements(IntegerArray, 0, 2);
        System.out.println(Arrays.toString(IntegerArray));

        String[] StringArray = {"a", "b", "c"};
        System.out.println(Arrays.toString(StringArray));
        swapElements(StringArray, 1, 2);
        System.out.println(Arrays.toString(StringArray));
    }


}
