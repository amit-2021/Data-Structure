
// package BasicPrograming;

import java.util.Scanner;


public class Pattern_18 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int x = n;
        while (i <= n) {
            int j = 1;
//            int x = n - i + 1;
            while (j <= x) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            x--;
        }
    }
}
