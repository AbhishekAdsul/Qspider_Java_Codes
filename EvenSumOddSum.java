class EvenSumOddSum{
    public static void main(String[] args) {
        int num = 1212;                       
        int evenSum = 0;
        int oddSum = 0;
        int rem = 0;

        rem = num % 10;     //2
        int result = (rem % 2 == 0)?(evenSum += rem):(oddSum += rem); //evensum = 2
        num = num/10;  //121

        rem = num % 10; //1
        int result1 = (rem % 2 == 0)?(evenSum += rem):(oddSum += rem); //oddsum = 1
        num = num/10;   //12

        rem = num % 10;  //2
        int result2 = (rem % 2 == 0)?(evenSum += rem):(oddSum += rem); //evensum = 4
        num = num/10;   //1

        rem = num % 10;  //1
        int result3 = (rem % 2 == 0)?(evenSum += rem):(oddSum += rem); //oddsum = 2
        num = num/10; // 0

        System.out.println("Even sum is: "+ evenSum + " Odd sum is: "+oddSum);
    }
}