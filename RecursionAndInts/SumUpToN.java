class SumUpToN {
  public static void main(String[] args) {
    System.out.println(SumUpToN(Integer.parseInt(args[0])));
  }

  public static int SumUpToN(int n) {
    if (n <= 1) {
      return n;
    }

    return n + SumUpToN(n - 1);
  }
}