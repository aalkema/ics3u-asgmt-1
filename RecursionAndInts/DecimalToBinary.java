class DecimalToBinary{
  public static void main(String[] args) {
    System.out.println(DecimalToBinary(Integer.parseInt(args[0]), ""));
  }

  public static String DecimalToBinary(int decimal, String result) {
    if (decimal == 0) {
      return result;
    }

    result = decimal % 2 + result;
    return DecimalToBinary(decimal / 2, result);
  }
}