package U10T1_Lab1;

public class Problem1 {
    public static void main(String [] args) {
        System.out.println("main method called");
        recursiveMethod(1);
        System.out.println("main method ended");
    }

    public static void recursiveMethod(int n) {
        System.out.println("recursive called, n = " + n);
        if (n < 12) {
            recursiveMethod(n + 5);
        }
        System.out.println("recursive ended, n = " + n);
    }
}
