class Main {
  public static void main(String args[]) {
    int n = 5;
    System.out.println(SumToN(n));
  }

  public static int SumToN(int n) {
    if (n == 1) {
      return 1;
    }

    return SumToN(n-1) + n;
  }
}