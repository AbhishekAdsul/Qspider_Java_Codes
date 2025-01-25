
import java.util.Scanner;
class ReverseThreeDigitNumber{
    public static void main(String[] args) {
        System.out.println("Enter a three digit number: ");
        int num = new Scanner(System.in).nextInt();
        int dupNum = num;
        int rem =0;
        int rev =0;

        rem = num % 10;
        rev = rem * 100;
        num = num / 10;

        rem = num % 10;
        rev = rev + rem * 10;
        num = num / 10;

        rem = num % 10;
        rev = rev + rem;
        num = num / 10;

        System.out.println("Reverse of number "+dupNum+" is: "+rev);
    }
}