package LeftAndRighShift;

import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.print("Enter a number for print binary : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        int answer = 0;

        while (n != 0) {

            int bit = n & 1;
            // Double temp = (Math.pow(10, i));
            // answer = (bit * temp.intValue()) + answer;
            answer += bit * Math.pow(10, i);
            n = n >> 1;
            i++;

        }
        System.out.println(answer);
    }
}
