public class Product {
    String type;
    int price;
    public Product(String type,int price){
        this.type=type;
        this.price = price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
}
