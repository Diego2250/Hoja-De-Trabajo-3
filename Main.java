import java.util.Scanner;
import java.util.Random; 
public class Main {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    bubble bubbleSrt=new bubble(); 
    quick quickSrt=new quick(); 
    archivo arch=new archivo(); 
    Random r1 = new Random();
    int datos=0, opcion=0; 
    String datoString; 
    arch.crearchivo();
    System.out.println("Ingrese el número de datos que desea utilizar");
    try {
        datos=scan.nextInt();
    } catch (Exception e) {
        System.out.println("Opción invalida"); 
    }
    int[] listanumeros=new int[datos]; 
    for(int i=0; i<datos; i++){
        listanumeros[i]=r1.nextInt(1000);
        System.out.println(listanumeros[i]);
        datoString=String.valueOf(listanumeros[i]);
        arch.escribir(datoString);
    }     
    System.out.println("\nIngrese la opción que desea utilizar: \n"+
    "1. Bubble Sort\n"+
    "2. Gnome Sort Sort\n"+
    "3. Merge sort\n"+
    "4. Quick sort\n"+
    "5. Radix sort\n");
    try {
        opcion=scan.nextInt();
        scan.nextLine(); 
    } catch (Exception e) {
        System.out.println("Opción invalida"); 
    }
    switch (opcion) {
        case 1:
            bubbleSrt.bubbleSort(listanumeros);    
            for (int i = 0; i < listanumeros.length; i++) {
                System.out.println(listanumeros[i]);
            }
            break;
        case 2:
            
            break;
        case 3:
            
            break;
        case 4:
            quickSrt.quicksort(listanumeros, 0, listanumeros.length-1);
            for (int i = 0; i < listanumeros.length; i++) {
                System.out.println(listanumeros[i]);
            }
            break;
        case 5:
        
            break;
        default:
            System.out.println("Opción invalida"); 
            break;
    }
   } 
}
