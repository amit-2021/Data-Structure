/*
      1 
    2 3 
  4 5 6 
7 8 9 10 
*/

import java.util.*;

public class Pattern_23 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int i = 1;
            int numCount = 1;

            while (i <= n) {
                int j = 1;

                while (j <= n - i) {
                    System.out.print("  ");
                    j++;
                }

                j = 1;
                while (j <= i) {
                    System.out.print(numCount + " ");
                    j++;
                    numCount++;
                }
                System.out.println();
                i++;
            }
    
    }
}
