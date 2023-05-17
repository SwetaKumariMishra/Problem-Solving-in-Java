public class Dynamic_Programming {
    public static long fib(int n) {
        long[] memo = new long[n + 1];
        return fibHelper(n, memo);
    }

    public static long fibHelper(int n, long[] memo) {
        if (n <= 1) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibHelper(n - 1, memo) + fibHelper(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 5;
        long result = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
