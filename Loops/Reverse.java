package Loops;

public class Reverse {
    public static void main(String[] args) {
        int num = 13245;
        int temp = num;
        int reverse = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        System.out.println("The reverse of the number " + num + " is " + reverse);
    }
    
}
