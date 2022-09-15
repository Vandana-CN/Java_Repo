import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Rows - ");

        int rows = sc.nextInt();
        int x = 65;

        for (int i=0; i< rows; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print((char) (x+j) + " ");
            }
            System.out.println();
        }
    }
}
