public class ForTest01 {//9*9乘法表
    public static void main(String[] args){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"=" + i*j+" ");//输出当前的一行
            }
            System.out.print("\n");//换行9次
        }
    }
}
