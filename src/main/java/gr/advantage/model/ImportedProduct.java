package gr.advantage.model;

public class ImportedProduct extends Product{
    private String country;

    //constructors - A characteristic of Polymorphism is to have 2 constructors.
    public ImportedProduct() {

    }

    public ImportedProduct(String name, double price, String description, Color color, int size, String material, String country) {
        super(name, price, description, color, size, material);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() + "ImportedProduct{" +
                "country='" + country + '\'' +
                '}';
    }
}
