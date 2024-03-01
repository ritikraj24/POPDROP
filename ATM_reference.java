import java.util.Scanner;
class bankAccount{
    private double balance;
    public bankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println(amount+"deposited successfully");
    }
    public boolean withdraw(double amount){
        if (amount<= balance){
            balance -= amount;
            System.out.println(amount+"withdraw successfully");
            return true;
        }
        else {
            System.out.println("insufficient balance");
            return false;
        }
    }
}
class  ATM{
    private bankAccount Bankaccount;
    private Scanner sc;
    public ATM(bankAccount Bankaccount){
        this.Bankaccount = Bankaccount;
         this.sc= new Scanner(System.in);
    }
    public void displayMenu(){
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void processOption(int opt){
        switch (opt){
            case 1: checkBalance();
            break;
            case 2: deposit();
            break;
            case 3: withdraw();
            break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                System.exit(0);
            default:
                System.out.println("Invalid OPtion. Please try again");
        }
    }
    private void checkBalance(){
        System.out.println("Current balance "+ Bankaccount.getBalance());
    }
    private void deposit(){
        System.out.println("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        Bankaccount.deposit(amount);
    }
    private void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        if (Bankaccount.withdraw(amount)){
            System.out.println("Please take your cash.");
        }
    }
}
public class ATM_reference {
    public static void main(String[] args) {
        bankAccount UserAccount = new bankAccount(0);
        ATM atm = new ATM(UserAccount);
        while (true){
            atm.displayMenu();
            System.out.println("Enter option: ");
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
            atm.processOption(opt);
        }
    }
}
