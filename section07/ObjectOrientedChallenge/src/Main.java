public class Main {
    public static void main(String[] args) {
//        Account account = new Account(123453345,  1000.0,"bob brown","bob@brown.com",12345);
        Account account = new Account();
//        account.setBalance(333.45);
//        account.setPhoneNumber(12345);
        account.deposit(200);
        account.withdraw(500);
        System.out.println(account.getBalance());

        Account timsAccount = new Account("Tim Time","tim@email.com",222222);
        System.out.println("aacount no: " +timsAccount.getAccountNumber()+
                ", name: " + timsAccount.getCustomerName());
    }
}