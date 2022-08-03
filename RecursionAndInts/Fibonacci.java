class Fibonacci {
  public static void main(String[] args) {
    System.out.println(Fibonacci(Integer.parseInt(args[0])));
  }

  public static long Fibonacci(long n) {
    if (n == 0 || n ==1) {
      return n;
    }
    else {
      return Fibonacci(n-1) + Fibonacci(n-2);
    }
  }
}