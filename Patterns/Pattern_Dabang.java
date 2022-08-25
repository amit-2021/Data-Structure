/*
1 2 3 4 5 5 6 7 8 9 
1 2 3 4 * * 4 5 6 7
1 2 3 * * * * 3 4 5
1 2 * * * * * * 2 3
1 * * * * * * * * 1
*/
import java.util.Scanner;

public class Pattern_Dabang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {

            int j = 1;
            int temp = n - i + 1;
            while (j <= temp) {
                System.out.print(j + " ");
                j++;
            }

            j = 1;
            temp = i - 1;
            while (j <= temp * 2) {
                System.out.print("* ");
                j++;
            }

            j = 1;
            temp = n - i + 1;
            while (j <= n - i + 1) {
                System.out.print(temp + " ");
                temp++;
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
