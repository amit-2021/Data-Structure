package DataStrunctur.BinarySearch;

public class BinarySearch {

    public int SearchIndex(int[] arr, int end, int key) {
        int start = 0;
        int mid = (start + end) / 2;
        while (start <= end) {
            // System.out.println(start);
            if (key == arr[mid]) {
                System.out.println(mid);
                return mid;
            }

            if (key > arr[mid]) {
                start = mid + 1;
            } else { // key < arr[mid]
                end = mid - 1;
            }

            mid = (start + end) / 2;
            System.out.println(mid);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        BinarySearch bs = new BinarySearch();
        int key = 9;
        int index = bs.SearchIndex(arr, arr.length - 1, key);
        System.out.println("Index of " + key + " is : " + index);
    }
}
