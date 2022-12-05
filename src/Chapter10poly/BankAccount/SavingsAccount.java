package Chapter10poly.BankAccount;

public class SavingsAccount implements BankAccount{
    private double rate = 0.01;
    private int acctNum;
    private int balance = 0;
    private boolean isForeign = false;

    public SavingsAccount(int acctNum){
        this.acctNum = acctNum;
    }

    @Override
    public int getAcctNum() {
        return acctNum;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public boolean isForeign() {
        return false;
    }

    @Override
    public void setForeign(boolean isForeign) {
        this.isForeign = isForeign;

    }

    @Override
    public void deposit(int amt) {
        balance += amt;

    }

    @Override
    public boolean hasEnoughCollateral(int loaNAmt) {
        return balance >= loaNAmt / 2;
    }

    @Override
    public String toString() {
        return String.format("Savings account %d balance= %d, is %s ",
                acctNum, balance, (isForeign? "foreign": "domestic"));
    }
    public void addInterest(){
        balance += (int) (balance * rate);
    }
}
