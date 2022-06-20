public class FibonacciCalc {
  public static int fibRecursion(int number) {
    if (number == 0) {
      return 0;
    }

    if (number == 1 || number == 2) {
      return 1;
    }

    return fibRecursion(number - 1) + fibRecursion(number - 2);
  }

  public static void main(String args[]) {
    int fib_len = 9;

    System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");

    for (int i = 0; i < fib_len; i++) {
      System.out.print(fibRecursion(i) + " ");
    }
  }
}
