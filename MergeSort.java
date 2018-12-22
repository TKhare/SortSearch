public class MergeSort {
    //function takes two already sorted lists and sorts them into one bigger lists
    int[] intArray;
    public MergeSort(int[] arr){
        intArray = arr;
    }
    public static void merge(int[] a, int[] l, int[] r, int access){
	int n_L = l.length;
	int n_R = r.length;
	// i marks lowest val in l
	int i = 0;
	// j marks the lowest val in r
	int j = 0;
	//k marks position in A
	int k = 0;
	while (i<n_L&&j<n_R) {
            //fills up big list with values in smaller lists
            if (l[i]<=r[j]){
                
		a[k] = l[i];
		k++;
		i++;
                }
            else {
		a[k] = r[j];
		j++;
		k++;
		}
            }
	//fills big list with any remaining integers in small lists
	while (i<n_L) {
		a[k] = l[i];
		i++;
		k++;
		}
	while (j<n_R) {
		a[k] = r[j];
		j++;
		k++;
		}
}

    //Called function which creates the smallest lists and then sorts them using merge
    public static void mergesort(int[] a, int access) {
	int n = a.length;
	if (n<2) {
            return;			
            }
        int a_mid = n/2;
	int[] l1 = new int [a_mid];
	int[] r1 = new int [n-a_mid];
	for (int i = 0; i<a_mid;i++) {
		l1[i] = a[i];
            }
	for (int i = a_mid; i <n;i++) {
		r1[i-a_mid] = a[i];
            }
        mergesort(l1, access);
        mergesort(r1, access);
        merge(a, l1, r1, access);
	}
    public void sort(){
        System.out.print("\n\n***MERGE SORT***\n\n");
        int access = 0;
        mergesort(intArray, access);
        System.out.print("[");
        for(int i=0;i<intArray.length;i++){
            System.out.print(intArray[i]);
            if(i<intArray.length-1){
                System.out.print(", ");
            }
        }
        access = (int)Math.log(intArray.length^intArray.length);
        access = (int)(intArray.length*Math.log(intArray.length));
        System.out.printf("]\n%d accesses",access);
    }
}