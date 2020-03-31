package qianfeng01.objectOriented.constructor_04;

public class TestConstructor_01 {
    public static void main(String[] args) {

    }
}

class Student {
    String name; // 默认值
    int age = 20; // 初始值
    String sex;
    double score;

    // 无参构造方法
    public Student () {
        //逻辑第1行（对属性进行初始化）
        //逻辑第2行（执行构造方法中的代码
        System.out.println("Student()" + age);
    }//逻辑第3行（回到构造方法的调用位置）
}