class BankAccount{
    // 属性
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String number, String holder, double initialBalance){
        accountNumber = number;
        accountHolder = holder;
        balance = initialBalance;
    }

    // 方法
    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        balance -= amount;
    }

    double getBalance(){
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        // 创建第一个实例
        BankAccount smgAccount = new BankAccount("100", "smg", 1000);

        // 第二个实例
        BankAccount bosonAccount = new BankAccount("10086", "WBoson", 10000);

        smgAccount.deposit(10000); // 11000
        smgAccount.withdraw(5000); // 6000

        bosonAccount.deposit(5000); // 15000
        bosonAccount.withdraw(10000); // 5000

        System.out.println("Boson's balance is " + bosonAccount.getBalance()); // 5000
        System.out.println("smg's balance is " + smgAccount.getBalance()); // 6000
    }
}