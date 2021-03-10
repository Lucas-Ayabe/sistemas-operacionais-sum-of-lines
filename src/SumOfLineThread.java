public class SumOfLineThread extends Thread {

    private int[] line;
    private int index;

    public SumOfLineThread(int[] line, int index) {
        this.line = line;
        this.index = index;
    }

    @Override
    public void run() {
        System.out.println("Linha " + index + ": " + sum());
    }

    public int sum() {
        int sum = 0;

        for (int number : line) {
            sum += number;
        }

        return sum;
    }
}
