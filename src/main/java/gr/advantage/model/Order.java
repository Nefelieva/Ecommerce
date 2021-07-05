package gr.advantage.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Order {

    //fields
    private int idO;
    private final ArrayList<Product> products = new ArrayList<>();
    private Customer customer;
    private int employeeId;
    private Date OrderDate;
    private int ShipmentNum;

    //constructors

    public Order() {

    }

//    public Order(int idO, ArrayList<Product> products, Customer customer, int employeeId, Date orderDate, int shipmentNum) {
//        this.idO = idO;
//        this.customer = customer;
//        this.employeeId = employeeId;
//        this.OrderDate = orderDate;
//        this.ShipmentNum = shipmentNum;
//    }

    //methods


    public int getIdO() {
        return idO;
    }

    public void setIdO(int idO) {
        this.idO = idO;
    }

//    public ArrayList<Product> getProducts() {
//        return products;
//    }

    //public void setProducts(ArrayList<Product> products) {
    //this.products = products;
    //}

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        OrderDate = orderDate;
    }

    public int getShipmentNum() {
        return ShipmentNum;
    }

    public void setShipmentNum(int shipmentNum) {
        ShipmentNum = shipmentNum;
    }


    //CRUD interface for list

//    public void addProduct(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please provide the name of the product you ordered: ");
//        Product productName;
//        //productName = scanner.nextLine();
//        this.products.add(productName);
//        System.out.println("The products you ordered are " + products);
//    }
    public void create(Product product) {
        products.add(product);
    }

    public Product read(int index) {
        return products.get(index);
    }

    //price  changes of a Product
    public void update(int index, double newPrice) {
        products.get(index).setPrice(newPrice);
    }

    public void delete(int index) {
        products.remove(index);
    }

    //print the order and calculate the final price
    @Override
    public String toString() {
        return "Order{" +
                "idO=" + idO +
                ", products=" + products +
                ", customer=" + customer +
                ", employeeId=" + employeeId +
                ", OrderDate=" + OrderDate +
                ", ShipmentNum=" + ShipmentNum +
                '}';
    }

    //Total price calculation
    public double calculateTotal(){
        double calculation = 0.0;
        //first method for for iterator
//        for (int i = 0; i < products.size(); i++){
//            calculation += products.get(i).getPrice();
//
//        }
        //'Functional' -> second method for for iterator
//        calculation = products.stream().map(product -> product.getPrice()).reduce( (value1, value2) -> value1+value2).get();

        //third method for for iterator
        for (Product product:products){
            calculation+=product.getPrice();
        }

        return calculation;
    }
    public int countProducts(){
        return products.size();
    }
}
