public class  BankAccount{

    private static int generatedAccountNumber = 100000;
    
    private String customerName;
    private int accountNumber;
    private double balance;


    public String getCustomerName() {
        return customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public BankAccount(String customerName, int accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount(String customerName, double balance) {
        this.customerName = customerName;
        this.accountNumber = generatedAccountNumber++;
        this.balance = balance;
        
    }

}
