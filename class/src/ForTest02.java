public class ForTest02 {//编写for循环找出1-10000以内的所有素数,每8个换一行（能被1和自身整除，不能被其它整除，也叫质数）
    public static void main(String[] args){//方法一 利用了break跳出循环，只要找到i%j == 0的值循环就会跳出，速度较快
        boolean flag01 = false;
        long start01 = System.currentTimeMillis();
        for(int i=2;i<=10000;i++){//1不是素数
            for(int j=2;j<i;j++){
                if(i%j == 0){
                    flag01 = true;
                    break;
                }
            }
            if(flag01==false){
                System.out.println(i);
            }
            flag01 = false;
        }
        long end01 = System.currentTimeMillis();
        System.out.println("耗时："+(end01-start01));
    }
}
