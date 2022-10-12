import java.util.Arrays;

/**
 * Sum
 */
public class Sum {
    int[] numbers = { 4, 5, 3, 2, 1, 9, 7, 6, 10, 8 };

    public int sumWithoutSmallest() {
        int sum = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length; i = i + 1) {
            sum = sum + numbers[i];
        }
        return sum;
    }
}