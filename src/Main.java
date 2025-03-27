
public class Main {
    private static final int[] arr = {3,2,4,1};
    private static final String word = "123a12";

    public static void main(String[] args) {
        double startTime = System.nanoTime();
        var result = Gcd();
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1000000;

        System.out.println("The result is: " + result );

        System.out.println("Time taken:"+ duration+ " milliseconds");

    }
    private static int Gcd() {
        return Solutions.Gcd(32,48);
    }
}