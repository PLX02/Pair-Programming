public class CurrentAccount extends BankAccount {
  
  private double overdraftLimit;
  
  public CurrentAccount(String customerName, double balance, double overdraftLimit) {
    super(customerName, balance);
    this.overdraftLimit = overdraftLimit;
  }

  public double getOverdraftLimit(){
    return overdraftLimit;
  }

  public void setOverdraftLimit(double overdraftLimit) {
    this.overdraftLimit = oveerdraftLimit;
  }

  @Override
  public boolean withdraw(double amount){
    if((balance - amount) >= -overdraftLimit){
      balance -= amount;
      return true;
    }
    return false;
  }
  
    
