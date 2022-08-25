package DataStrunctur.Array;

public class SwapAlternate {

    public void SwapArray(int[] arr, int size) {
        for (int i = 0; i < size; i += 2) {
            if (i + 1 < size) {
                int start = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = start;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        SwapAlternate obj = new SwapAlternate();

        obj.SwapArray(arr, arr.length - 1);

        System.out.print("Swap array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
