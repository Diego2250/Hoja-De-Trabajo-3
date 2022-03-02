public class quick {
    /** 
     * @param arreglo[]
     * @param inf
     * @param sup
     * @return int
     */
    private static int particion(int arr[], int inf, int sup) {
        int pivote = arr[inf];
        while (true) {
            while (arr[inf] < pivote) {
                inf++;
            }
            while (arr[sup] > pivote) {
                sup--;
            }
            if (inf >= sup) {
                return sup;
            } else {
                int temporal = arr[inf];
                arr[inf] = arr[sup];
                arr[sup] = temporal;
                inf++;
                sup--;
            }
        }
    }
    
    /***
     * @param arr
     * @param inf
     * @param sup
     */
    public static void quicksort(int arr[], int inf, int sup) {
        if (inf < sup) {
            int indiceParticion = particion(arr, inf, sup);
            quicksort(arr, inf, indiceParticion);
            quicksort(arr, indiceParticion + 1, sup);
        }
    }
}
