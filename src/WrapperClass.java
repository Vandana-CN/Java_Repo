import java.util.Scanner;

public class WrapperClass {

    private int number;

    WrapperClass(int n)
    {
        number = n;
    }

    public int getInt()
    {
        return number;
    }


    public String getString()
    {
        return Integer.toString(number);
    }

    public String getBinary()
    {
        return Integer.toBinaryString(number);
    }

    public boolean isOdd()
    {
        if(number%2!=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        WrapperClass value = new WrapperClass(n);
        System.out.println(value.getInt());
        System.out.println(value.getBinary());
        System.out.println(value.getString());
        System.out.println(value.isOdd());


    }
}
