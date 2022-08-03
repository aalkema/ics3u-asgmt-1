class ReverseString {
  public static void main(String[] args) {
    System.out.println(ReverseString(args[0]));
  }

  public static String ReverseString(String input) {
    if (input == "") {
      return "";
    }

    return ReverseString(input.substring(1)) + input.charAt(0);
  }
}