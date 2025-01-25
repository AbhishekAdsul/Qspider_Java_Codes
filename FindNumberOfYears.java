
import java.util.Scanner;
public class FindNumberOfYears {
    public static void main(String[] args) {
        System.out.println("Enter the minutes: ");
        int min = (new Scanner(System.in).nextInt());
        int minYear = 365*24*60;
        int years = min / minYear;
        int days = (min % minYear)/(24*60);
        System.out.println("User Entered Min: "+min);
        System.out.println(years + " years "+ days + " days");
    }  
}
