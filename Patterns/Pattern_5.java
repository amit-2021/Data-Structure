/*
1 2 3 
4 5 6 
7 8 9 
*/
// package BasicPrograming;

import java.util.Scanner;

public class Pattern_5 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int count = 1;
        
        while (i<=n) {
            int j = 1;
            while (j<=n) {
                System.out.print(count + " ");
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
