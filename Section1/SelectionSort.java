public class SelectionSort {

  public static void main(String[] args) {
      int[] arr = {20,35,-15,7,55,1,-22};
      SelectionSort(arr);
      System.out.println("Time complexity: O(n2) quadratic");
      System.out.println("Unstable algorithm");
  }
  public static void SelectionSort(int [] arr){
    for (int lastIndex = arr.length - 1; lastIndex > 0; lastIndex--) {
      int largest = 0;
      for (int i = 1; i <= lastIndex; i++) {
        if(arr[i] > arr[largest]){
          largest = i;
        }
      }
      swap(arr,largest,lastIndex);
    }

    for (int i : arr) {
      System.out.println(i); 
    }
  }

  public static void swap(int[] arr, int i, int j)
  {
    if(i == j) 
     return;

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
