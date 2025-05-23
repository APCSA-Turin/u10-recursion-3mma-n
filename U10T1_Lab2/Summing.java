package U10T1_Lab2;

public class Summing {  
    public static void main(String[] args) {      
      System.out.println(sum(6));  // should print 21
      System.out.println(sum(10)); // should print 55
      System.out.println(sum(100)); // should print 5050
    }
  
    public static int sum(int n) {
        if (n <= 1) {
            return n; 
        }
        return n + sum(n - 1);
    }
  }
  