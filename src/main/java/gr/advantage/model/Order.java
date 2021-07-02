package gr.advantage.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Order {

    //fields
    private int idO;
    private ArrayList<String> products=new ArrayList<>();
    private int customerId;
    private int employeeId;
    private Date OrderDate;
    private int ShipmentNum;

    //constructors

    public Order(){
    }

    public Order(int idO, ArrayList<String> products, int customerId, int employeeId, Date orderDate, int shipmentNum) {
        this.idO = idO;
        this.products = products;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.OrderDate = orderDate;
        this.ShipmentNum = shipmentNum;
    }

    //methods


    public int getIdO() {
        return idO;
    }

    public void setIdO(int idO) {
        this.idO = idO;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<String> products) {
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    @Override
    public String toString() {
        return "Order{" +
                "idO=" + idO +
                ", products=" + products +
                ", customerId=" + customerId +
                ", employeeId=" + employeeId +
                ", OrderDate=" + OrderDate +
                ", ShipmentNum=" + ShipmentNum +
                '}';
    }

    public void addProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the name of the product you ordered: ");
        String productName;
        productName = scanner.nextLine();
        this.products.add(productName);
        System.out.println("Your products are " + this.products);
    }
}
