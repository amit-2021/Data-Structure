/*
1 1 1 1
  2 2 2
   3 3
     4
*/

import java.util.Scanner;

public class Program_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            while (j <= i - 1) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            int star = n - i + 1;
            while (j <= star) {
                System.out.print(i);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

/*
 **** **** **** ****
 ***** ***** ***** *****
 ****** ****** ****** ******
 ******* ******* ******* *******
 */
// import java.util.Scanner;

// public class Program_20 {
// public static void main(String[] args) {
// System.out.print("Enter a number : ");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int i = 1;

// while (i <= n) {
// int j = 1;
// while (j <= n) {
// int x = 1;
// int space = n - i + 1;
// while (x <= space) {
// System.out.print(" ");
// x++;
// }
// int k = 1;
// int star = n + i - 1;
// while (k <= star) {
// System.out.print("*");
// k++;
// }
// j++;
// }
// System.out.println();
// i++;
// }
// }
// }

/* new */
/*
 * Enter a number : 5
 *****
 ******
 *******
 ********
 *********
 */

// import java.util.Scanner;

// public class Program_20 {
// public static void main(String[] args) {
// System.out.print("Enter a number : ");
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int i = 1;

// while (i <= n) {
// int j = 1;
// while (j <= n) {
// int x = 1;
// int space = n - i + 1;
// while (x <= space) {
// System.out.print(" ");
// x++;
// }
// j++;
// }
// int k = 1;
// int star = n + i - 1;
// while (k <= star) {
// System.out.print("*");
// k++;
// }
// System.out.println();
// i++;
// }
// }
// }