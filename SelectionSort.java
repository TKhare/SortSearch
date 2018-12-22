public class SelectionSort {
    String[] stringArray;
    int[] intArray;
    int len;
    boolean type;
    public SelectionSort(String[] arr){
        len = arr.length;
        stringArray = arr;
        type = true;
    }
    public SelectionSort(int[] arr){
        len = arr.length;
        intArray = arr;
        type = false;
    }
    public void sort(){
        System.out.print("\n\n***SELECTION SORT***\n\n");
        if(type==true){
        String min;
        int index;
        int pass = 0;
        int access = 0;
        for(int i=0;i<len-1;i++){
            index = i;
            min = stringArray[i];
            for(int j=i+1;j<len;j++){
                if(stringArray[j].compareTo(min)<0){
                    min = stringArray[j];
                    index = j;
                }
                access+=1;
            }
            pass+=1;
            System.out.printf("%d pass\n",pass);
            System.out.printf("Switching %s position (%s) to %s position (%s)\n",index,stringArray[index],i,stringArray[i]);
            String temp = stringArray[index];
            stringArray[index] = stringArray[i];
            stringArray[i] = temp;
        }
        System.out.print("[");
        for(int k=0;k<len;k++){
            System.out.print(stringArray[k]);
            if(k<len-1){
                System.out.print(", ");
            }
        }
        System.out.printf("]\n %d accesses\n",access);
        }
        if(type==false){
        int min;
        int index;
        int pass = 0;
        int access = 0;
        for(int i=0;i<len-1;i++){
            index = i;
            min = intArray[i];
            for(int j=i+1;j<len;j++){
                if(intArray[j]<min){
                    min = intArray[j];
                    index = j;
                }
                access+=1;
            }
            pass+=1;
            System.out.printf("%d pass\n",pass);
            System.out.printf("Switching %d position (%d) to %d position (%d)\n",index,intArray[index],i,intArray[i]);
            int temp = intArray[index];
            intArray[index] = intArray[i];
            intArray[i] = temp;
        }
        System.out.print("[");
        for(int k=0;k<len;k++){
            System.out.print(intArray[k]);
            if(k<len-1){
                System.out.print(", ");
            }
        }
        System.out.printf("]\n %d accesses\n",access);
        }
                
    }

}
