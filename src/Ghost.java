import java.util.Random;

class Color
{
    String[] Colors = {"White", "Yellow", "Purple", "Red"};
    public String RandomColor()
    {
        Random random = new Random();
        int ColorIndex = random.nextInt(Colors.length);
        String SelectedColor = Colors[ColorIndex];
        return SelectedColor;
    }

}

public class Ghost {

    public static void main(String[] args) {
        Color obj1 = new Color();
        Color obj2 = new Color();
        System.out.println(obj1.RandomColor());
        System.out.println(obj2.RandomColor());
    }
}
