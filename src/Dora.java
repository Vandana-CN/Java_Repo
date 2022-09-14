import java.util.Scanner;

public class Dora {
    public static void main(String[] args) {
        int row,col,tree;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows,cols,treeNo");
        row = sc.nextInt();
        col=sc.nextInt();
        tree=sc.nextInt();

        if(tree>=1 && tree<=col)
        {
            System.out.println("yes");
        } else if (tree%col==1 || tree%col ==0) {
            System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
