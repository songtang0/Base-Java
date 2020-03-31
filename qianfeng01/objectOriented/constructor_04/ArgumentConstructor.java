package qianfeng01.objectOriented.constructor_04;

// 有参构造函数
public class ArgumentConstructor {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("SongTang", 23, "男", 23690);
        System.out.println(t1.name + "\t" + t1.age + "\t" + t1.sex + "\t" + t1.salary);
    }
}
class Teacher {
    String name;
    int age;
    String sex;
    double salary;

    // 无参构造函数
    public Teacher() {
        System.out.println("无参构造函数！");
    }
    // 有参构造函数
    public Teacher(String n, int a, String s, double sal) {
        System.out.println("有参构造函数了啦！");
        name = n;
        age = a;
        sex = s;
        salary = sal;
    }
}