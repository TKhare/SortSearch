import java.util.*;
public class client {
    public static void main(String args[]){
        Scanner receiver = new Scanner(System.in);
        System.out.print("Length: ");
        int length = receiver.nextInt();
        int i=0;
        System.out.print("1->integer sort\n2->string sort\n");
        int type = receiver.nextInt();
        if(type==2){
            String[] stringArray = new String[length];
            while(i<length){
                System.out.printf("%d: ",i+1);
                stringArray[i] = receiver.next(); 
                i+=1;
            }
            BubbleSort bubble = new BubbleSort(stringArray);
            bubble.sort();
            SelectionSort selection = new SelectionSort(stringArray);
            selection.sort();
            InsertionSort insertion = new InsertionSort(stringArray);
            insertion.sort();
            MergeSort1 merge = new MergeSort1(stringArray);
            merge.sort();
            System.out.print("\nString to search for: ");
            String search = receiver.next();
            BinarySearch binary = new BinarySearch(false);
            int[] intarr = {5,6};
            int correctelement = binary.search(11, search, intarr, stringArray);
            if(correctelement!=-1){
                System.out.printf("\n%s exists at %d element of list\n", search, correctelement);
            }
            else{
                System.out.printf("\n%s does not exist in list\n", search);
            }
        }
        else if(type==1){
           int[] intArray = new int[length];
            while(i<length){
                System.out.printf("%d: ",i+1);
                intArray[i] = receiver.nextInt(); 
                i+=1;
            }
           BubbleSort bubble = new BubbleSort(intArray);
           bubble.sort();
           SelectionSort selection = new SelectionSort(intArray);
           selection.sort();
           InsertionSort insertion = new InsertionSort(intArray);
           insertion.sort();
           MergeSort merge = new MergeSort(intArray);
           merge.sort();
           System.out.print("\nInteger to search for: ");
           int search = receiver.nextInt();
           BinarySearch binary = new BinarySearch(true);
           String[] stringarr = {"5","6"};
           int correctelement = binary.search(search, "xd", intArray, stringarr);
           if(correctelement!=-1){
               System.out.printf("\n%d exists at %d element of list\n", search, correctelement);
           }
           else{
               System.out.printf("\n%d does not exist in list\n", search);
           }
        }
    receiver.close();

    }
}