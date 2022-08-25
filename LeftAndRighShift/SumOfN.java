package LeftAndRighShift;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        System.out.print(result);
    }
}
