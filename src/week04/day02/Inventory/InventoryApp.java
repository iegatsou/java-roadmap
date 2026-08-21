package week04.day02.Inventory;

public class InventoryApp {
    static void main() {
        Inventory products=new Inventory();
        Product p1=new Product("Keyboard",50,90);
        Product p2=new Product("Mouse",20,120);
        Product p3=new Product("Monitor",200,50);
        products.addProduct(p1);
        products.addProduct(p2);
        products.addProduct(p3);


        products.printAllProducts();
        System.out.println(products.getProductCount()+" products in HashMap");
        Product p1Found=products.findProduct(101);
        if (p1Found!=null)
            p1Found.printInfo();
        else System.out.println("No such product!");
        Product p2Found=products.findProduct(105);
        if (p2Found!=null)
            p2Found.printInfo();
        else System.out.println("No such product!");
        products.removeProduct(102);
        products.printAllProducts();


    }
}
