import java.util.Random;

public class RandomIntArray {

    private Random generator;
    private int[][] array;

    public RandomIntArray(int rows, int columns) {
        this.generator = new Random();
        this.array = new int[rows][columns];
        populate();
    }

    public void printLines() {
        for (var row : array) {
            var line = new StringBuilder("Linha: ");

            for (var column : row) {
                line.append(column).append(", ");
            }

            System.out.println(line.toString());
        }
    }

    public RandomIntArray populate() {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = generator.nextInt(100);
            }
        }

        return this;
    }

    public int[][] asArray() {
        return array;
    }
}
