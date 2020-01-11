package qianfeng01.objectOriented;

public class Test01 {
    public static void main(String[] args) {
        Horse h = null; // 声明一个类的变量
        h = new Horse(); // 创建一个Horse类型的对象，实例对象
        h.name = "宋唐";
        h.age = 23;
        h.run();
        h.eat();

        new Horse().eat(); // 匿名对象，只能使用一次，用完后，该对象就会被释放
        h = null; // 释放对象
//        h.eat(); // 当对象不存在时，调用该对象的属性和方法将会报错，空指针
    }
}
class Horse {
    // 在类中定义属性(特征)
    String name;
    int age;
    public void run () {
        System.out.println("我是" + name + ",我" + age + "岁了，我日行五千里!");
    }
    public void eat() {
        System.out.println("我赛，我真的好强！");
    }
}