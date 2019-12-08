package qianfeng01.arithmetic;

/** 直接插入排序算法
 * 从后向前找到合适的位置插入
 */
public class InsertSort03 {
    public static void main (String[] args) {
        int[] nums = {32, 9, 20, 12, 36, 4, 7, 33, 90, 27};
        for (int i = 1; i < nums.length; i++) { //控制轮数 一共length-1轮
            int temp = nums[i]; // 预定操作数, 一般从第二个开始，默认第一个是有序的
            int j = 0;
            for (j = i - 1; j >= 0; j--) { //即操作数前面的序列是有序的，要从有序序列的后面向前面遍历
                if (nums[j] > temp) { // 如果前一项比操作数大则交换位置
                    nums[j + 1] = nums[j];
                } else { // 否则跳出
                    break;
                }
            }
            if (nums[j + 1] != temp) { // 确保不是自身比较
                nums[j + 1] = temp;
            }
        }
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
