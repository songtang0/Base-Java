package qianfeng01;

import java.util.Random;
import java.util.Scanner;

public class GuessNum03 {
    public static void main (String[] args) {
        int[] nums = new int[5]; // 初始化一个数组
        int len = nums.length;
        Random r = new Random(); //创建一个可以生成随机数的工具
        for (int i = 0; i < len; i++) {
            nums[i] = r.nextInt(50);
        }
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        while(!flag) {
            System.out.println("请输入你要猜的数：（50以内）");
            int userNum = input.nextInt();
            if (userNum > 50) {
                System.out.println("对不起，您输入的数据大于50，请重新输入！");
            } else {
                for (int x:nums) {
                    if (userNum == x) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("恭喜你猜对了！");
                } else {
                    System.out.println("没猜对，噶油！");
                }
            }
        }
    }
}
