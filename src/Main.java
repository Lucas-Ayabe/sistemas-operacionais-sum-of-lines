public class Main {

    public static void main(String[] args) {
        var index = 0;
        var numbers = new RandomIntArray(3, 5);

        for (var line : numbers.asArray()) {
            var sumOfLine = new SumOfLineThread(line, index);
            sumOfLine.start();
            index++;
        }
    }
}
