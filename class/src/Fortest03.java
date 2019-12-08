public class Fortest03 {//结论，采用开平方根的方法更快
    public static void main(String[] args){
        boolean flag = false;
        long startTime = System.currentTimeMillis();
        int count = 0;
        for(int i=2;i<=10000;i++){
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j == 0){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                count++;
                System.out.print(i + " ");
                if(count % 8 == 0){
                    System.out.println();
                }
            }
            flag = false;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("耗时："+(endTime-startTime));
    }
}
