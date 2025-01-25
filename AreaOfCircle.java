import java.util.*;

public class AreaOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("AREA OF A CIRCLE: ");
        System.out.print("Enter the value of radius: ");
        
        float r = sc.nextFloat();
        final float pie = 22/7f;

        float area = pie*(r*r);

        System.out.println("Area of Circle is: "+area+"cm^2");


    }
}
