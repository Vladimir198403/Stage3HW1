import java.util.ArrayList;
import java.util.List;

public class Answer2 {

    public static <T> List <T> transform(T[] array){
        List<T> list = new ArrayList<>();
        for (T value : array) {
            list.add(value);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c"};
        List<String> stringList = transform(stringArray);
        System.out.println(stringList.getClass().getSimpleName() + " - " + stringList);
    }
}
