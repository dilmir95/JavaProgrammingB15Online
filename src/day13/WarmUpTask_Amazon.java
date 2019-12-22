package day13;

import javax.naming.NameAlreadyBoundException;

public class WarmUpTask_Amazon {

    public static void main(String[] args) {


        boolean primeMember = true;

        String memberType = "PRIME MEMBER";
        double amount = 29;
        int shippingFee = 0;

        if(memberType.equalsIgnoreCase("prime member")){
            shippingFee=0;
            System.out.println("your final price is "+ (amount+shippingFee));
        }else if(amount>25){
            shippingFee=0;
            System.out.println("your final price is "+ (amount+shippingFee));
        }else {
            shippingFee=5;
            System.out.println("your final price is "+ (amount+shippingFee));
        }
    }
}
