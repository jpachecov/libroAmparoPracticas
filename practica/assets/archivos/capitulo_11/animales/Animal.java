/**
 * Clase para modelar cierto comportamiento de algunos animales
 * @author Amparo López Gaona y ...
 * @version Junio 2011
 */
public abstract class Animal { 
  private String nombre;
    protected int nPatas;

    /**
     *Constructor de un animal
     * @param nm -- nombre del animal
     */
  public Animal(String nm)   
  { nombre=nm; }

    /**
     * Metodo para obtener el nombre de un animal
     */
  public String obtenerNombre()
  { return (nombre); }

    /**
     * Metodo para indicar de que forma habla el animal
     */
  public abstract void hablar(); 

    /**
     * Metodo para determinar si el animal puede caminar en dos patas o no
     */
    public abstract boolean caminaEnDosPatas() ;

    /**
     * Metodo para obtener la informacion del animal
     */
    public String toString () {
	return "Me llamo "+ nombre+ " ";
    }
}

