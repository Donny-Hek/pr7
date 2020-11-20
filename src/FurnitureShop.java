import java.util.ArrayList;
import java.util.Random;

public class FurnitureShop {
    private ArrayList<Bed> beds=new ArrayList<Bed>();
    private ArrayList<Board> boards=new ArrayList<Board>();
    private ArrayList<Table> tables=new ArrayList<Table>();

    FurnitureShop(){
        for (int i=0;i<=10;i++) {
            Bed bed = new Bed("bed_"+Integer.toString(i+1),new Random().nextInt(2000),new Random().nextInt(2000),new Random().nextInt(10000));
            Board board=new Board("board_"+Integer.toString(i+1),new Random().nextInt(2000),new Random().nextInt(2000),new Random().nextInt(10000));
            Table table=new Table("table_"+Integer.toString(i+1),new Random().nextInt(2000),new Random().nextInt(2000),new Random().nextInt(10000));
            beds.add(bed);
            boards.add(board);
            tables.add(table);
        }
    }
    void addBasket(Person pers, int a, int b) {
        for (int i=0;i<b;i++) {
            switch (a) {
                case 1:
                    pers.basket.add(beds.get(new Random().nextInt(10)));
                    break;
                case 2:
                    pers.basket.add(tables.get(new Random().nextInt(10)));
                    break;
                case 3:
                    pers.basket.add(boards.get(new Random().nextInt(10)));
                    break;
            }
        }
    }
}
