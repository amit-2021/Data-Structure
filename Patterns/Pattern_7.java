/*
1 
2 3 
3 4 5 
4 5 6 7 
 */
// package BasicPrograming;

import java.util.Scanner;

public class Pattern_7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            int count = i;

            while (j <= i) {
                System.out.print(count + " ");
                count++;
                j++;

            }
            System.out.println();
            i++;
        }
    }
}
