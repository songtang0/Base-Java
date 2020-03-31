package qianfeng01.objectOriented.baseOOP_01;

public class TestDogObject01 {
    public static void main (String[] args) {
        //数据类型 变量名 = 值; 其中值为一个对象的实例的地址
        Dog erHa = new Dog();
        erHa.breed = "哈士奇";
        erHa.age = 3;
        erHa.sex = "公";
        erHa.furColor = "white";
        System.out.println(erHa + "\t" + erHa.breed + "\t" + erHa.age + "\t" + erHa.sex + "\t" + erHa.furColor);
    }
}
class Dog {
    String breed; // 类别
    int age; // 年龄
    String sex; // 性别
    String furColor; // 毛色
}