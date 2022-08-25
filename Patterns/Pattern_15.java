// package BasicPrograming;

import java.util.Scanner;

public class Pattern_15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int alpha = 65;

        while (i <= n) {
            int j = 1;
            while (j <= i) {
//                int temp_value = alpha + j - 1;
                int temp_value = alpha + i + j - 2;
                System.out.print((char) temp_value + " ");
                j++;
            }
            System.out.println();
            i++;
//            alpha++;
        }
    }
}
