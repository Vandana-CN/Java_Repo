
import java.util.Scanner;

public class IfelseLargestNumber {
    public static void main(String[] args) {
        int x,y,z,temp,f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter - ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if(x>y)
        {
            temp=x;
        }
        else {
            temp = y;
        }
        if(temp>z)
        {
         f=temp;
        }
        else
        {
            f=z;
        }
        System.out.println("Largest number - " + f);
    }
}
