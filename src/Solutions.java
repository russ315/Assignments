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
}
