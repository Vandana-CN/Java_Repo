import java.util.ArrayList;
import java.util.Iterator;
class PeekingIterator implements Iterator<Integer>
{
    Iterator<Integer> itr;
    Integer peek;
    public PeekingIterator(Iterator<Integer>numbers)
    {
        itr=numbers;
        peek=null;
    }
    @Override
    public boolean hasNext()
    {
        return itr.hasNext();
    }

    @Override
    public Integer next() {
        if(itr.hasNext())
        {
            peek= itr.next();
            return peek;
        }
        else
        {
            return  0;
        }
    }


    public Integer peek()
    {
        return peek;
    }

    @Override
    public void remove() {

    }

    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<>(5);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        PeekingIterator obj=new PeekingIterator(array.iterator());
        System.out.println(obj.next());
        System.out.println(obj.peek());
        System.out.println(obj.next());
        System.out.println(obj.peek());
        System.out.println(obj.hasNext());

    }


}
