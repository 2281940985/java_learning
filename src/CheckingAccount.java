public class CheckingAccount {
    private double balance;
    private int number;
    public CheckingAccount(int number) {
        this.number = number;
    }
    //存钱
    public void deposit(double amount) {
        balance += amount;
    }
    //取钱
    public void withDraw(double amount) throws InsufficientFundsException {
        if(amount <= balance) {
            balance -= amount;
        }
        else {
            double needed = amount - balance;
            System.out.println("Insufficient balance");
            throw new InsufficientFundsException(needed);
        }
    }
    public void withDraw2(double amount) {
        if(amount <= balance) {
            balance -= amount;
        }
        else {
            double needed = amount - balance;
            System.out.println("Insufficient balance");
            try {
                throw new InsufficientFundsException(needed);
            } catch (InsufficientFundsException e) {
                System.out.println(e.getAmount());
                throw new RuntimeException(e);
            }
        }
    }
    //返回余额
    public double getBalance() {
        return balance;
    }
    //返回卡号
    public int getNumber() {
        return number;
    }
}
