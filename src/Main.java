
public class Main {
    private static final int[] arr = {10,32,3,45,1};
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        int result = GetMin();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("The result is: "+result);
        System.out.println("Time taken:"+ duration+ " milliseconds");

    }
    private static int GetMin() {
        return Solutions.GetMin(arr,5);
    }
}