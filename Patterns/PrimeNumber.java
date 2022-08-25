// package BasicPrograming;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        int result = 0;
        int temp;

        while (i <= n - 1) {
            temp = n % i;
            if (temp == 0) {
                result = 1;
            }
            i++;
        }
        if (result != 0) {
            System.out.println("this number is not prime : False");
        } else {
            System.out.println("This number is Prime : True");
        }

    }
}
