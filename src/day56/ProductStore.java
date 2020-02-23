package day56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductStore {

    public static void main(String[] args) {

        Product p1 = new Product("iphone", 999);
        Product p2 = new Product("iphone", 1500);
        Product p3 = new Product("book", 15);
        Product p4 = new Product("cup", 5);
        Product p5 = new Product("laptop", 2400);
        Product p6 = new Product("monitor", 30009);

        List<Product> list = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p4, p5, p6));

        Store s1 = new Store(list);
        s1.addProduct("ball",44.6);
        System.out.println(s1);
        boolean b=s1.checkIfProductExist(new Product("ball",44.6));
        System.out.println(b);
        System.out.println(s1.getProductCount());

        s1.removeProduct(new Product("asasa",21));
        s1.displayProducts();

        System.out.println(s1.getMostExpensiveProduct());

    }
}