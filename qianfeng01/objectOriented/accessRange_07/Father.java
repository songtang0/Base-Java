package qianfeng01.objectOriented.accessRange_07;

// 访问修饰符
public class Father {
//    private String field; // 私有，本类可见
//    String field; // 默认同包可见
    protected String field = "2"; // 受保护的 同包 + 非同包的子类 可见

    public void welcome () {
        System.out.println("一切都会好起来的呢！");
    }
}
