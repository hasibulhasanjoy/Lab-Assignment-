import java.util.ArrayList;
import java.util.Collections;

/**
 * Permutations
 */
public class Permutations {

    ArrayList<Integer> numbers = new ArrayList<Integer>();

    public Permutations() {

        for (int i = 0; i < 10; i++) {
            numbers.add(i + 1);
        }
    }

    public void makePermutations() {
        Collections.shuffle(numbers);
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}