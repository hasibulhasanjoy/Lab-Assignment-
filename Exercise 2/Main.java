/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        var sum = new Sum();
        System.out.println(sum.sumWithoutSmallest());
        System.out.println(sum.sumWithoutSmallest() - sum.numbers[0]);
    }
}