public class TernaryOperatorNested {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        int c = 87;

        int largest = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
        System.out.println("Largest number is: "+largest);  

        int smallest = (a<b)?((a<c)?(a):(c)):((b<c)?(b):(c));
        System.out.println("Smallest number is: "+smallest);



      
    }
}
