public class Checking implements Bank
{
    public void deposit(int amt)
    {
    
        balance=+amt;
    }
   
    public double withdraw(int amt)
    {
        balance=balance-amt;
        return balance;
    }
    public double getBalance()
    {
        return(balance);
    }
 private double balance=0.0;
 private double amount=0.0;
}