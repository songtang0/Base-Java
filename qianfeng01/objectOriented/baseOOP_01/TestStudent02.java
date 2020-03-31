package qianfeng01.objectOriented.baseOOP_01;

public class TestStudent02 {
    public static void main(String[] args) {
        Student SongTang = new Student();

        SongTang.name = "宋唐";
        SongTang.sex = "男";
        SongTang.age = 23;
        SongTang.score = 99.1;

        SongTang.study();
        SongTang.exam();
        SongTang.sleep(8);
    }
}
class Student {
    String name;
    String sex;
    int age;
    double score;

    public void study() {
        System.out.println(name + "在学习世界上最好的编程语言Java");
    }
    public void exam() {
        System.out.println((int)(Math.random() * 100));
    }
    public void sleep(int hour) {
        System.out.println("休息" + hour + "小时");
    }
}