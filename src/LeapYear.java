import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        int x;
        System.out.println("Enter an Year -  ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if ((x % 400 == 0) || ((x % 4 == 0) && (x % 100 != 0)))
            System.out.println("Leap year");
        else
            System.out.println("Not leap year");
    }
}