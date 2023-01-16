
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Creates an account named "Matthews account" with the balance 1000
        // Creates an account named "My account" with the balance 0
        // Withdraws 100.0 from Matthew's account
        // Deposits 100.0 to "my account"
        // Prints both the accounts
        Account matthew = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        matthew.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(matthew);
        System.out.println(myAccount);
    }
}
