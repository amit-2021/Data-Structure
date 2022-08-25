package DataStrunctur.Array;

public class FindIndex {

    public void SumOfIndex(int[] arr, int traget) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                int sum = arr[i] + arr[j];
                if (sum == traget) {
                    System.out.println("index = " + i + " and index =" + j + " Sum = " + traget);
                    return;
                }
            }
        }
    }

    public void PrintArray(int[] arr) {
        System.out.print("Array : [ ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(" ]");
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 9, 4, 8 };
        int traget = 14;
        FindIndex obj = new FindIndex();
        obj.PrintArray(arr);
        obj.SumOfIndex(arr, traget);
    }
}