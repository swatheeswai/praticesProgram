import java.util.Arrays;

public class targetZero {
    public static void main(String args[]) {
        int a[] = {1, 0, -1, 0, -2, 2};
        int target = 0;
        fourSum(a, target);
    }
    
    static void fourSum(int arr[], int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                int left = j + 1;
                int right = arr.length - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        System.out.println("Four elements whose sum is equal to " + target + " are " + arr[i] + ", " + arr[j] + ", " + arr[left] + ", " + arr[right]);
                        while (left < right && arr[left] == arr[left + 1]) {
                            left++;
                        }
                        while (left < right && arr[right] == arr[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
    }
}
