
import java.util.Scanner;
public class ProductsOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four digit number: ");
        int num = sc.nextInt();   //1234
        int dupNum = num;
        int rem = 0; 
        int prod = 1;

        rem = num % 10;  //4
        prod = prod * rem; //4
        num = num / 10;  //123

        rem = num % 10;  //3
        prod = prod * rem; //7
        num = num / 10;  //12

        rem = num % 10;  //2
        prod = prod * rem; //9
        num = num / 10;  //1

        rem = num % 10;  //1
        prod = prod * rem; //10
        num = num / 10;  //0
        
        System.out.println("prod of Digits of number "+dupNum+" is: "+prod);


    }
}
