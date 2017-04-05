/**
 * Modified based on http://introcs.cs.princeton.edu/java/23recursion/Fibonacci.java.html
 */
public class Fibonacci {

    public static long fibonacci(int n) {
        if (n <= 1) return 1;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long nonrecursiveFibonacci(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        long a = 1;
        long b = 1;
        long sum = a + b; // for n == 2
        for (int i = 3; i <= n; i++) {
            a = sum; // using `a` for temporary storage
            sum = b + sum;
            b = a;
        }
        return sum;
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        long result = fibonacci(40);
        long end = System.currentTimeMillis();
        System.out.println("result: " + result);
        System.out.println("Time consumed by `fibonacci` method:" + (end - start));

        start = System.currentTimeMillis();
        result = nonrecursiveFibonacci(40);
        end = System.currentTimeMillis();
        System.out.println("result: " + result);
        System.out.println("Time consumed by `nonrecursiveFibonacci` method:" + (end - start));
    }
}
