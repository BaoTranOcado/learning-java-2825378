package OOP_Training.Model;

public interface Product {
    String getType();
    String getSize();
    double getPrice();
    void setType(String type);
    void setPrice(double price);
    void setSize(String size);
}
