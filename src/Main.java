
public class Main {
    private static final int[] arr = {3,2,4,1};
    public static void main(String[] args) {
        double startTime = System.nanoTime();
        var result = Factorial();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("The result is: "+result);
        System.out.println("Time taken:"+ duration+ " milliseconds");

    }
    private static int Factorial() {
        return Solutions.Factorial(5);
    }
}