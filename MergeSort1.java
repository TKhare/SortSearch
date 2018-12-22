public class MergeSort1 {
    //function takes two already sorted lists and sorts them into one bigger lists
    String[] stringArray;
    public MergeSort1(String[] arr){
        stringArray = arr;
    }
    public static void merge(String[] a, String[] l, String[] r, int access){
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
            if (l[i].compareTo(r[j])<=0){
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
    public static void mergesort(String[] a, int access) {
	int n = a.length;
	if (n<2) {
            return;			
            }
        int a_mid = n/2;
	String[] l1 = new String [a_mid];
	String[] r1 = new String [n-a_mid];
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
        mergesort(stringArray, access);
        System.out.print("[");
        for(int i=0;i<stringArray.length;i++){
            System.out.print(stringArray[i]);
            if(i<stringArray.length-1){
                System.out.print(", ");
            }
        }
        access = (int)Math.log(stringArray.length^stringArray.length);
        access = (int)(stringArray.length*Math.log(stringArray.length));
        System.out.printf("]\n%d accesses",access);
    }
}
