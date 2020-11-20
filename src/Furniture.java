public abstract class Furniture {
    private String name;
    private float height, width;
    private int  price;

    public Furniture (String name, float height, float width, int price) {
        this.name=name;
        this.height=height;
        this.width=width;
        this.price=price;
    }

    public abstract String getType();

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public int getPrice() {
        return price;
    }
}