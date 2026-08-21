package week04.day02.Inventory;

import java.util.HashMap;
import java.util.Iterator;

public class Inventory {
    private HashMap<Integer, Product> products;

    public Inventory(){
        this.products= new HashMap<>();
    }
    //uniqueness of productID is secured by the Product constructor
    public boolean addProduct(Product product) {
        if (product != null) {
            products.put(product.getId(), product);
            return true;
        } else return false;
    }
    public Product findProduct(int id){
            return products.get(id);
    }
    // id is unique so it will only delete one product
    public boolean removeProduct(int id){
        return products.remove(id) != null;
    }
    public void printAllProducts(){
        for(Product product:products.values()){
            product.printInfo();
        }
    }
    public int getProductCount(){
        return products.size();
    }
    public Product findMostExpensiveProduct(){
        Product mostExpensiveProduct=null;
        for(Product product:products.values()){
            if (mostExpensiveProduct==null || mostExpensiveProduct.getPrice()<product.getPrice()){
                mostExpensiveProduct=product;
            }
        }
        return mostExpensiveProduct;
    }
    public double calculateTotalInventoryValue(){
        double totalInventoryValue=0;
        for (Product product:products.values()){
            totalInventoryValue+=product.getPrice()*product.getStock();
        }
        return totalInventoryValue;
    }

}
