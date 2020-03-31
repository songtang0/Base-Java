package qianfeng01;

public class Array2D10 {
    public static void main(String[] args) {
        // 高维，低维
        int[][] nums = new int[][] {{1, 2, 3}, {5, 10, 7, -7}, {21, 18, -2}, {32, 15, 11, 21, 27}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
