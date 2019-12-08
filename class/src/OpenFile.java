public class OpenFile {
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("请输入您的年龄：");
        int age = s.nextInt();
        String str = "您处于生命周期的老年阶段";
        if(age < 0 || age > 150){
            str = "您输入的年龄不合法，需要在0-150之间";
        }else if(age < 5){
            str = "您处于生命周期的幼儿阶段";
        }else if(age < 10){
            str ="您处于生命周期的少年阶段";
        }else if(age < 18){
            str = "您处于生命周期的青少年阶段";
        }else if(age < 35){
            str = "您处于生命周期的青年阶段";
        }else if(age < 55){
            str = "您处于生命周期的中年阶段";
        }
        System.out.println(str);
    }
}

