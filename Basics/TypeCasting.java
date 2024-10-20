import java.net.SocketOption;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int num = input.nextFloat(); // this will not work
        float num2 = input.nextInt(); //this will be automatically done by java

        //type casting
        int num3 = (int)(65.45f);
        System.out.println(num3);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b); // this will give me an output as 1 since the max value stored in byte is 256
        // its doing 257 % 256 = 1
    }
}
