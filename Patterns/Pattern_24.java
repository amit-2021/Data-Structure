/*
   1
  121
 12321
1234321
*/
import java.util.*;

public class Pattern_24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            // 1st triangle
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            // 2nd triangle
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            // 3rd triangle\
            j = 1;
            int temp = i - 1;
            while (j <= i - 1) {
                System.out.print(temp);
                j++;
                temp--;
            }

            System.out.println();
            i++;
        }
    }
}
