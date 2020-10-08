import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Calculus");
        list.add("Grammar");
        list.add("Science");
        list.add("Biology");
        list.add("Psychology");
        list.add("Spanish");
        list.add("PE");

        System.out.println("Before sort: " + list);

        Collections.sort(list);
        System.out.println("After sort: " + list);
    }
}
