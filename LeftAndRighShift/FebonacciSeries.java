package LeftAndRighShift;

import java.util.Scanner;

public class FebonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c;
        int i = 0;
        while (i <= n) {
            c = a + b;
            System.out.print(a + " ");
            a = b;
            b = c;
            i++;
        }
    }
}
