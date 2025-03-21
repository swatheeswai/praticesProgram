import java.util.Arrays;

public class multiple {
    public static void main(String[] args) {
        int[] nums = {0,1,5,2,7,8,2,5,6,7};
        Arrays.sort(nums);
        //System.out.print(nums);
        int product1 = nums[0] * nums[1] * nums[nums.length - 1];
        int product2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        if (product1 > product2) {
           System.out.println(product1);
        } else {
            System.out.println(product2);
        }
    }
}
