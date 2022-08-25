/*
A B C D 
A B C D 
A B C D 
A B C D 
*/
// package BasicPrograming;
import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        
        while (row <= n) {
            
            int col =1;
            int alphabet = 65;
            
            while (col <= n) {
                System.out.print((char)alphabet + " ");
                alphabet++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
    
}
