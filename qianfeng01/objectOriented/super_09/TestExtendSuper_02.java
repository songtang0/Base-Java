package qianfeng01.objectOriented.super_09;

public class TestExtendSuper_02 {
    public static void main(String[] args) {
        Ming m = new Ming();

        System.out.println(m.mField);
        System.out.println(m.tField);
    }
}

class Tang {
    //2.初始化属性
    int tField = 3;

    public Tang () {
        super(); // 1.调用父类的无参构造方法（暂不关注）
        System.out.println("唐" + tField); //3.执行构造方法的代码
    }
}

class Song extends Tang {
    // 2.初始化属性
    int sField = 5;

    public Song () {
        super(); // 1.调用父类的无参构造方法
        System.out.println("宋" + sField); //3.执行构造方法的代码
    }
}

class Ming extends Song {
    // 2.初始化属性
    int mField = 9;

    public Ming () {
        super(); // 1.调用父类的无参构造方法
        System.out.println("明" + mField); //3.执行构造方法的代码
    }
}