package qianfeng01.objectOriented.super_09;

public class TestSuper_01 {
    public static void main(String[] args) {
        Han han = new Han(2,5);
        System.out.println(han.value);

        Qin qin = new Qin(3);
        System.out.println(qin.value);
    }
}

class Qin {
    int value;

    public Qin () {
        System.out.println("大秦万年！");
    }

    public Qin (int value) {
        this.value = value;
    }
}

class Han extends Qin {
    public Han () {
        super(); // 默认就有的，写不写一样
    }
    public Han (int value) {
//        this();
        super();
    }
    public Han (int a, int b) {
        this(1); // 默认
    }
}