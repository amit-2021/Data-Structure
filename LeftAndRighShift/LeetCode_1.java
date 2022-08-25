package LeftAndRighShift;

import java.util.Scanner;

public class LeetCode_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // int i = 1;
        int product = 1;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            product = product * rem;
            sum = sum + rem;
            n = n / 10;
        }
        int result = product - sum;
        System.out.print(result);
    }
}
