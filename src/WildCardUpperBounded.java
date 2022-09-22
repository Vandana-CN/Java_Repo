import java.util.ArrayList;
import java.util.List;
public class WildCardUpperBounded {
    public static void printList(List<? extends Number> listOfAll)
    {
        System.out.println(listOfAll);
    }

    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(16);
        intList.add(18);
        printList(intList);
        List<Double> doubleList=new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);
        printList(doubleList);
    }
}