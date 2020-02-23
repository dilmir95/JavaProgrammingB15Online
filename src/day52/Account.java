package day52;

import day44.Train;

public class Account implements Transferable, Comparable<Account> {

    protected String name;
    private int balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public void transferAll(Account otherAccount) {
        otherAccount.balance += this.balance;

        this.balance = 0;

    }
    public boolean isPalindrome(){
        String temp = this.name;
        temp = name.toLowerCase().replace(" ","");

        String result="";
        for (int i = temp.length()-1; i >=0 ; i--) {
            result+= temp.charAt(i);
        }
        if(result.equalsIgnoreCase(temp)){
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Account o) {
        if(this.balance> o.balance){
            return 1;
        }else if(this.balance<o.balance){
            return -1;

        }else{
            return 0;
        }
    }
}
