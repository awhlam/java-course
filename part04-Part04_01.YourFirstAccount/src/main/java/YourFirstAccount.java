
public class YourFirstAccount {

    public static void main(String[] args) {
        // Write a program that creates an account with a balance of 100.0,
        // deposits 20.0 in it, and finally prints the balance.
        
        Account account = new Account("Andrew", 100.0);
        account.deposit(20.0);
        System.out.println(account.toString());
    }
}
