package day52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BankTest {

    public static void main(String[] args) {


        Account a1 = new Account("Bob",10000);
        Account a2 = new Account("Anna", 8000);
        Account a3 = new Account("Shox", 50000);
        System.out.println(a1.getBalance());
        System.out.println(a2);

        a1.transferAll(a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.transferAll(a1);

        System.out.println(a2.isPalindrome());
        List<Account> list1 = new ArrayList<>(Arrays.asList(a1,a2,a3));
        Collections.sort(list1);
        System.out.println(list1);

        Account myAccount = new Account("Dilmurod",0);

            for(Account each: list1){
                each.transferAll(myAccount);
            }

        System.out.println(myAccount);
        System.out.println(list1);

    }


}
