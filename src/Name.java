class NameMe
{
    String firstName;
    String lastName;
    String name;

    public NameMe(String first, String last) {
        firstName = first;
        lastName = last;
        name = firstName+" "+lastName;

    }
}

public class Name {

    public static void main(String[] args) {
        NameMe obj = new NameMe("John", "Doe");
        System.out.println(obj.firstName);
        System.out.println(obj.lastName);
        System.out.println(obj.name);

    }

}
