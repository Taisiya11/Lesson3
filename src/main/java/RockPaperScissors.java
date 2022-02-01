import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Класс реализации игры камень/ножницы/бумага с компьютером
 */

public class RockPaperScissors {
    String rock = "камень";
    String paper = "бумага";
    String scissors = "ножницы";

    RockPaperScissors() {
    }

    /**
     * Метод создания списка возможных ходов
     *
     * @return список ходов
     */
    public ArrayList generatesListOfMoves() {
        ArrayList<String> moveOptions = new ArrayList<>();
        moveOptions.add(rock);
        moveOptions.add(paper);
        moveOptions.add(scissors);
        return moveOptions;
    }

    /**
     * Метод, рандомно выбирающий ход компьютера
     */
    public String chooseRandomValue() {
        Random random = new Random();
        String randomValue = (String) generatesListOfMoves().get(random.nextInt(generatesListOfMoves().size()));
        return randomValue;
    }

    /**
     * Метод ввода хода пользователя с клавиатуры
     *
     * @return ход пользователя
     */
    public String enteringValueFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите камень,ножницы или бумага:");
        String name = scanner.nextLine();
        return name;
    }

    public void playGame() {
        String userMove = enteringValueFromKeyboard();
        String computerMove = chooseRandomValue();
        if (userMove.equals(computerMove)) {
            System.out.println("Ход компьютера: " + computerMove);
            System.out.println("Ничья");
        }
        if (userMove.equals("камень") && (computerMove.equals("ножницы"))) {
            System.out.println("Ход компьютера: " + computerMove);
            System.out.println("Вы выиграли!");
        }
        if (userMove.equals("ножницы") && (computerMove.equals("камень"))) {
            System.out.println("Ход компьютера: " + computerMove);
            System.out.println("Вы проиграли =(");
        }
        if (userMove.equals("камень") && (computerMove.equals("бумага"))) {
            System.out.println("Ход компьютера: " + computerMove);
            System.out.println("Вы проиграли =(");
        }
        if (userMove.equals("бумага") && (computerMove.equals("ножницы"))) {
            System.out.println("Ход компьютера: " + computerMove);
            System.out.println("Вы проиграли =(");
        }
        if (userMove.equals("ножницы") && (computerMove.equals("бумага"))) {
            System.out.println("Ход компьютера: " + computerMove);
            System.out.println("Вы выиграли!");
        }
    }
}

