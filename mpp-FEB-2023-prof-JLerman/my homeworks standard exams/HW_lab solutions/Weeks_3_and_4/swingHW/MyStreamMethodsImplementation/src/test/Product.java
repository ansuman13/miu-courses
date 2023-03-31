package test;

public class Product {

    public String getProductId() {
        return productId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    private String productId;
    private String description;
    private String manufacturer;
    private double price;

    public Product(String productId, String description, String manufacturer, double price) {
        this.productId = productId;
        this.description = description;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public void setDescription(String s){
        this.description = s;
    }
    public String getDescription() {
        return this.description;
    }

    public String toString(){
        return "ProductId: "+this.productId +" ,Description: " +this.description + " ,Manufacturer: " + this.manufacturer;
    }

}
