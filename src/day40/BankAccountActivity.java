package day40;

public class BankAccountActivity {
    public static void main(String[] args) {


        BankAccount b1 = new BankAccount();

        b1.balance = 1000;
        b1.acctHolder= "Dilmurod";
        b1.acctNum = 12134213452l;
        b1.acctType = "Checking";


        b1.showAcctBalance();
        b1.deposit(2000);

        b1.withdraw(500);

        System.out.println(b1);

        b1.changeAllInfo("Saving","Dilmurod Yakubov",23443442l, 5000);

        System.out.println(b1);
    }


}
