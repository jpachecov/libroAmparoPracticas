import java.util.Scanner;
/** Programa que pide al usuario la posición de tres elementos
 * del arreglo. Divide los dos primeros y almacena el resultado en el 
 * tercero
 * @author Amparo López Gaona
 * @version mayo 2011
 */
public class Arreglo {
  public static void main (String [] pps) {
    final int[] valores = {10,0,30,40,100,5,2,45};
    Scanner io = new Scanner(System.in);

    final int cambios = 5;
    for(int cambio = 0; cambio < cambios; cambio++) {
      System.out.println("Los valores del arreglo son:");
      for (int i=0; i < valores.length; i++)
        System.out.print(valores[i]+" ");
      System.out.println();

      System.out.println("Dar posición de los datos que se dividirán");
      int pos1= io.nextInt();
      int pos2 = io.nextInt();
      int resultado =  valores[pos1]/valores[pos2];
      System.out.println("Dar la posición de almacenamiento");
      int destino = io.nextInt();
      valores[destino] = resultado;
    }
  }
}
