import java.util.Scanner;
/**
 * Programa para calcular el RFC de una persona.
 * Objetivo Utilizar algunos métodos de la clase String
 * @author  ... 
 * @version ...
 */
class RFC {
  static public void main(String [] pps) {
    String nombre;
    String fechaNac;
    String rfc;
    Scanner in = new Scanner(System.in);

    System.out.println("Dame el nombre completo");  // Solicita nombre
    nombre = ... ;        // Lee el nombre completo
    nombre = ... ;        // Elimina blancos al inicio y final
         // Extrae las dos letras del apellido paterno y lo agreaga a RFC
         // Extrae la inicial del apellildo materno y lo agrega a RFC
         // Extrae la inicial del nombre y lo agrega a RFC

    System.out.println("\nDame la fecha de nacimiento en formato dd/mm/aa");  // Solicita la fecha de nac.
    fechaNac = ... ;        // Lee la fecha de nacimiento
    fechaNac = ... ;        // Elimina blancos al inicio y final
        // Extrae la informacion requerida

    System.out.println("El RFC de "+ nombre + "es  " + rfc.toUpperCase());
  
  }
}
