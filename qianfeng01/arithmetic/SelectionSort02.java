package qianfeng01.arithmetic;

public class SelectionSort02 {
    public static void main (String[] args) {
        int[] nums = {5, 1, 9, 8, 23, 17, 48, 91, 36, 57, 18};
        int minIdx = 0; // 用于记录每次比较的最小值下标
        // 外循环控制轮数
        for (int i = 0; i < nums.length - 1; i++) {
            minIdx = i; // 每一轮更新一次假设的最小值下标
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIdx] > nums[j]) { // 存在比假设的最小值还小的数
                    minIdx = j;
                }
            }
            // 判断需要交换的数的下标是否是自己本身
            if (minIdx != i) { // 若相等即意味着假设的最小值就是实际的最小值
                nums[minIdx] = nums[minIdx] + nums[i];
                nums[i] = nums[minIdx] - nums[i];
                nums[minIdx] = nums[minIdx] - nums[i];
            }
        }
        // 输出结果
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
