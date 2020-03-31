package qianfeng01;

import java.util.Arrays;
/**
 * 数组扩容第三种方法（推荐，快速简介明了）
 */
public class ArrayExpand08 {
    public static void main(String[] args) {
        int[] sourceArr = new int[]{12, 3, 7, 5, 67, 21};
        // 创建比原数组更大的新数组、将原数组的元素，依次复制到新数组中
        int[] newArr = Arrays.copyOf(sourceArr, sourceArr.length * 2);
        System.out.println(Arrays.toString(newArr));
    }
}
