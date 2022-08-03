class BinarySearch {
  public static void main(String[] args) {
    int[] arr = new int[] {-1, 1, 2, 3, 4, 7, 9, 10, 20};
    System.out.println(BinarySearch(arr, 0, arr.length -1, Integer.parseInt(args[0])));
  }

  public static int BinarySearch(int[] arr, int left, int right, int x) {
    if (left > right) {
      return -1;
    }

    int mid = (left + right) / 2;

    if (x == arr[mid]) {
      return mid;
    }

    if (x < arr[mid]) {
      return BinarySearch(arr, left, mid-1, x);
    }

    return BinarySearch(arr, mid+1, right, x);
  }
}