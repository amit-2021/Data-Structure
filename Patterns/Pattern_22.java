import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;

        while (i <= n) {

                int k = 1;

                while (k <= i - 1) {
                    System.out.print(" ");
                    k++;
                }

                k = 1;
                int temp = i;
                
                while (k <= n - i + 1) {
                    System.out.print(temp);
                    k++;
                    temp++;
                }
            i++;
            System.out.println();
        }
    }
}
