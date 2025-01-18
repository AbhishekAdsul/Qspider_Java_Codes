//Modulo
//Subtraction
//Multiplication
//Division
//Modulus
class Operators_Modulus
{
    public static void main(String[] args)
    {
        byte b1 =93;
        byte b2 =30;

        short s1 = 1503;
        short s2 = 500;

        char a='a';
        char b='b';

        int num1 = 8003;
        int num2 = 2000;

        long l1  = 25003;
        long l2 = 25;

        float f1 = 3.3f;
        float f2 = 3.3f;

        double d1 = 33.33;
        double d2 = 33.33;

        String str1 = "Abhishek";
        String str2 = "Adsul";

        boolean t1 = true;
        boolean t2 = false;

        //Modulo
        int Byte_Var_Modulo = b1 % b2;
        int Short_Var_Modulo = s1 % s2;
        int char_Var_Modulo = a % b;
        int int_Var_Modulo = num1 % num2;
        long long_Var_Addtion = l1 % l2;
        float float_Var_Modulo = f1 % f2;
        double double_Var_Modulo = d1 % d2;

        System.out.println("Modulo of Byte: "+Byte_Var_Modulo);
        System.out.println("Modulo of Short: "+Short_Var_Modulo);
        System.out.println("Modulo of Char: "+char_Var_Modulo);
        System.out.println("Modulo of Int: "+int_Var_Modulo );
        System.out.println("Modulo of long: "+long_Var_Addtion);
        System.out.println("Modulo of Float: "+float_Var_Modulo);
        System.out.println("Modulo of Double: "+double_Var_Modulo);
         
    }
}