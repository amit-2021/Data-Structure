package LeftAndRighShift;

import java.util.Scanner;

public class BinaryToDecimal {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int ans = 0;
    int i = 0;

    while (n != 0) {

        int digit = n % 10;
        if (digit == 1) {
            ans += Math.pow(2 , i);
        }
        n = n/10;
        i++;
    }
    System.out.println(ans);
}
}
