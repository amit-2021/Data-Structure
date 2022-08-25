/*
A B C D 
B C D E 
C D E F 
D E F G 
*/
// package BasicPrograming;

import java.util.Scanner;

public class Pattern_13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int alphabet = 65;

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                int charValue = alphabet + i + j - 2;
                System.out.print((char)charValue + " ");

                j++;
            }
            System.out.println();
            i++;
        }

    }
}
