package Loops;

import java.util.*;
public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("Enter the number for which you want to find the occurence");
        int target = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp != 0) {
            int digit = temp % 10;
            if (digit == target) {
                count++;
            }
            temp = temp / 10;
        }
        System.out.println("The number " + target + " in the number " + num + " is " + count);
    }
}
