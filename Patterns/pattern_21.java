/*
      1
    2 2
  3 3 3
4 4 4 4
   */

import java.util.*;
public class pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            int space = n - i;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while (k <= i) {
                System.out.print(i);
                k++;
            }
            System.out.println();
            i++;
        }


    }
}
