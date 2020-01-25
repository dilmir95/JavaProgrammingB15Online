package day46;

public class SavingAccount extends BankAccount{


    double interestRate;

    public SavingAccount(String accountHolder,long accountNum,double balance,double interestRate ){
        super(accountHolder,accountNum,balance);
        this.interestRate = interestRate;

    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {

        SavingAccount s1 = new SavingAccount("Dilmurod",122423223,50000,0.042);
        System.out.println(s1);

        s1.withdraw(10000);
        System.out.println(s1);
        s1.deposit(10030);
        System.out.println(s1);
    }
    @Override
    public void withdraw(int amount){
        super.withdraw(amount+30);

    }
    @Override
    public void deposit(int amount){
        super.deposit((int) (amount+(amount*interestRate)));


    }

}
