/**
 * Programa para generar medidas estadisticas
 * @author ALG
 * @version Mayo 2011
 */
public class Estadisticas {
    // Variables

    /**
     * Constructor que recibe un arreglo de enteros.
     * v -- arreglo de enteros con los datos de los que se obtendra la muestra
     */
    public Estadisticas(int[] v) {

    }

    /**
     * Constructor por omision, crea un arreglo de 100 elementos
     */
    public Estadisticas () {

    }

    /**
     * Metodo para agregar un dato al arreglo. Envia un mensaje indicando
     * que el dato se agrego o bien que no se pudo hacer
     * @param dato -- dato que se agrega al arreglo.
     */
    public void agregar(int dato) {

    }

    /**
     * Metodo para eliminar todos los elementos del arreglo
     */
    public void eliminarTodos() {

    }

    /**
     * Metodo para conocer la cantidad de elementos en el arreglo
     * @return int -- cantidad de elementos en el arreglo
     */
    public int obtenerCantidadDeDatos () {

    }

    /**
     * Metodo para obtener los elementos en el arreglo
     * @return int[] -- elementos en el arreglo
     */
    public int[] obtenerDatos() {

    }

    /**
     * Metodo para obtener el elemento mayor en el arreglo
     * @return int -- elemento mayor en el arreglo
     */
    public int maximo() {

    }

    /**
     * Metodo para obtener el elemento menor en el arreglo
     * @return int -- elemento mayor en el arreglo
     */
    public int minimo() {

    }

    /**
     * Metodo para obtener la media del arreglo
     * @return double -- media del arreglo
     */
    public double media () {

    }

    /**
     * Metodo para obtener la moda del arreglo
     * @return int -- moda del arreglo
     */
    public int moda () {

    }

    /**
     * Metodo para obtener la mediana del arreglo
     * @return int -- mediana del arreglo
     */
    public int mediana () {

    }

    /*
     * Metodo privado para ordenar el arreglo
     */
    private int[] ordenar() {
	int [] ddatos = new int[nDatos];

	for (int i = 0; i < nDatos; i++)
	    ddatos[i] = datos[i];
	for (int i = nDatos - 1; i >0; i--)
	    for (int j = 0; j < i; j++)
		if (datos[j] > ddatos[j+1]) {  // Estan desordenados por tanto
		    int tmp = ddatos[j];         // los intercambia
		    ddatos[j] = ddatos[j+1];
		    ddatos[j+1] = tmp;
		}
	return ddatos;
    }

    /**
     * Metodo para obtener la desviacion estandar del arreglo
     * @return double -- desviacion estandar del arreglo
     */
    public double desviacion () {

    }
}
