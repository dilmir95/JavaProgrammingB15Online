package day40;

public class BankAccount {

    String acctType;
    String acctHolder;
    long acctNum;
    double balance;


    public double showAcctBalance(){
        return balance;

    }

    public void changeAllInfo(String newAcctType, String newAcctHolder, long newAcctNum, double newBalance){
       acctType=newAcctType;
        acctHolder=newAcctHolder;
        acctNum=newAcctNum;
         balance=newBalance;

    }


    public String toString() {
        return "BankAccount{" +
                "acctType='" + acctType + '\'' +
                ", acctHolder='" + acctHolder + '\'' +
                ", acctNum=" + acctNum +
                ", balance=" + balance +
                '}';
    }
    public void deposit (double amount){
        balance+= amount;
    }
    public void withdraw (double amount){
        balance-= amount;
    }
    public void quickCash100(){
        withdraw(100);
    }

}
