

import java.util.Scanner;

public class FindAllEvenNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evenNumber = 0;
        int i = 1;
        
        System.out.println("Start Program : ");
        while (i <= n){
            evenNumber = i%2;
            if(evenNumber == 0) {
                System.out.print(i +",");
            }
            i++;
        }
    }
}
 