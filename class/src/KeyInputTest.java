public class KeyInputTest {
    public static void main(String[] args){
        //第一步，创建键盘扫描器对象
        java.util.Scanner s = new java.util.Scanner(System.in);
        //第二步，调用Scanner对象的next方法开始接收用户键盘输入，当程序执行到这里的时候会停下来，等待用户的输入。
        //键入的信息会自动赋值给userInputContent,程序执行到这里，用户输入的信息已经到内存中了。
        String userInputContent = s.next();
        System.out.println("您输入了： " + userInputContent);
    }
}
