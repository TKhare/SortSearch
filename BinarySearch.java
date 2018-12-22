public class BinarySearch {
    boolean type;
    public BinarySearch(boolean choice){
        type = choice;
    }
    public int search(int element, String element1, int[] arr, String[] arr1){
        if(type==true){
        System.out.print("\n\n*** BINARY SEARCH *** \n\n");
        int left = 0; 
        int right = arr.length - 1; 
        while (left <= right) { 
            int mid = left + (right - left) / 2; 
  
            // Check if x is present at mid 
            if (arr[mid] == element) {
                return mid+1; 
            }
            // If x greater, ignore left half 
            if (arr[mid] < element) {
                left = mid + 1; 
            }
            // If x is smaller, ignore right half 
            else{
                right = mid - 1; 
            }
        }
        return -1;
    }
        if(type==false){
        System.out.print("\n\n*** BINARY SEARCH *** \n\n");
        int left = 0; 
        int right = arr1.length - 1; 
        while (left <= right) { 
            int mid = left + (right - left) / 2; 
  
            // Check if x is present at mid 
            if (arr1[mid].compareTo(element1)==0) {
                return mid+1; 
            }
            // If x greater, ignore left half 
            if (arr1[mid].compareTo(element1)<0) {
                left = mid + 1; 
            }
            // If x is smaller, ignore right half 
            else{
                right = mid - 1; 
            }
        }
        return -1;
    }
    else{
        return -1;
    }
    }
}