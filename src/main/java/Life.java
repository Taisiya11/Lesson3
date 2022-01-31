/**
 * Класс реализации игры "Жизнь"
 */
public class Life {
    int[][] field;
    int sumNeighbours = 0;
    int sumOfGenerations = 1;
    boolean liveAnalysis;

    Life(int[][] field) {
        this.field = field;
    }

    /**
     * Метод, где мёртвая клетка("0") становится живой, если рядом с ней находятся ровно три живые("1") клетки;
     * Если живую клетку окружают три живые клетки, то эта клетка остаётся живой;
     * в противном случае клетка становится мёртвой.
     */
    public int[][] playLife() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                 sumNeighbours=0;
                if (field[i][j] == 0) {
                    if (((i - 1) >= 0) && ((j - 1) >= 0) && (field[i - 1][j - 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (((i + 1) < field[0].length) && ((j + 1) < field.length) && (field[i + 1][j + 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (((i + 1) < field[0].length) && (field[i + 1][j] == 1)) {
                        sumNeighbours++;
                    }
                    if (((j + 1) < field.length) && (field[i][j + 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (((i - 1) >= 0) && ((j + 1) < field.length) && (field[i - 1][j + 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (((i - 1) >= 0) && (field[i - 1][j] == 1)) {
                        sumNeighbours++;
                    }
                    if (((j - 1) >= 0) && (field[i][j - 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (((i + 1) < field[0].length) && ((j - 1) >= 0) && (field[i + 1][j - 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (sumNeighbours >= 3) {
                        field[i][j] = 1;
                    }
                } else {
                    if (((i - 1) >= 0) && ((j - 1) >= 0) && (field[i - 1][j - 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (((i + 1) < field[0].length) && ((j + 1) < field.length) && (field[i + 1][j + 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (((i + 1) < field[0].length) && (field[i + 1][j] == 1)) {
                        sumNeighbours++;
                    }
                    if (((j + 1) < field.length) && (field[i][j + 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (((i - 1) >= 0) && ((j + 1) < field.length) && (field[i - 1][j + 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (((i - 1) >= 0) && (field[i - 1][j] == 1)) {
                        sumNeighbours++;
                    }
                    if (((j - 1) >= 0) && (field[i][j - 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (((i + 1) < field[0].length) && ((j - 1) >= 0) && (field[i + 1][j - 1] == 1)) {
                        sumNeighbours++;
                    }
                    if (sumNeighbours < 3) {
                        field[i][j] = 0;
                    }
                    //  sumNeighbours++;
                }
            }
        }
        return field;
    }

    /**
     * Метод подсчета поколений
     * @return количество поколений
     */
    public int getSumOfGenerations() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == 1) {
                    sumOfGenerations++;
                    break;
                }
            }
            break;
        }
        return sumOfGenerations;
    }

    /**
     * Метод для анализа поля, на присутствие живых элементов
     */
    public boolean analyzesField() {
        liveAnalysis=false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == 1) {
                    liveAnalysis=true;
                    break;
                }
            }
        }
        return liveAnalysis;
    }


    /**
     * Метод вывода поля
     */
    public void displayField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}
