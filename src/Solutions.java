public class Solutions {
    /**Problem 1.
     * This method calculates the smallest number from given array
     * Time complexity:O(n),where n is the length of the array
     * It uses a linear approach
     * @param arr,n
     * arr = array
     * n = length of the array
     * @return
     * the smallest number from array
    */
    public static int GetMin(int[] arr,int n){
        int min = arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    /**Problem 2.
     Time complexity:O(n),where n is the length of the array
     You are given a number “n” and an array of “n” elements,
     write the function that returns average of them.
     */
    public static double GetAverage(int[] arr,int n){
        double sum = arr[0];
        for(int i=1;i<n;i++){
            sum+=arr[i];
        }
        return sum/n;
    }

    /**Problem 3.
     Time complexity:O(n),where n is the number
     You are given a number “n”, write the function for checking
     whether“n” is prime.
     */
    public static boolean IsPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    /**Problem 4.
     Time complexity:O(n),where n is the number
     You are given a number “n”, write the program using recursion for
     finding “n!”
     */
    public static int Factorial(int n){
        if(n==1 || n==0 )
            return 1;
        return n*Factorial(n-1);
    }

    /**Problem 5.
     Time Complexity: O(2^n):O(n),where n is the number
     You are given a number “n”, write the function for finding n-th
     elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).
     F0= 0, F1 = 1.
     */
    public static int Fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    /**Problem 6.
     Time complexity:O(n),where n is the number
     You are given numbers “a” and “n”, write the function that
     returns “a^n"
     */
    public static int Power(int a, int n) {
        if (n == 0) return 1;
        return a * Power(a, n - 1);
    }

    /**Problem 7.
     Time complexity:O(n),where n is the number
     You are given a number “n” and an array of “n” elements,
     write the program that returns given array in reverse order
     without using array data structure.
     */
    public static void ReverseArray(int[] arr, int start) {
        if (start >= arr.length / 2) return;
        int temp = arr[start];
        arr[start] = arr[arr.length - start - 1];
        arr[arr.length - start - 1] = temp;
        ReverseArray(arr, start + 1);
    }

    /**Problem 8.
     Time complexity:O(n),where n is the length of string
     You are given a string “s”, write the function for checking
     whether “s” is all consists of digits
     */
    public static boolean IsAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return IsAllDigits(s, index + 1);
    }

    /**Problem 9.
     Time complexity:O(2^n)
     You are given numbers“n” and “k”,write the program that
     finds Cn
     k
     (binomial coefficient) using formulaCn
     k=Cn−1
     k−1
     +Cn−1
     k where Cn
     0=Cn
     n=1.
     */
    public static int BinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return BinomialCoefficient(n - 1, k - 1) + BinomialCoefficient(n - 1, k);
    }

    /**Problem 9.
     Time complexity:O(log(min(a, b)))
     You are given “a” and “b”, write the function for finding
     GCD(a, b) using recursion. (Hint: Euclidean Algorithm)
     */
    public static int Gcd(int a, int b) {
        if (b == 0) return a;
        return Gcd(b, a % b);
    }
}
