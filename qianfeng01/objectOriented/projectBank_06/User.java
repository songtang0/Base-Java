package qianfeng01.objectOriented.projectBank_06;

// 类的组成：私有属性、公共访问方法、无参构造方法

public class User {
    private String cardNo; // 卡号
    private String identity; // 身份证号
    private String username; // 用户名
    private String password; // 密码
    private String phoneNo; // 手机号
    private double balance; // 余额

    // 无参构造方法
    public User () {}

    // 有参构造方法
    public User (String cardNo, String identity, String username, String password, String phoneNo, double balance) {
        this.cardNo = cardNo;
        this.identity = identity;
        this.username = username;
        this.password = password;
        this.phoneNo = phoneNo;
        this.balance = balance;
    }

    public void setCardNo (String cardNo) {
        this.cardNo = cardNo;
    }
    public String getCardNo () {
        return this.cardNo;
    }

    public void setIdentity (String identity) {
        this.identity = identity;
    }
    public String getIdentity () {
        return this.identity;
    }

    public void setUsername (String username) {
        this.username = username;
    }
    public String getUsername () {
        return this.username;
    }

    public void setPassword (String password) {
        this.password = password;
    }
    public String getPassword () {
        return this.password;
    }

    public void setPhoneNo (String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getPhoneNo () {
        return this.phoneNo;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }
    public double getBalance () {
        return this.balance;
    }
}
