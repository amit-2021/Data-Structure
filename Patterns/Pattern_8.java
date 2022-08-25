/*
1
2 1
3 2 1
4 3 2 1
 */
// package BasicPrograming;

import java.util.Scanner;

public class Pattern_8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        while (i <= n) {
            int j = 1;
        
            while (j <= i) {
            
                System.out.print(i + j - 1 + " ");
                j++;
            }
            
            System.out.println();
            i++;

        }
    }
}
