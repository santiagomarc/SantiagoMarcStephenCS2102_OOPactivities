class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = size; 
    }

    public String toString() {
        String size_descriptor;
        switch (size) {
            case 'S':
                size_descriptor = "small";
                break;
            case 'M':
                size_descriptor = "medium";
                break;
            case 'L':
                size_descriptor = "large";
                break;
            default:
                size_descriptor = "";
        }
        return String.format("Car (%s) - P%.2f - %s", color, price, size_descriptor);
    }

    public static void main(String[] args) {
    }
}
