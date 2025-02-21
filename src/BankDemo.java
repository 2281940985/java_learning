public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount c1 = new CheckingAccount(200183);
        System.out.println("存钱500");
        c1.deposit(500);
        try{
            System.out.println("取钱400");
            c1.withDraw(400);
            System.out.println("取钱400");
            c1.withDraw2(400);
        }catch (InsufficientFundsException e){
            System.out.println("你还缺少￥" + e.getAmount());
            e.printStackTrace();
        }


    }
}
