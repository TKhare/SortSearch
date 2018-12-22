
public class BubbleSort {
    String[] stringArray;
    int[] intArray;
    int len;
    int pass=0;
    boolean type;
    
    public BubbleSort(String[] arr){
        stringArray = arr;
        len = arr.length;
        type=true;
    }
    public BubbleSort(int[] arr){
        intArray = arr;
        len = arr.length;
        type = false;
    }
    
    public void sort(){
        System.out.print("\n\n***BUBBLE SORT***\n\n");
        int access = 0;
        if(type==true){
            String temp;
            for(int i=0; i<len;i++){
                for(int j=0;j<len;j++){
                    if(stringArray[i].compareTo(stringArray[j])<0){
                        System.out.printf("Switching %s position (%s) to %s position (%s)\n",i+1,stringArray[i],j+1,stringArray[j]);
                        temp = stringArray[i];
                        stringArray[i]= stringArray[j];
                        stringArray[j] = temp;
                    }
                    access+=1;
                }
                pass+=1;
                System.out.printf("%d pass\n",pass);
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
            int temp1;
            for(int i=0; i<len;i++){
                for(int j=0;j<len;j++){
                    if(intArray[i]<intArray[j]){
                        System.out.printf("Switching %s position (%s) to %s position (%s)\n",i+1,intArray[i],j+1,intArray[j]);
                        temp1 = intArray[i];
                        intArray[i]= intArray[j];
                        intArray[j] = temp1;
                    }
                    access+=1;
                }
                pass+=1;
                System.out.printf("%d pass\n",pass);
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

