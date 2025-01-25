
import java.util.Scanner;
public class SumEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 digit number: ");
        int num = sc.nextInt();   //1234

        int duplicateNum = num;   //1234

        int rem =0;
        int sum =0;

        rem = num % 10;     //rem = 4
        num = num / 10;     //num = 123 
        sum = sum + rem;    //sum = 4

        rem = num % 10;    //rem = 3
        num = num / 10;    //num = 12     
        sum = sum + rem;   //sum = 7

        rem = num % 10;    //rem = 2
        num = num / 10;    //num = 1     
        sum = sum + rem;   //sum = 9

        rem = num % 10;    //rem = 1
        num = num / 10;    //num = 0    
        sum = sum + rem;   //sum = 10

        String EvenOdd = (sum%2==0)? ("Sum of number is Even"):("Sum of number is Odd");

        System.out.println(EvenOdd);

    }
}
