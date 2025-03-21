public class duplicatelength {
    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            int c =0;
            for (int j= 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    c = 1;
                    break;
                }
            }
            if (c==0) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println("New length of the array: " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
       
    }
}
