package Conditionals;

import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check the case");
        char c = sc.next().charAt(0);
        int ch = (int) (c);
        if (ch >= 65 && ch <= 90) {
            System.out.println("The character is in the Upper case");
        }
        if (ch >= 97 && ch <= 122) {
            System.out.println("The character is in the Lower case");
        }
    }
    
}
