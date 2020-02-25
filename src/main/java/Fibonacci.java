public class Fibonacci {

    public int fib(int n) {
        return fibonacci(n, new int[n + 1]);
    }

    private int fibonacci(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (memo[n] == 0) {
            memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        }
        return memo[n];
    }

}
