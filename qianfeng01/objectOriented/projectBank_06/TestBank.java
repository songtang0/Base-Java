package qianfeng01.objectOriented.projectBank_06;

public class TestBank {
    public static void main (String[] args) {
        Bank bank = new Bank();
//        bank.users = null;
        bank.showAllUser();
        bank.welcomeMenu();
        bank.showAllUser();
    }
}
