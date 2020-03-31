package qianfeng01;

import java.util.Arrays;

public class ArrayExpand07 {
    public static void main(String[] args) {
        int[] sourceArr = new int[]{12, 3, 7, 5, 67, 21};
        int[] newArr = new int[sourceArr.length * 2];
        // 将原数组的元素，依次复制到新数组中
        System.arraycopy(sourceArr, 0, newArr, 0, sourceArr.length);
        System.out.println(Arrays.toString(newArr));
    }
}
