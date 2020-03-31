package qianfeng01.objectOriented.overLoad_03;
// 面向对象 重载
public class TestOverLoad {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.show("Hello");
        p.show(2.1);
        p.show('a');
        p.show("abc");
    }
}

// 打印机
class Printer {
    public void show(int content) {
        System.out.println(content);
    }
    public void show(double content) {
        System.out.println(content);
    }
    public void show(char content) {
        System.out.println(content);
    }
    public void show(String content) {
        System.out.println(content);
    }
}