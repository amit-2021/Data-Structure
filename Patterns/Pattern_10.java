/*
A A A A 
B B B B 
C C C C 
D D D D 
 */
// package BasicPrograming;

import java.util.Scanner;

public class Pattern_10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int alphabet = 65;
        while (row <= n) {

            int col = 1;
            while (col <= n) {
                //(char)alphabet - is covert int to alphabet
                System.out.print((char) alphabet + " ");
                col++;
            }
            System.out.println();
            row++;
            alphabet++;
        }
    }
}
