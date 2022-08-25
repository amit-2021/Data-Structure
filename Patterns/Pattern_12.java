/*
A B C D 
E F G H 
I J K L 
M N O P 
*/
// package BasicPrograming;

import java.util.Scanner;

public class Pattern_12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int alphabet = 65;

        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print((char)alphabet + " ");
                col++;
                alphabet++;
            }
            System.out.println();
            row++;
        }

    }

}
