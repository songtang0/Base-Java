package qianfeng01.objectOriented.projectBank_06;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    Scanner input = new Scanner(System.in); // 实例变量（实例方法共享）

    // 保存已经注册的用户数据
    private User[] users = new User[5]; // 创建一个User类型的地址组成的数组

    int size = 3; // 有效元素的个数

    //构造方法组成 的 初始方法（如果存在一些程序起始时必须要执行的代码，则写入初始化方法）
    public Bank () {
        User user = new User();
        user.setCardNo("6212261719227993869");
        user.setIdentity("240929199808046323");
        user.setUsername("宋唐");
        user.setPassword("654321");
        user.setPhoneNo("17310953731");
        user.setBalance(23000.0);
        users[0] = user;

        users[1] = new User("6212261719227993868", "24092919980804613", "梦婕", "654321", "17310952856", 19000.0);
        users[2] = new User("6212261719227993867", "24092919980804633", "汉秦", "654321", "17310959874", 18000.0);
    }

    // 首页-欢迎页
    public void welcomeMenu () {
        System.out.println("------------------------------------------------------");
        System.out.println("1.登录 2.注册");
        System.out.println("------------------------------------------------------");
        System.out.println("请输入您选择的操作代号：");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                this.login();
                break;
            case 2:
                this.register();
                break;
            default:
                System.out.println("您输入的数字有误，请重新输入!");
        }
    }

    // 登录验证
    public void login () {
        System.out.println("请输入卡号：");
        String cardNo = input.next();
        System.out.println("请输入密码：");
        String pwd = input.next();

        User u = check(cardNo, pwd);
        if (u != null) {
            this.showMenu(u);
        } else {
            System.out.println("用户名或密码错误");
        }
    }

    // 注册
    public void register () {
        System.out.println("请输入姓名：");
        String username = input.next();

        String idNo;
        boolean matches;
        do {
            System.out.println("请输入身份证号:");
            idNo = input.next();
            String regularExpression = "(^[1-9]\\d{5}(18|19|20)\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$)|" +
                    "(^[1-9]\\d{5}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$)";
            matches = idNo.matches(regularExpression);
            if (!matches) {
                System.out.println("您输入的身份证号码格式不正确，请重新输入！");
            }
        } while (idNo.length() != 18 || !matches);

        System.out.println("请输入电话号码：");
        String phoneNo = input.next();

        System.out.println("请输入密码：");
        String pwd = input.next();

        System.out.println("请输入预存金额：");
        double balance = input.nextDouble();

        // 根据用户输入的信息 + 随机卡号 完成对象的封装
        String newCardNo = this.getRandomCardNo();
        User user = new User(newCardNo, idNo, username, pwd, phoneNo, balance);
        //将该对象存储到users数组中 if(){}//扩容判断
        users[size] = user;
        size ++;
        System.out.println("注册成功，您的卡号为：" + newCardNo);
        this.showAllUser();
        this.welcomeMenu();
    }

    //获得随机卡号
    public String getRandomCardNo () {
        String prefix = "6212260406";
        Random random = new Random();
        // 生成一个随机的int值，该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n。
        int r = random.nextInt(900000000); // 8999 999 + 1000 000 = 9999 999
        return prefix + (r + 100000000); // 6548 529
    }

    // 验证卡号和密码是否正确 单一只能原则，User类型为引用数据类型只能存储 地址
    public User check (String no, String pwd) {
        for (int i = 0; i < size; i ++) {
            if (no.equals(users[i].getCardNo()) && pwd.equals(users[i].getPassword())) {
                // 标识查找到改用户，存在
                return users[i]; // 则返回一个User对象 的 地址
            }
        }
        return null; // 返回一个空的地址
    }

    // 显示菜单
    public void showMenu (User u) {
        int choice;
        do {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("1.修改预留手机号码  2.存款  3.取款  4.转账  5.查询余额  6.修改密码  7.注销  0.退出");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("请输入操作码：");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("修改预留手机号码");
                    break;
                case 2:
                    System.out.println("执行存款");
                    break;
                case 3:
                    this.withdrawal(u);
                    break;
                case 4:
                    System.out.println("执行转账");
                    break;
                case 5:
                    System.out.println("执行查询余额");
                    break;
                case 6:
                    System.out.println("执行修改密码");
                    break;
                case 7:
                    this.cancel(u);
                case 0:
                    return;
                default:
                    System.out.println("输入有误，请重新输入!");
                    break;
            }
        } while (true);
    }

    // 取款
    public void withdrawal (User mine) {
        System.out.print("请输入取款金额:");
        double money = input.nextDouble();
        if (money <= mine.getBalance()) {
            // 可以取款
            mine.setBalance(mine.getBalance() - money);
            System.out.println("取款成功，当前余额为：" + mine.getBalance());
        } else {
            System.out.println("余额不足");
        }
    }

    // 注销
    public void cancel (User user) {
        int index = size + 1;

        //查找该用户所在的数组下标
        for (int i = 0; i < size; i++) {
            if (users[i] == user) {
                index = i;
                break;
            }
        }

        //移动该元素之后的每个元素
        for (int i = index; i < size -1; i ++) {
            users[i] = users[i + 1];
        }
        size --;
    }

    // 显示所有银行账户
    public void showAllUser () {
        for (int i = 0; i < size; i ++) {
            System.out.println(users[i].getUsername());
        }
    }
}
