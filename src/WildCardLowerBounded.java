import java.util.ArrayList;
import java.util.List;

public class WildCardLowerBounded {
    public static void printList(List<? super Integer> listOfAll)
    {
        System.out.println(listOfAll);
    }

    public static void main(String[] args) {
        List<Integer> intList=new ArrayList<>();
        intList.add(16);
        intList.add(18);
        printList(intList);
        List<Number> numberList=new ArrayList<>();
        numberList.add(17);
        numberList.add(18);
        printList(numberList);

    }
}
