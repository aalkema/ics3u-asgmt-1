class CallStack {
  public static void main(String[] args) {
    System.out.println(GetText());
  }

  public static String GetText() {
    return "Hi, %s".formatted(GetName());
  }

  public static String GetName() {
    return "Andrew %s".formatted(GetSurname());
  }

  public static String GetSurname() {
    return "Alkema";
  }
}