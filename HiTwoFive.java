import java.util.Scanner;
public class HiTwoFive {
    public static void main(String[] args) {
        System.out.println("Enter integer number: ");
        int num = new Scanner(System.in).nextInt();
        
        String s = (num % 2 ==0 && num % 5 ==0)?
                        (num+" HiTwoFive")
                        :(num % 2 ==0)?
                            (num+" HiTwo")
                            :(num+" HiFive");
        
                        
        System.out.println(s);
    }
}
