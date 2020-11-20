public class Board extends Furniture {
    public Board(String name, float height, float width, int price) {
        super(name, height, width, price);
    }

    @Override
    public String getType() {
        return "Board";
    }
}
