package qianfeng01.arithmetic;

/* 冒泡排序
 * 比较相邻的元素，如果第一个元素比第二个大，则交换它们两个的位置。
 * 对每一对相邻元素重复以上的步骤，即每一轮排序都会把本轮最大的元素放到最后。
 * 相同元素的前后顺序没有改变，所以冒泡排序是 稳定的
 */

public class BubbleSort01 {
    public static void main (String[] args) {
        int[] nums = {5, 1, 9, 8, 23, 17, 48, 91, 36, 57, 18};
        // 外循环控制轮数
        for (int i = 0; i < nums.length - 1; i++) { // 轮数 = 数组长度 - 1
            for (int j = 0; j < nums.length - i -1; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j] + nums[j + 1];
                    nums[j + 1] = nums[j] - nums[j + 1];
                    nums[j] = nums[j] - nums[j + 1];
                }
            }
        }
        // 输出
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
