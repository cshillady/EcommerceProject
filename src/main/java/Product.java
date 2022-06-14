public class Product {
    // Data Methods
    private String name;
    private double price;
    private String category;
    private int quantity;
    private char size;
    private String author;
    private String color;

    // Constructors
    public Product (String name, double price, String category, int quantity, char size, String color) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.size = size;
        this.color = color;
    }
    public Product(String name, double price, String category, int quantity, String author) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.author = author;
    }
    public Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    // Methods
    public boolean buy() {
        var retVal = false;
        if (quantity > 0) {
            quantity--;
            retVal = true;
        } else {
            retVal = false;
        } return retVal;
    }

    // Accessors
    // I would normally only include the getters and setters that are used, but the assignment said to add them all.
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
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public char getSize() {
        return size;
    }
    public void setSize(char size) {
        this.size = size;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    // Overrides
    @Override
    public String toString() {
        var retVal = "";
        retVal = name + "\n$" + price + "\n" + category + "\n" + quantity + "\n" + size + "\n" + author + "\n" + color;
        return retVal;
    }
}