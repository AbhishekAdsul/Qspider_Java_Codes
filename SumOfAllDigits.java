
import java.util.Scanner;
public class SumOfAllDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four digit number: ");
        int num = sc.nextInt();   //1234
        int dupNum = num;
        int rem = 0; 
        int sum = 0;

        rem = num % 10;  //4
        sum = sum + rem; //4
        num = num / 10;  //123

        rem = num % 10;  //3
        sum = sum + rem; //7
        num = num / 10;  //12

        rem = num % 10;  //2
        sum = sum + rem; //9
        num = num / 10;  //1

        rem = num % 10;  //1
        sum = sum + rem; //10
        num = num / 10;  //0
        
        System.out.println("Sum of Digits of number "+dupNum+" is: "+sum);


    }
}
