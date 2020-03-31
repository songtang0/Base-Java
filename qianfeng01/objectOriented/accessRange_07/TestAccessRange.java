package qianfeng01.objectOriented.accessRange_07;

public class TestAccessRange {
    public static void main(String[] args) {
        Father f = new Father();
        f.welcome(); //公开的方法，任何位置都可以访问
        System.out.println(f.field); // AccessRange与Father在同包中，允许访问

        Son son = new Son();
        son.testMethod();
    }
}
