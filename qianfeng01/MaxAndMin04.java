package qianfeng01;

public class MaxAndMin04 {
    public static void main (String[] args) {
        int[] nums = {12, 39, 5, 0, 33, 67, 88, 41, 18};
        int max = max(nums);
        int min = min(nums);
        System.out.println("数组中的最大值是：" + max);
        System.out.println("数组中的最小值是：" + min);
    }
    // 求数列中的最大值
    public static int max (int[] num) {
        int max = num[0];
        int len = num.length;
        for (int i = 1; i < len; i++) {
            if (num[i] > max) {
                // 利用自身加减达到交换位置的效果
                num[i] = num[i] + max;
                max = num[i] - max;
                num[i] = num[i] - max;
            }
        }
        return max;
    }
    // 求数列中的最小值
    public static int min (int[] num) {
        int min = num[0];
        int len = num.length;
        for (int i = 1; i < len; i++) {
            if (num[i] < min) {
                num[i] = num[i] + min;
                min = num[i] - min;
                num[i] = num[i] - min;
            }
        }
        return min;
    }
}
