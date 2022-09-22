class Gen {
    public <T> void GenericsMethod(T data) {
        System.out.println(data);
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        Gen obj = new Gen();
        obj.<String>GenericsMethod("Hello");
        obj.<Integer>GenericsMethod(18);
    }
}
