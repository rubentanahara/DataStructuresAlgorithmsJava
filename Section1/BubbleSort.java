public class BubbleSort {
  
  public static void main(String[] args) {

    int[] unsortedArray = {8, 5, 2, 9, 1, 7, 4, 3, 6, 10};
    bubbleSort(unsortedArray);
    
  }
  
  public static void bubbleSort(int[] arr) {
      
    for (int lastIndex = arr.length -1; lastIndex >0; lastIndex--) {
      for (int i = 0; i <lastIndex; i++) {
          if(arr[i]>arr[i+1]){
            swap(i,i+1,arr);
          }
      }
    }

    for (int item : arr) {
      System.out.println(item);
    }

    System.out.println("Time Complexity: O(n2) Quadratic");
  }

  public static void swap(int i, int j,int[] arr) {

    if(i == j)
      return;

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
