package DataStrunctur.Array;

import java.util.*;

public class SumOfArray {

    public int SumOfArr(int[] arr, int n) {
        int sumArray = 0;
        for (int i = 0; i < n; i++) {
            sumArray += arr[i]; 
        }
            return sumArray;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[4];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        SumOfArray sa = new SumOfArray(); 
        System.out.println("Sum of array : " + sa.SumOfArr(arr, n));

    }
}
