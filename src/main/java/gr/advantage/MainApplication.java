package gr.advantage;

import gr.advantage.model.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class MainApplication {

    private static final String NAME = "dress";
    private static final Color COLOR = Color.RED;
    private static final int SIZE = 25;
    private static final double PRICE = 25;
    private static final String DESCRIPTION = "very nice";
    private static final String MATERIAL = "cotton";

    private static final int ID = 1;
    private static final String EM_NAME = "Stephani";
    private static final String EM_SURNAME = "Andreou";
    private static final String ADDRESS = "Achileos 3";
    private static final String EMAIL = "stephani@gmail.com";
    private static final String DEPARTMENT = "Support";
    private static final double TELEPHONE = 98923409833d;
    private static final boolean MANAGER = true;

    private static final int IDC = 2;
    private static final String CU_NAME = "Androniki";
    private static final String CU_SURNAME = "Andronikou";
    private static final String CU_EMAIL = "androniki@gmail.com";
    private static final double CU_TELEPHONE = 78985566432d;
    private static final String CU_ADDRESS = "Sinifou 2";

    private static final int IDO = 0;
    private static  ArrayList<String> PRODUCTS = new ArrayList<>();
    private static final int CUSTOMERID = 2;
    private static final int EMPLOYEEID = 1;
    private static final Date ORDERDATE = new Date();
    private static final int SHIPMENTNUM = 342514;

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please provide your name: ");
//        String name;
//        name = scanner.nextLine();
//        System.out.println("Your name is " + name);
//
//
//        //Primitive types
//        boolean myValue = true; //always takes 1 byte
//        char aChar = 's'; //takes 2 bytes
//        char anotherChar = 33;
//        short shortN = 13000; // up to 32767
//        int num = -2147483648;
//        long longNum = 12323232323L;
//        byte ab = 127;
//        float number = 3.4F;
//        float floatScient = 1.345f - 12;
//        double highPre = 12.67;
//        double high = 1.345e-12; //e = exponential
//        double oneBill = 1e9;
//
//        //class types
//        //wrapper class for each primitive
//        Boolean bool = myValue;
//        Double doub = oneBill;
//
//        //explicit casting
//        shortN = (short) num;

        Product product = new Product(NAME, PRICE, DESCRIPTION, COLOR, SIZE, MATERIAL);
        System.out.println("product = " + product);


        Product menProduct = new Product();
        menProduct.setName(NAME);
        System.out.println("product = " + menProduct);

        product.updatePrice(5,10,1,2,3);
        System.out.println("product = " + product);


        Employee employee = new Employee(ID,EM_NAME, EM_SURNAME, ADDRESS, EMAIL, DEPARTMENT, TELEPHONE, MANAGER);
        System.out.println("employee = " + employee);
        //employee.updateEmail();
        //System.out.println("employee = " + employee);

        Customer customer = new Customer(IDC, CU_NAME, CU_SURNAME,CU_ADDRESS, CU_EMAIL, CU_TELEPHONE);
        System.out.println("customer = " + customer);
        //customer.updateTelephone();
        //System.out.println("customer = " + customer);

        Order order = new Order(IDO, PRODUCTS, CUSTOMERID, EMPLOYEEID, ORDERDATE, SHIPMENTNUM);
        System.out.println("Order =" + order);
        order.addProduct();
        System.out.println("order =" + order);
    }

}
