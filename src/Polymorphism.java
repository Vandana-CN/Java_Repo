class Math
{
    public int Add(int a, int b)
    {
        int sum = a+b;
        return sum;
    }

    public int Add(int a, int b, int c)
    {
        int sum = a+b+c;
        return sum;
    }

}

public class Polymorphism {
    public static void main(String[] args) {

        Math obj = new Math();
        System.out.println(obj.Add(1,2));
        System.out.println(obj.Add(1,2,3));

    }
}
