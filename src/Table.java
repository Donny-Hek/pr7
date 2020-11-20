public class Table extends Furniture {
    public Table(String name, float height, float width, int price) {
        super(name, height, width, price);
    }

    @Override
    public String getType() {
        return "Table";
    }
}
