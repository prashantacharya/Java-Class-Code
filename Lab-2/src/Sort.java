public class Sort {
    public static void main(String[] args) {
        int[] nums = {1,7,3,2,5,4};
        int n = nums.length;

        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++) {
                if (nums[j] > nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for (int num: nums) {
            System.out.println(num);
        }
    }
}
