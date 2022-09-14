import java.util.Scanner;

public class collatz {
    public static void main (String[] args)
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter - ");
        num = sc.nextInt();

        if(num==1)
        {
            System.out.println(num);
            System.out.println("0");
        }
        else
        {
        while (num != 1)
        {
            System.out.print(num + " ");
            if(num % 2 != 0)
                num = 3 * num + 1;
            else
                num = num / 2;
        }
        System.out.print(num);
        }
    }


}
