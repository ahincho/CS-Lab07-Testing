public class Rectangle {
    // Attributes
    private int height;
    private int width;
    // Empty Constructor
    public Rectangle() {
        this.height = 0;
        this.width = 0;
    }
    // All Args Constructor
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    // Getters
    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }
    // Get Rectangle Area
    public int getArea() {
        return this.height * this.width;
    }
    // Setters
    public void setHeight(int height) {
        this.height = height * 2;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    // ToString Method
    @Override
    public String toString() {
        return "Rectangle: [height = " + this.height + ", width = " + this.width + ", area = " + getArea() + "]";
    }
}
