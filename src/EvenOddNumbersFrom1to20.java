public class EvenOddNumbersFrom1to20 {
    public static void main(String[] args) {

        System.out.println("Even numbers between 1 and 20 -");
        for(int i=1;i<20;i++)
        {
            if (i%2==0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Odd numbers between 1 and 20 -");
        for(int i=1;i<20;i++)
        {
            if (i%2!=0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
