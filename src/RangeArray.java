import java.util.Scanner;

public class RangeArray {

    static int MinMax(int n, int Array[])
    {
        int range;
        int min = Array[0];
        int max = Array[0];

        for(int i=1;i<n;i++)
        {
            if(Array[i]<min)
            {
                min = Array[i];
            }
            if(Array[i]>max)
            {
                max = Array[i];
            }
        }

        return range = max-min;
    }



    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter - ");
        n = sc.nextInt();
        int Arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            Arr[i] = sc.nextInt();
        }

        for(int i=0;i<Arr.length;i++)
        {
            System.out.print(Arr[i]+" ");
        }
        System.out.println();

        if(Arr.length == 1)
        {
            System.out.println("Only one element is present in the array "+ Arr[0]);
        }
        else{

        System.out.println(MinMax(n,Arr));
        }
    }
}
