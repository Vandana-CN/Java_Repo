import java.util.Scanner;

public class MatrixMagicSquare {

    static int MagicMat(int Matrix[][], int y)
    {
        int D1=0, D2=0;

        for(int i=0;i<y;i++)
        {
            D1 += Matrix[i][i];
            D2 += Matrix[i][y-1-i];
        }

        if(D1 != D2)
        {
            return 0;
        }

            for(int i=0;i<y;i++)
            {
                int row=0, col=0;
                for(int j=0;j<y;j++)
                {
                    row += Matrix[i][j];
                    col += Matrix[j][i];
                }

                if(row != col || row != D1)
                {
                    return 0;
                }
            }
        return 1;
    }

    public static void main(String[] args)
    {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x - ");
        x = sc.nextInt();
        int Mat[][] = new int[x][x];
        System.out.println("Enter elements of the array");

        for(int i=0;i<x;i++)
        {
            for(int  j=0;j<x;j++)
            {
                Mat[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<x;i++)
        {
            for(int  j=0;j<x;j++)
            {
                System.out.print(Mat[i][j]+" ");
            }
            System.out.println();
        }

        if(MagicMat(Mat,x) == 1)
        {
            System.out.println("Magic square");
        }
        else
        {
            System.out.println("Not Magic square");
        }

    }
}
