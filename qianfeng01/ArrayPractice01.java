package qianfeng01;

import java.util.Arrays;

public class ArrayPractice01 {
    public static void main(String[] args) {
        //  第一种
        int[] nums1 = new int[5];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i + 1;
        }
        // 第二种
        int[] nums2; // 先声明
        nums2 = new int[5];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = i + 1;
        }
        // 第三种
        int[] nums3 = new int[]{1, 2, 3};
        // 第四种
        int[] nums4 = {6, 7, 9, 5, 0};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
    }
}
