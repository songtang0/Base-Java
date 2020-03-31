package qianfeng01.objectOriented.polymorphic_10;

public class TestPolymorphic_01 {
    public static void main(String[] args) {
        Animal a = new Dog(); // 将狗当成动物看
        System.out.println(a.breed + "\t" + a.age + "\t" + a.sex);
        a.eat();
        a.sleep();
    }
}

class Animal {
    String breed;
    int age;
    String sex;

    public void eat () {
        System.out.println("动物一版都会吃！");
    }
    public void sleep () {
        System.out.println("动物一般都会睡觉！");
    }
}

class Dog extends Animal {
    String furColor;

    public void run () {
        System.out.println("狗子在奔跑！");
    }
    public void eat () { // 方法重写、覆盖
        System.out.println("狗子的吃法与众不如！！！");
    }
}