
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{28, -41, -55, -63, 1, 0, -15, -52, -68, 32, - 66, 13, 40, 16, 34, -55, 46, -13, 48, 17, -63, 4, -60, -32, -21, 18, -15, -58, 2, 46};
        {
            int min = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min)
                    min = nums[i];
            }
            System.out.println("Minimal:" + min);
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max)
                max = nums[i];
        }
        System.out.println("Maximal:" + max);
    }
}