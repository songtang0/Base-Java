package com.songtang.chuxia.forever;

public class UserTest {
    public static void main(String[] args){
        //创建User对象
        User user = new User();
        user.setAge(-10);//修改
        System.out.println(user.getAge());//读取
    }
}
