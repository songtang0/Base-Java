package qianfeng01.objectOriented.appOOP_02;

public class TestStudentObj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jack";
        s1.age = 19;
        s1.score = 99.1;

        Student s2 = new Student();
        s2.name =  "Rouse";
        s2.score = 98D;

        Student s3 = new Student();
        s3.name = "微微";
        s3.score = 97D;

        Student s4 = new Student();
        s4.name = "孙悟空";
        s4.score = 92.3;

        s1.introduce();
        s2.introduce();
        s3.introduce();
        s4.introduce();

        Teacher t1 = new Teacher();
        t1.name = "庄周";
        t1.age = 23;
        t1.sex = "男";
        t1.salary = 23000.0;

//        double result = t1.calcScore(s1.score, s2.score, s3.score, s4.score);
//        System.out.println(result);
        String[] names = new String[] {s1.name, s2.name, s3.name, s4.name};
        double[] scores = new double[] {s1.score, s2.score, s3.score, s4.score};
        double res = t1.calcMaxScore(names, scores);
        System.out.println(res);
    }
}

class Student {
    String name;
    int age;
    String sex;
    double score;

    public void introduce () {
        System.out.println("你好，我是:" +  name + "今年:" + age + "岁了，性别：" + sex + "分数：" + score);
    }
}

class Teacher {
    String name;
    int age;
    String sex;
    double salary;

    // 计算学生总分数 ... 变量 传入可变长参数
    public double calcScore (double... scores) {
        System.out.println("calcScore(double... scores)");
        double sum = 0D; // 数字后面跟上D，意为这个数字是double类型会自动进行类型转换
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    // 计算学生分数最高的那个
    public double calcMaxScore (String[] names, double... scores) {
        System.out.println("calcMaxScore(double... scores)");
        double sum = 0D;
        double max = scores[0];
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
                index = i;
            }
        }
        System.out.println("最高分的同学是" + names[index]);
        return sum;
    }
}