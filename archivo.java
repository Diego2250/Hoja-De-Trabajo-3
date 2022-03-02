import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class archivo {

  public archivo(){
  }
  public void crearchivo() {
    try {
      File myObj = new File("numeros.txt");
      if (myObj.createNewFile()) {
        System.out.println("Archivo creado: " + myObj.getName());
      } else {
      }
    } catch (IOException e) {
      e.printStackTrace();}
    }

  
  /** 
   * @param dato
   */
  public void escribir(String dato){
        try {
        FileWriter myWriter = new FileWriter("numeros.txt", true);
        myWriter.write(dato+"\n");
        myWriter.close();
        } catch (IOException e) {;
        e.printStackTrace();
    }
    }
        /*Metodo para leer el archivo
      */
  public void leer(){
    try {
      File myObj = new File("numeros.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}

