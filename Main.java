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
        System.out.println("Ingrese el número de datos que desea utilizar");
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
                    mysSort.BubbleSort(listanumeros);
                    for (int i = 0; i < listanumeros.length; i++) {
                        System.out.println(listanumeros[i]);
                    }
                    break;
                case 2:
                    mysSort.gnomeSort(listanumeros, listanumeros.length);
                    for (int i = 0; i < listanumeros.length; i++) {
                        System.out.println(listanumeros[i]);
                    }
                    break;
                case 3:

                    int[] temp = mysSort.mergeSort(listanumeros);
                    System.out.println("El arreglo ordenado por mergesort es el siguiente: ");
                    for (int i = 0; i < temp.length; i++) {
                        System.out.println(temp[i]);
                    }

                    break;
                case 4:
                    mysSort.quickSort(listanumeros, 0, listanumeros.length - 1);
                    for (int i = 0; i < listanumeros.length; i++) {
                        System.out.println(listanumeros[i]);
                    }
                    break;
                case 5:

                    mysSort.radix(listanumeros);
                    // imprime dentro del método, ya que no es necesario imprimir desde el
                    // controlador.

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
