package DataStrunctur.Array;

import java.util.Scanner;

public class Min_Max {

    public int GetMin(int[] arr, int n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int GetMax(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // By using pre-Defined
    public int GetMaxByPreDefined(int[] arr, int n) {
        int maxVlue = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            maxVlue = Math.max(maxVlue, arr[i]);
        }
        return maxVlue;
    }

    public int GetMinByPreDefined(int[] arr, int n) {
        int minVlue = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            minVlue = Math.min(minVlue, arr[i]);
        }
        return minVlue;
    }

    public static void main(String[] args) {
        System.out.print("Enter a size of array : ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println();
        int[] arr = new int[100];
        System.out.print("enter array list : ");
        for (int i = 0; i <= n; i++) {
            arr[i] = s.nextInt();
        }
        Min_Max m = new Min_Max();
        System.out.println("Max value : " + m.GetMax(arr, n));
        System.out.println("Min value : " + m.GetMin(arr, n));
        System.out.println("Max By default method : " + m.GetMaxByPreDefined(arr, n));
        System.out.println("Min by default method : " + m.GetMinByPreDefined(arr, n));
    }
}
