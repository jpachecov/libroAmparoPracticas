/**
 * Clase ejemplo para la jerarquia de animales.
 * Tiene errores que hay que corregir
 */
public class Canario extends Animal {
    /**
     * Constructor a partir del nombre del canario
     * @param -- nombre del canario
     */
    public Canario(String n) {
	nPatas = 2;
	super (n);
    }

    /**
     * Metodo para especificar como habla el animal
     */
    public abstract void hablar() {
	System.out.println("Cuando canto, twiteo :)!!!");
    }

    /**
     * Metodo para determinar si el animal camina en dos patas o no
     */
  public caminaEnDosPatas() {
      return true;
  }

    /**
     * metodo para obtener toda la informacin del canario
     */
    public String toString () {
	return super.toString() + "soy un canario.\n\tTengo "+ nPatas+ " patas.";
    }
}

