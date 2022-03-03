public class sort<T> {
    public IComparator myCompare;

    public sort(IComparator _Compare) {
        myCompare = _Compare;
    }

    /**
     * @param myArray
     */
    public void BubbleSort(int[] myArray) {
        for (int i = 0; i < myArray.length - 1; i++) { // n
            for (int j = i + 1; j < myArray.length; j++) { // n
                if (myCompare.Compare(myArray[i], myArray[j]) > 0) { // 1
                    int temp = myArray[i]; // 1
                    myArray[i] = myArray[j]; // 1
                    myArray[j] = temp; // 1
                }
            }
        }
    }

    /**
     * @param myArray
     * @param inf
     * @param sup
     */
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
            while (myCompare.Compare(myArray[++i], elem_div) < 0)
                ;
            while ((myCompare.Compare(myArray[--j], elem_div) > 0) && (j > inf))
                ;

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

    /**
     * obtenido de:
     * https://www.youtube.com/watch?v=fbRia-tshfo&ab_channel=MasterHeHeGar
     * 
     * @param arreglo contiene los números que se ordenarán.
     */
    public void RadixSort(int[] arreglo) {
        int x, i, j;
        for (x = Integer.SIZE - 1; x >= 0; x++) {
            int aux[] = new int[arreglo.length];
            j = 0;
            for (i = 0; i < arreglo.length; i++) {
                boolean mv = arreglo[i] << x >= 0;
                if (x == 0 ? !mv : mv) {
                    aux[j] = aux[i];
                    j++;
                } else {
                    arreglo[i - j] = arreglo[i];
                }
            }
            for (i = j; i < aux.length; i++) {
                aux[i] = arreglo[i - j];
            }
            arreglo = aux;
        }

        System.out.println("El arreglo ordenado por radix es el siguiente: ");
        for (int m = 0; m < arreglo.length - 1; m++) {
            System.out.println(arreglo[m]);
        }

    }

    /**
     * obtenido de:
     * https://www.youtube.com/watch?v=bOk35XmHPKs&ab_channel=CodingwithJohn
     * 
     * @param arreglo arreglo de números que se ordenarán.
     */
    public void mergeSort(int[] arreglo) {
        int length = arreglo.length;
        if (length < 2) {
            return;
        }

        int midIndex = length / 2;
        int[] lhalf = new int[midIndex];
        int[] rhalf = new int[length - midIndex]; // No usamos midIndex porque si el arreglo no tiene una cantidad par
                                                  // de números, entonces petaría.

        // Llenando el lado izquierdo.
        for (int i = 0; i < midIndex; i++) {
            lhalf[i] = arreglo[i];
        }

        // Llenando el lado derecho
        for (int i = midIndex; i < length; i++) {
            rhalf[i - midIndex] = arreglo[i];
        }

        mergeSort(lhalf);
        mergeSort(rhalf);

        merge(arreglo, lhalf, rhalf);

        System.out.println("El arreglo ordenado con merge es: ");
        for (int m = 0; m < arreglo.length; m++) {
            System.out.println(arreglo[m]);
        }

    }

    /**
     * Para usarse por mergeSort().
     * Obtenido de:
     * https://www.youtube.com/watch?v=bOk35XmHPKs&ab_channel=CodingwithJohn
     * 
     * @param arreglo arreglo de números orginales.
     * @param lhalf   arreglo generado por método mergeSort(). Mitad izquierda
     * @param rhalf   arreglo generado por método mergeSort(). Mitad derecha
     */
    public void merge(int[] arreglo, int[] lhalf, int[] rhalf) {
        int lhalfSIze = lhalf.length;
        int rhalfSize = rhalf.length;

        int i = 0, j = 0, k = 0;
        while (i < lhalfSIze && j < rhalfSize) {
            // Looping and adding the sorted elements. (más fácil decirlo en ingles jaja)
            if (lhalf[i] <= rhalf[j]) {
                arreglo[k] = lhalf[i];
                i++;
            } else {
                arreglo[k] = rhalf[j];
                j++;
            }
            k++;
        }

        while (i < lhalfSIze) {
            arreglo[k] = lhalf[i];
            k++;
            i++;
        }

        while (j < rhalfSize) {
            arreglo[k] = rhalf[j];
            k++;
            j++;
        }

    }

    public void gnomeSort(int arr[], int n) {
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = 0;
                temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
        return;
    }

}
