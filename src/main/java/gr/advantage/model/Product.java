package gr.advantage.model;


import java.util.PrimitiveIterator;

public class Product {
    //fields
    private String name;
    private double price;
    private String description;
    private Color color;
    private int size;
    private String material;

    //constructors

    public Product() {

    }

    public Product(String name, double price, String description, Color color, int size, String material) {
        this.name = name; //'this' => this name refers to the product
        this.price = price;
        this.description = description;
        this.color = color;
        this.size = size;
        this.material = material;
    }
    //methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", color=" + color +
                ", size=" + size +
                ", material='" + material + '\'' +
                '}';
    }

    /**
     * Business rule 5.67
     * R 4.31
     * 2021-07-01
     * @author Nefeli Evangelou
     */

    public void updatePrice(double priceLimitA, double priceLimitB, double priceInc1, double priceInc2, double priceInc3){
        if(price<priceLimitA)
            price += priceInc1;
        else if(price<priceLimitB)
            price +=priceInc2;
        else
            price +=priceInc3;
    }

    /**
     * R4.32
     */
    public void updateDescription(){
        if(size<=5)
            description += "Size=SMALL";
        else if (size <=10)
            description += "Size=MEDIUM";
        else
            description += "Size=LARGE";
    }
    /**
     * R4.33
     */

    public void updatePriceByColor(){
        switch(color){
            case BLACK:
                break;
            case RED:
                price +=10;
                break;
            case WHITE:
                price +=5;
                break;
            case PURPLE:
                price -= 1;
                break;
        }


    }

}
