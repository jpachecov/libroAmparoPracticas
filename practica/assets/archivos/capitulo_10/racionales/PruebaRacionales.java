/**
 *  Clase encargada de probar la clase Racional.
 *  @author Amparo Lopez Gaona y ...
 */
public class PruebaRacional {

    public static void main(String args[]){
	Racional[] numeros = new Racional[8] {
	    new Racional(12, 5),
	    new Racional(4, 2),
	    new Racional(6, 8),
	    new Racional(5, 1),            
	    new Racional(23, 14),
	    new Racional(-23,0),
	    new Racional(1,1),
	    new Racional(1,1)};

        System.out.println("De 8 racionales solo tengo los siguientes:");
	for (int i=0; i < numeros.length; i++) 
	    System.out.print(numeros[i] + ", ");

        System.out.println("\nSi los sumo y los multiplico puedo obtener los siguientes resultados:");
        System.out.println(numeros[0] + " + " + numeros[0] + " = " + numeros[0].sumar(numeros[0]));
        System.out.println(numeros[2] + " + " + numeros[4] + " = " + numeros[2].sumar(numeros[4]));
        System.out.println(numeros[3] + " + " + numeros[1] + " = " + numeros[3].sumar(numeros[1]));        
        System.out.println(numeros[2] + " x " + numeros[0] + " = " + numeros[0].multiplicar(numeros[2]));        
        System.out.println(numeros[3] + " x " + numeros[4] + " = " + numeros[3].multiplicar(numeros[4]));        
        System.out.println("\nTambien puedo determinar si dos de ellos son iguales:");
        System.out.println(numeros[0] + " y " + numeros[4] + ": " + obtenerResultado(numeros[0].equals(numeros[4])));
        System.out.println(numeros[1] + " y " + numeros[2] + ": " + obtenerResultado(numeros[1].equals(numeros[2])));
        System.out.println(numeros[2] + " y " + numeros[2] + ": " + obtenerResultado(numeros[2].equals(numeros[2])));

        System.out.println("\nFin del Programa.");

    }
    
    /**
     *  Método que recibe un booleano como parámetro y devuelve la cadena "si son iguales"
     *  en caso de que este tenga el valor de true y la cadena "no son iguales" en caso contrario.
     *  @param resultado Variable que determina el enunciado a devolver.
     *  @return Cadena indicando la implicacion del parámetro.
     */
    private static String obtenerResultado(boolean resultado){
        if(resultado)
            return "si son iguales";
        return "no son iguales";
    }    
}
