class Search {
    public static int search(int a[], int target) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2; // Calculate mid in each iteration

            if (a[mid] < target) {
                start = mid + 1; // Move the start to the right
            } else if (a[mid] > target) {
                end = mid - 1; // Move the end to the left
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }
}

public class BinarySearch {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 6, 7, 8, 12};
        int target = 12;
        int result = Search.search(a, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
