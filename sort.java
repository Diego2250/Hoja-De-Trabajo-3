public class sort<T> {
    public IComparator myCompare;
    
    public sort(IComparator _Compare) {
		myCompare = _Compare;
	}

    public void BubbleSort(int[] myArray) {
		for (int i = 0; i < myArray.length - 1; i++) {					// n
			for (int j = i + 1; j < myArray.length; j++) {				// n
				if (myCompare.Compare(myArray[i], myArray[j]) > 0) {    // 1
					int temp = myArray[i];								// 1
					myArray[i] = myArray[j];							// 1
					myArray[j] = temp;									// 1
				}
			}
		}
	}

    public void quickSort(int[] myArray, int inf, int sup) {
        int i = inf - 1;
        int j = sup;
        boolean flag = true;
        int temp;
        
        
        if (inf >= sup) {
            return;
        }
        
        int elem_div = myArray[sup];
        
        
        while (flag) {
            while(myCompare.Compare(myArray[++i], elem_div) < 0);
            while((myCompare.Compare(myArray[--j], elem_div) > 0)  && (j > inf)); 
            
            if (i < j) {
                temp = myArray[i];
                myArray[i] = myArray[j];
                myArray[j] = temp;
            } else {
                flag = false;
            }
        }
        
        temp = myArray[i];
        myArray[i] = myArray[sup];
        myArray[sup] = temp;
        quickSort(myArray, inf, i - 1);
        quickSort(myArray, i + 1, sup);
    } 
}
