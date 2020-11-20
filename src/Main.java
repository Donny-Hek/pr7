import java.util.ArrayList;
import java.util.Scanner;

class Person {
    ArrayList<Furniture> basket =new ArrayList<Furniture>();
    void totalBasket() {
        int totalPrice=0;
        System.out.println("У вас в корзине:");
        for (int i=0;i< basket.size();i++) {
            System.out.println(basket.get(i).getName()+" "+basket.get(i).getPrice());
            totalPrice+=basket.get(i).getPrice();
        }
        System.out.println("Итого: "+totalPrice);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        FurnitureShop furnitureShop=new FurnitureShop();
        Person person=new Person();
        int a=0,b=0;
        while(a!=4) {
            System.out.println("Что вы хотите купить?\n1-Кровать\n2-Стол\n3-Доску\n4-Завершить покупки");
            a= scanner.nextInt();
            if (a!=4) {
                System.out.println("Сколько предметов вы хотите купить? (сами предметы выбираются рандомно)");
                b = scanner.nextInt();
                furnitureShop.addBasket(person, a, b); //добавляю в корзину персон а-вид элемента b-количесво
            }
        }
        person.totalBasket();
    }
}
