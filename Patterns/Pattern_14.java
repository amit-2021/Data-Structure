/*
A 
B B 
C C C 
D D D D 
*/
// package BasicPrograming;

import java.util.*;

public class Pattern_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int alpha = 65;

        while (i <= n) {
            int j = 1;

            while (j <= i) {
//                int temp_value = alpha + j - 1;
                int temp_value = alpha + i - 1;
                System.out.print((char) temp_value + " ");
                j++;
            }
            System.out.println();
//            alpha++;
            i++;
        }
    }
}
