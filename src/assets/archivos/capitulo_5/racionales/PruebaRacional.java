/**
 *  Esta clase se encarga de probar los
 *  métodos y estructura de la clase Racional.
 *  @author Sonia Izquierdo
 */
public class PruebaRacional {

    public static void main(String args[]){
        Racional[] numeros = new Racional[]{
            new Racional(12, 5),
            new Racional(4, 2),
            new Racional(20, 13),
            new Racional(6, 8),
            new Racional(5, 1)            
        };
        System.out.println("Tengo 5 numeros racionales:");
        System.out.println(numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", " + numeros[3] + " y " + numeros[4]);
        System.out.println("\nSi los sumo y los multiplico puedo obtener los siguientes resultados:");
        System.out.println(numeros[0] + " + " + numeros[0] + " = " + numeros[0].suma(numeros[0]));
        System.out.println(numeros[2] + " + " + numeros[4] + " = " + numeros[2].suma(numeros[4]));
        System.out.println(numeros[3] + " + " + numeros[1] + " = " + numeros[3].suma(numeros[1]));        
        System.out.println(numeros[2] + " x " + numeros[0] + " = " + numeros[0].multiplicacion(numeros[2]));        
        System.out.println(numeros[3] + " x " + numeros[4] + " = " + numeros[3].multiplicacion(numeros[4]));        
        System.out.println("\nTambien puedo determinar si dos de ellos son iguales:");
        System.out.println(numeros[0] + " y " + numeros[4] + ": " + obtenResultado(numeros[0].equals(numeros[4])));
        System.out.println(numeros[1] + " y " + numeros[2] + ": " + obtenResultado(numeros[1].equals(numeros[2])));
        System.out.println(numeros[2] + " y " + numeros[2] + ": " + obtenResultado(numeros[2].equals(numeros[2])));
        System.out.println("\nFin del Programa.");
    }
    
    /**
     *  Método que recibe un booleano como parámetro y devuelve la cadena "si son iguales"
     *  en caso de que este tenga el valor de true y la cadena "no son iguales" en caso contrario.
     *  @param resultado Variable que determina el enunciado a devolver.
     *  @return Cadena indicando la implicacion del parámetro.
     */
    private static String obtenResultado(boolean resultado){
        if(resultado)
            return "si son iguales";
        return "no son iguales";
    }    
}