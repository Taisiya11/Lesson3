import java.util.Scanner;

/**
 * Конструктор мебели
 */

public class ConstructorFurniture {
    String name;
    String color;

    static String type;
    static String type1;

    ConstructorFurniture(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    /**
     * Вывод пользователю результат сбора мебели
     */

    public void create() {
        System.out.println("Выбранная вами мебель: " + color + "\t" + name + "\t" + TypeFurniture.compareTypes(type));
    }
}
