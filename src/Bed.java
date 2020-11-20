public class Bed extends Furniture {
    public Bed(String name, float height, float width, int price) {
        super(name, height, width, price);
    }

    @Override
    public String getType() {
        return "Bed";
    }
}
