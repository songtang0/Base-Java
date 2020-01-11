package qianfeng01;
/*
 * 打印数组
 */
import java.util.Arrays;

/*
 * 02. 数组的遍历
 */
public class TraverseArray02 {
    public static void main (String[] args) {
        // 1.普通的for循环
        int[] scores = {3, 5, 9, 12, 4, 0};

//        for (int i = 0; i < scores.length; i ++) {
//            System.out.println(scores[i]);
//        }

        // 2. foreach JDK1.5新增
//        for (int x:scores) {
//            System.out.println(x);
//        }
        // 3. Arrays.toString
        System.out.println(Arrays.toString(scores));
    }
}
