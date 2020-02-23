package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {

   private List<Product> list1;

    public Store() {
        this.list1 = new ArrayList<>();
    }

    public Store(List<Product> x){
        this();
        this.list1 = x;

    }
    public void addProduct(Product x){
        list1.add(x);
    }
    public void removeProduct(Product x){
        if(checkIfProductExist(x))
        list1.remove(x);
        else System.out.println("Invalid product entered to remove");
    }
    public boolean checkIfProductExist(Product p){

        return list1.contains(p);
    }

    @Override
    public String toString() {
        return "Store{" +
                "list1=" + list1 +
                '}';
    }
    public void addProduct(String productName, double productPrice){
        Product newP = new Product(productName,productPrice);
        list1.add(newP);
    }

    public int getProductCount(){
        return list1.size();
        }

        public void displayProducts(){
        for(Product each: list1){
            System.out.println("Product name: "+each.getName()+" Product Price: "+each.getPrice());
        }
        }

        public int indexOfProduct(Product x){
        return list1.indexOf(x);
        }
        public Product getMostExpensiveProduct(){
        int index = 0;
        double maxPrice = list1.get(0).getPrice();


            for (int i = 0; i <list1.size() ; i++) {
               if(list1.get(i).getPrice()>maxPrice) {
                   maxPrice = list1.get(i).getPrice();
                   index = i;
               }
            }
            return list1.get(index);
        }
    }

