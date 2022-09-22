import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
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
        List<Double> doubleList=new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);
        //printList(doubleList);

    }
}
