class Factorial {
  public static void main(String[] args) {
    System.out.println(Factorial(Integer.parseInt(args[0])));
  }

  public static int Factorial(int n) {
    if (n == 1) {
      return 1;
    }

    return n * Factorial(n-1);
  }
}