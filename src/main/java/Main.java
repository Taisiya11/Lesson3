import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название выбранной мебели:");
        String name = scanner.nextLine();
        System.out.println("Введите желаемый цвет мебели:");
        String color = scanner.nextLine();
        System.out.println("Выберите из представленного списка тип мебели: стул, шкаф, кровать, стол");
        String typeCustomer = scanner.nextLine();
        ConstructorFurniture constructorFurniture = new ConstructorFurniture(name, color, typeCustomer);
        constructorFurniture.create();


/**
 * Игра "Жизнь"
 * Начальное расположение клеток. "0" - мертвая клетка, "1" - живая
 */
        int[][] field = {{0, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        Life life = new Life(field);
        do {
            life.playLife();
            life.getSumOfGenerations();
        }
        while (life.analyzesField()==true);
        System.out.println("Количество поколений: "+ life.getSumOfGenerations());
        life.displayField();


        /**
         * Игра камень/ножницы/бумага
         */


    }
}
