/**
 * Clase para practicar con el paso de parametros por valor que tiene Java
 * @author ALG
 */
public class Parametros {

  /**
   * metodo para probar el paso de parametros por valor con datos
   * primitivos
   */
  public static void recibePrimitivos(int i, double f, char c, boolean prueba) {
    i += 10;    
    c = 'z';    
    if(prueba)
      prueba = false;
    else 
      prueba = true;
    f = 1.5;
  }

  /**
   * metodo para probar el paso de parametros por valor con datos
   * primitivos
   */
  public int recibePrimitivos(int x, int y) {
    x = x + 10;
    y = y + 10;
    return x;
  }

  /**
   * metodo para probar el paso de parametros por valor con un objeto
   */
  public static void recibeUnObjeto(Punto pto) {
    pto.asignarX(-100);
    pto.asignarY(-100);
  }

  /**
   * metodo para probar el paso de parametros por valor con una cadena
   */
  public static void recibeUnaCadena(String s) {
    s = "es una cadena distinta"
  }

  /**
   * metodo para probar el paso de parametros por valor con un arreglo
   */

  public static void recibeUnArreglo(char[] a) {
    a[0] = 'm';
    a[1] = 'a';
    a[2] = 'n';
    a[3] = 'o';
  }

  public static void main(String[] pps) {
  //Definir las variables necesarias para resolver las preguntas de la práctica

  //Mostrar el valor de las variables con que se llamara al metodo primitivos

    primitivos(ii, ff, cc, bb);  // Llama al método primitivos
    System.out.println("ii = " + ii + ", ff = " + ff +
                       ", cc = " + cc + ", bb = " + bb);  // imprime resultados

    // Imprimir los valores de los parámetros antes de hacer la llamada
    // a cada método que se va a probar y después de regresar del método.

  }
}
