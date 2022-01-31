import java.util.Scanner;

public class RockPaperScissors {
    String rock="камень";
    String paper="бумага";
    String scissors="ножницы";
    String computerMove;
    RockPaperScissors(String rock,String paper,String scissors){
        this.rock=rock;
        this.paper=paper;
        this.scissors=scissors;
    }
    public void games() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название выбранной мебели:");
        String name = scanner.nextLine();
        if (name=="камеень"){
            computerMove=name;
        }
    }
}
