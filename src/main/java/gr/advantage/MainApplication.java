package gr.advantage;

import gr.advantage.model.Color;
import gr.advantage.model.Product;

import java.util.Scanner;

public class MainApplication {

    private static final String NAME = "dress";
    private static final Color COLOR = Color.RED;
    private static final int SIZE = 25;
    private static final double PRICE = 25;
    private static final String DESCRIPTION = "very nice";
    private static final String MATERIAL = "cotton";

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
    }
}
