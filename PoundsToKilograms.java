
import java.util.Scanner;
public class PoundsToKilograms {
    public static void main(String[] args) {
        System.out.println("Enter a number in pounds: ");
        float pounds = new Scanner(System.in).nextFloat();
        float kilo = pounds * (0.454f);
        System.out.println(pounds+" pounds "+"is: "+kilo+" kilograms");
    }
}
