import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sort mysSort = new sort(new comparate());
        archivo arch = new archivo();
        Random r1 = new Random();
        int datos = 0, opcion = 0;
        boolean salir = false;
        String datoString;
        arch.crearchivo();
        System.out.println("Ingrese el ñumero de datos que desea utilizar");
        try {
            datos = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Opción invalida");
        }
        int[] listanumeros = new int[datos];
        for (int i = 0; i < datos; i++) {
            listanumeros[i] = r1.nextInt(1000);
            System.out.println(listanumeros[i]);
            datoString = String.valueOf(listanumeros[i]);
            arch.escribir(datoString);
        }

        //PARTE DONDE MORA LA CAGO
        int[] copiedArray = new int[datos];
        System.arraycopy(listanumeros, 0, copiedArray, 0, datos);
        Arrays.sort(copiedArray);

        System.out.print("aqui aaaaaaaa \n");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.println(copiedArray[i]);
        }
        // AQUI TERMINA PARTE DONDE MORA LA CAGO.


        String menu = "\nIngrese la opción que desea utilizar: \n" +
                "1. Bubble Sort\n" +
                "2. Gnome Sort Sort\n" +
                "3. Merge sort\n" +
                "4. Quick sort\n" +
                "5. Radix sort\n" +
                "6. Salir\n";
        while (salir == false) {
            System.out.println(menu);
            try {
                opcion = scan.nextInt();
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("Opción invalida");
            }
            switch (opcion) {
                case 1:
                    mysSort.BubbleSort(copiedArray);
                    for (int i = 0; i < copiedArray.length; i++) {
                        System.out.println(copiedArray[i]);
                    }
                    break;
                case 2:
                    mysSort.gnomeSort(copiedArray, copiedArray.length);
                    for (int i = 0; i < copiedArray.length; i++) {
                        System.out.println(copiedArray[i]);
                    }
                    break;
                case 3:

                    int[] temp = mysSort.mergeSort(copiedArray);
                    System.out.println("El arreglo ordenado por mergesort es el siguiente: ");
                    for (int i = 0; i < temp.length; i++) {
                        System.out.println(temp[i]);
                    }

                    break;
                case 4:
                    mysSort.quickSort(copiedArray, 0, copiedArray.length - 1);
                    for (int i = 0; i < copiedArray.length; i++) {
                        System.out.println(copiedArray[i]);
                    }
                    break;
                case 5:

                    int[] temp5 = mysSort.radix(copiedArray);
                    System.out.println("el arreglo con ordenamiento radix es : ");
                    int k;
                    for (k = 0; k < temp5.length; k++) {
                        System.out.println(temp5[k]);
                    }

                    break;
                case 6:
                    System.out.println("Adios");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
            }
        }
    }
}
