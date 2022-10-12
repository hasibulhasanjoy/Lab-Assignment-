
public class Ex1 {
    int[] numbers;
    int start = Constants.START;
    int last = Constants.LAST;
    public void createArray(int n){
         numbers = new int[n];
        for (int i = start; i < Constants.LENGTH; i++) {
            double rand = Math.random() * Constants.TEN;
            int number = (int) rand;
              numbers[i] = number;
        }
    }
    public void printEvenIndex() {
        for (int i = start; i < Constants.LENGTH; i++) {
            if (i % Constants.TWO == Constants.ZERO) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
    public void printEvenElements() {
        for (int i = start; i < Constants.LENGTH; i++) {
            if (numbers[i] % Constants.TWO == Constants.ZERO) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
    public void printReverse(){
        for (int i = last; i >= start; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public void printFirstAndLast() {
        System.out.println(numbers[start] + " " + numbers[last]);
    }
}