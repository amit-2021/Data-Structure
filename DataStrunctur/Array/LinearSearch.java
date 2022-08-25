package DataStrunctur.Array;

import java.util.Scanner;

public class LinearSearch {

    public boolean SearchKeyValue(int[] arr, int n, int searchKey) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == searchKey) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = s.nextInt();
        int[] arr = new int[5];

        System.out.println("Enter the array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the search key : ");
        int searchKey = s.nextInt(); 
        LinearSearch l = new LinearSearch();
        boolean found = l.SearchKeyValue(arr, n, searchKey);

        if (found == true) {
            System.out.println("Key found in list");
        }
        else {
            System.out.println("Key not found in list");
        }
    }
}
