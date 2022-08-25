// package BasicPrograming;

import java.util.Scanner;

public class SumOfN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        
//        for(int i = 1; i <= n; i++) {
//            sum = sum + i;
//        }
        while (i < n){
            sum = i + sum;
            i++;
        }
        System.out.println(sum);
    }
}
