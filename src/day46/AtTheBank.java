package day46;

public class AtTheBank {


    public static void main(String[] args) {
        
        CheckingAccount acct1 = new CheckingAccount("dilmurod",231232324, 10000);
        
        acct1.deposit(100);
        System.out.println("acct1 = " + acct1);

        acct1.deposit(5000);
        System.out.println(acct1);
        acct1.withdraw(5300);
        System.out.println(acct1);
    }
}
