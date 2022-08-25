/*
*****
 ****
  ***
   **
    *
*/
// package BasicPrograming;

import java.util.Scanner;

public class Pattern_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
                
        while (i <= n) {
            int j = 1;
            int space = i - 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            int star = n - i + 1;
            while (k <= star) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
                
//        while (i < n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print(" ");
//                j++;
//            }
//            int k = 1;
//            int star_ = n - i + 1 - 1;
//            while (k <= star_) {
//                System.out.print("*");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }
    }
}
