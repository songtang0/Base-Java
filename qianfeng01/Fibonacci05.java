package qianfeng01;

public class Fibonacci05 {
    public static void main(String[] args) {
        int res = fibonacci(10);
        System.out.println(res);
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n - 2);
    }
}
