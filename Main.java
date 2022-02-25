import java.util.Scanner;
import java.util.Random; 
public class Main {
   public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    archivo arch=new archivo(); 
    Random r1 = new Random();
    int datos; 
    String datoString; 
    arch.crearchivo();
    System.out.println("Ingrese el número de datos que desea utilizar");
    datos=scan.nextInt();
    int[] listanumeros=new int[datos]; 
    for(int i=0; i<datos; i++){
        listanumeros[i]=r1.nextInt(1000);
        System.out.println(listanumeros[i]);
        datoString=String.valueOf(listanumeros[i]);
        arch.escribir(datoString);
    }  
    
   } 
}
