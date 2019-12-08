package com.songtang.chuxia.forever;

public class User {
    private int age;
    public void setAge(int a){
        if(a<0 || a>150){
            System.out.println("不合法输入！");
            return;
        }
        age = a;
    }
    public int getAge(){
        return age;
    }
}
