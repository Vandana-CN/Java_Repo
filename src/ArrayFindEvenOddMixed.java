import java.util.Scanner;

public class ArrayFindEvenOddMixed {

    public void find(int o,int e,int length)
    {

        if(o == length)
        {
            System.out.println("odd");
        }

        else if(e == length)
        {
            System.out.println("even");

        }
        else {

            System.out.println("mixed");
        }


    }



    public static void main(String[] args) {


        int odd =0, even = 0;
        int n[]= new int[3];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n.length;i++) {
            n[i] = sc.nextInt();
        }

        for(int i = 0; i < n.length; i++)
        {
            if(n[i] % 2 == 1)
                odd++;
            else
                even++;
        }


        ArrayFindEvenOddMixed obj = new ArrayFindEvenOddMixed();
        obj.find(odd,even,n.length);


    }


}
