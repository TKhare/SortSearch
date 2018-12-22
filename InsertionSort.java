public class InsertionSort {
    int[] intArray;
    String[] stringArray;
    int len;
    boolean type;
    int access=0;
    int pass=0;
    public InsertionSort(int[] arr){
        intArray = arr;
        len = arr.length;
        type = true;
    }
    public InsertionSort(String[] arr){
        stringArray = arr;
        len = arr.length;
        type = false;
    }
    public void sort(){
        System.out.print("\n\n***INSERTION SORT ***\n\n");
        if(type==true){
            for(int i=1;i<len;++i){
                int comparison = intArray[i];
                int j=i-1;
                System.out.println("24");
                while(j>=0 && intArray[j]>comparison){
                    System.out.print("26");
                    intArray[j+1] = intArray[j];
                    System.out.printf("Switching %d position (%d) with %d position (%d)",j+1,intArray[j+1],j,intArray[j]);
                    
                    j-=1;
                    
                }
                access+=len/1.8;
                pass+=1;
                System.out.println(pass+" pass");
                intArray[j+1]=comparison;
            }
            System.out.print("[");
            for(int k=0;k<len;k++){
                System.out.print(intArray[k]);
                if(k<len-1){
                    System.out.print(", ");
                }
            }
            System.out.printf("]\n%d accesses",access);
        }
        if(type==false){
            for(int i=1;i<len;++i){
                String comparison = stringArray[i];
                int j=i-1;
                System.out.println("24");
                while(j>=0 && stringArray[j].compareTo(comparison)>0){
                    System.out.print("26");
                    stringArray[j+1] = stringArray[j];
                    System.out.printf("Switching %d position (%d) with %d position (%d)",j+1,stringArray[j+1],j,stringArray[j]);
                    
                    j-=1;
                    
                }
                access+=len/1.8;
                pass+=1;
                System.out.println(pass+" pass");
                stringArray[j+1]=comparison;
            }
            System.out.print("[");
            for(int k=0;k<len;k++){
                System.out.print(stringArray[k]);
                if(k<len-1){
                    System.out.print(", ");
                }
            }
            System.out.printf("]\n%d accesses",access);
        }
    }
}

