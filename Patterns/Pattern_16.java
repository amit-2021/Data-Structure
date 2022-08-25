/*
D 
C D 
B C D 
A B C D 
*/
// package BasicPrograming;

import java.util.*;

public class Pattern_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            int temp = 65 + n - i;

            while (j <= i) {
                System.out.print((char) temp + " ");
                j++;
                temp++;
            }
            System.out.println();
            i++;
        }
    }
}
