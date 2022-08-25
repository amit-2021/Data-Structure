package DataStrunctur.Array;

import java.util.Collections;
import java.util.ArrayList;
import java.util.*;

public class ReverseArray_Swap {

    public void ReverseArray(List<Integer> list, int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            Collections.swap(list, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // ArrayList<String> lettersList = new ArrayList<String>();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(list);
        int n = 9;

        ReverseArray_Swap r = new ReverseArray_Swap();
        r.ReverseArray(list, n);
        System.out.println("Reverse Array : " + list);
    }
}
