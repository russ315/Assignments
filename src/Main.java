
public class Main {
    private static final int[] arr = {3,2,4,1};
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        ReverseArray();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        for (int j : arr) {
            System.out.println("The result is: " + j);

        }
        System.out.println("Time taken:"+ duration+ " milliseconds");

    }
    private static void ReverseArray() {
        Solutions.ReverseArray(arr,0);
    }
}