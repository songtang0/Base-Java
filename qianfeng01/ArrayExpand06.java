package qianfeng01;

import java.util.Arrays;

public class ArrayExpand06 {
    public static void main(String[] args) {
        //原数组
        int[] sourceArr = new int[]{12, 3, 7, 5, 67, 21};

        // 1.创建比原数组更大的新数组
        int[] newArr = new int[sourceArr.length * 2];
        // 2.将原数组的元素，依次复制到新数组中
        for (int i = 0; i < sourceArr.length; i ++) {
            newArr[i] = sourceArr[i];
        }
        // 遍历
        System.out.println(Arrays.toString(newArr));
    }
}
