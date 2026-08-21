package week04.day02.Inventory;

public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;
    private static int counter=100;
    public Product(String name, double price, int stock){
        counter++;
        this.id=counter; // for unique id per product
        this.name=name;
        this.price=price;
        this.stock=stock;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
    }
    public void printInfo(){
        System.out.println(id + " - " + name + " - "+price +"€ - stock: "+stock);
    }



}
