package U10T1_Lab4;

public class Main {
    private static int counter = 0;

    public static void main(String[] args) {
        int n = 40;
        long startTime = System.nanoTime();
        int fibRec = fibonacci(n);
        long endTime = System.nanoTime();
        long recursiveTime = endTime - startTime;


        startTime = System.nanoTime();
        int fibIter = iterativeFib(n);
        endTime = System.nanoTime();
        long iterativeTime = endTime - startTime;
        System.out.println("Fibonacci(" + n + ")");

        System.out.println("Recursive: " + fibonacci(n)+ " | Time: " + recursiveTime / 1e6 + " ms");
        System.out.println("Iterative: " + iterativeFib(n) + " | Time: " + iterativeTime / 1e6 + " ms");
    }

    private static int fibonacci(int x) {
        // counter++;
        // System.out.println("Method Called: " + counter);
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        // double recursive method call
        return fibonacci(x - 1) + fibonacci(x - 2);
    }


    public static int iterativeFib(int n){
        if (n == 1) {
          return 0;
        }
        if (n < 3) {
          return 1;
        }
        int int1 = 0;
        int int2 = 1;
        for (int i = 2; i < n; i++) {
          int temp = int2;
          int2 += int1;
          int1 = temp;
        }
        return int2;
      }      
      
}
