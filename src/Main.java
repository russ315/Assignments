
public class Main {
    private static final int[] arr = {3,2,4,1};
    private static final String word = "123a12";

    public static void main(String[] args) {
        double startTime = System.nanoTime();
        ReverseArray();
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1000000;


        System.out.println("Time taken:"+ duration+ " milliseconds");

    }
    private static void ReverseArray() {
         Solutions.ReverseArray(5);
    }
}