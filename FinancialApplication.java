//tip calculator
import java.util.*;
public class FinancialApplication {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the subtotal: ");
        float subtotal = sc.nextFloat();
        
        System.out.println("Enter a tip rate: ");
        float gratuityRate = sc.nextFloat();

        float tip = (gratuityRate/100)*subtotal;
        float total = subtotal + tip;

        System.out.print("The tip is: "+tip);
        System.out.println(" and total is: "+total);

    }
}
