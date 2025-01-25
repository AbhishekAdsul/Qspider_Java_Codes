
import java.util.Scanner;                                                      
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Cylinder");
        float r = sc.nextFloat();
        System.out.println("Enter the height of the cylider: ");
        float h = sc.nextFloat();
        final float pie = 22/7f;
        float area = pie * r *r;
        float volume = area * h;
        System.out.println("The area of cylinder is: "+area);
        System.out.println("The volume of cylinder is: "+volume);
    }
}
