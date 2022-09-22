interface Add{
    int add(int a,int b);

}

public class LambdaExpression {
    public static void main(String[] args) {
        Add obj=(a,b)->(a+b);

        System.out.println(obj.add(10,20));
    }
}
