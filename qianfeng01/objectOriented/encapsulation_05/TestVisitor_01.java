package qianfeng01.objectOriented.encapsulation_05;

public class TestVisitor_01 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "尤金";
        stu.setAge(2000);
        stu.setSex("男女");
        stu.score = 99D;
        System.out.println(stu.getSex());
        System.out.println(stu.getAge());
    }
}
class Student {
    String name;
    private int age; // 私有属性，本类可见
    private String sex;
    double score;

    public void setAge (int age) {
        if (age > 0 && age <= 253) {
            this.age = age;
        } else {
            // 本应该抛出异常，但是目前还没学，暂时重置
            this.age = 18;
        }
    }
    public int getAge () {
        return this.age;
    }
    public void setSex (String sex) {
        if ("男".equals(sex) || "女".equals(sex)) {
            this.sex = sex;
        } else {
            this.sex = "男";
        }
    }
    public String getSex () {
        return this.sex;
    }
}