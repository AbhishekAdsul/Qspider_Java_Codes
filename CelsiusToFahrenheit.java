
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[]args){
        double celsius;
        double fahrenheit;
        System.out.println("Enter a degree in celsius: ");
        Scanner sc = new Scanner(System.in);
        celsius = sc.nextDouble();
        fahrenheit = (9.0/5)*celsius+32;
        System.out.println(celsius+" celsius is "+fahrenheit+" Fahrenheit"); 

    }
}
