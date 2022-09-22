class Mat
{
    public void Add(int a, int b)
    {
        int sum = a+b;
        System.out.println(sum);
    }
}
class sample extends Mat
    {
        public void Add(int a, int b)
        {
            int Mul = a*b;
            System.out.println(Mul);
        }
    }


public class RunTPoly extends Mat {
    public static void main(String[] args) {
        Mat obj = new sample();
        obj.Add(2,3);
    }





}
