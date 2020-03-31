package qianfeng01.objectOriented.overRide_08;

// 重写
public class TestOverRide {
   public static void main(String[] args) {
       Animal animal = new Animal();
       animal.sleep();

       System.out.println("~_~-------------------~_~");

       Dog dog = new Dog();
       dog.eat();
       dog.swim();

       System.out.println("~_~-------------------~_~");

       Cat cat = new Cat();
       cat.eat();
       cat.climb();

       System.out.println("~_~-------------------~_~");

       Tiger tiger = new Tiger();
       tiger.eat();
       tiger.fightWolf();
   }
}

class Animal {
    String breed;
    int age;
    String sex;

    private void eat () { // 私有，本类可见
        System.out.println("动物会吃，好傻~_~");
    }
    public void sleep () {
        this.eat();
        System.out.println("动物会睡，好棒~_~");
    }
}

class Dog extends Animal {
    String furColor;

    public void eat () {
        System.out.println("狗子的吃法与众不同嘛！");
    }
    public void swim () {
        System.out.println("狗子会游泳...");
    }
}

class Cat extends Animal {
    String furColor;

    public void eat () {
        System.out.println("小猫会吃鱼，吃相和狗子不太一样！");
    }
    public void climb () {
        System.out.println("小猫会爬树，厉害吧！");
    }
}

class Tiger extends Animal {
    String position;
    public void eat () {
        System.out.println("老虎会自己捕食猎物！");
    }
    public void fightWolf () {
        System.out.println("老虎能打败狼！");
    }
}