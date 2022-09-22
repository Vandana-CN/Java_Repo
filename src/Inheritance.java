class Greetings {

    public void Greetings() {
        System.out.println("Hi!");
    }
}

class Names extends Greetings{
    public void Name() {
        System.out.println("John");
    }
}

public class Inheritance extends Names {
    private String g = "Good Morning";
    public static void main(String[] args) {

        Inheritance Greet = new Inheritance();
        Greet.Greetings();
        Greet.Name();
        System.out.println(Greet.g);
    }
}
