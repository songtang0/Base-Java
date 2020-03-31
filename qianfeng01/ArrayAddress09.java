package qianfeng01;

import java.util.Arrays;

public class ArrayAddress09 {
    static int size = 0; // 有效元素的个数，也可以代表下一个无效元素的插入位置（下标）
    static int[] nums = new int[5];
    public static void main(String[] args) {
        insert(0, 7);
        insert(1, 12);
        insert(2, 36);
        insert(3, 28);
        insert(4, 1);
        insert(5, 3);
        System.out.println(Arrays.toString(nums));
        insert(0, 10);
        System.out.println(Arrays.toString(nums));
        replace(0, 9);
        System.out.println(Arrays.toString(nums));
        remove(2);
        System.out.println(Arrays.toString(nums));
    }

    //向数组中插入一个新元素
    public static void insert (int position, int value) {
        if (position < 0 || position > size) {
            System.out.println("输入的位置数错误，请输入一个从0~" + size + "之间的数");
            return;
        }
        if (nums.length == size) {
            expend();
        }
        //将原数据依次向右移动
        for (int i = size; i > position; i --) {
            nums[i] = nums[i - 1];
        }
        //新值存入目标位置
        nums[position] = value;
        size ++;
    }

    // 扩容
    public static void expend() {
        int[] newArr = Arrays.copyOf(nums, nums.length * 2);
        nums = newArr; // 替换nums变量中的地址（称为替换引用）
    }
    //移除
    public static void remove(int position) {
        //循环移动元素,直接覆盖掉position位置的元素
        for (int i = position; i < size - 1; i ++) {
            nums[i] = nums[i + 1];
        }
        size --; // 移除一个元素，有效元素的个数应当减一
    }
    //替换
    public static void replace(int position, int value) {
        if (position < 0 || position > size) {
            System.out.println("输入的位置数错误，请输入一个从0~" + (size - 1) + "之间的数");
            return;
        }
        nums[position] = value;
    }
}
