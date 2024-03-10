package OOP_Training;

import com.google.gson.GsonBuilder;

public class Flower {
    private String category;
    private double price;
    private String instructions;
    private String photo;
    private String name;
    private int productId;

    public Flower(String category, double price, String instructions, String photo, String name, int productId) {
        this.category = category;
        this.price = price;
        this.instructions = instructions;
        this.photo = photo;
        this.name = name;
        this.productId = productId;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flower{");
        sb.append("category='").append(category).append('\'');
        sb.append(", price=").append(price);
        sb.append(", instructions='").append(instructions).append('\'');
        sb.append(", photo='").append(photo).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", productId=").append(productId);
        sb.append('}');
        return sb.toString();
    }
    public String toJsonString() {
        return new GsonBuilder().disableHtmlEscaping().create().toJson(this);
    }
}
