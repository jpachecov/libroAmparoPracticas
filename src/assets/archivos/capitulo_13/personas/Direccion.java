/**
 * Clase para trabajar direcciones
 * @author Amparo Lopez Gaona
 * @version junio 2011
 */
public class Direccion implements java.io.Serializable {
  String calleNum;
  String ciudad;
  String pais;

    /**
     * Constructor de una direccion a partir de todos sus datos
     * @param calleNum -- calle y numero 
     * @param cd -- ciudad 
     * @param pais -pais 
     */
  public Direccion(String calleNum, String cd, String pais) {
    this.calleNum = calleNum;
    ciudad = cd;
    this.pais = pais;
  }

    /**
     * Metodo para asignar la calle y numero de la direccion
     * @param nuevaCalleNum -- calle y numero
     */
  public void asignarCalleNum(String nuevaCalleNum) {
    calleNum = nuevaCalleNum;
  }

    /**
     * Metodo para asignar la ciudad de la direccion
     * @param nuevaCiudad -- ciudad
     */
  public void asignarCiudad(String nuevaCiudad) {
    ciudad = nuevaCiudad;
  }

    /**
     * Metodo para asignar el pais a la direccion
     * @param nuevoPais -- pais
     */
  public void asignarPais(String nuevoPais) {
    pais = nuevoPais;
  }

    /**
     * Metodo para obtener la calle y numero de la direccion
     * @return String -- calle y numero
     */
  public String obtenerCalleNum() {
    return calleNum;
  }
    /**
     * Metodo para obtener el pais de la direccion
     * @return String -- pais
     */
  public String obtenerPais() {
    return pais;
  }
    /**
     * Metodo para obtener la ciudad de la direccion
     * @return String -- ciudad
     */
  public String obtenerCiudad() {
    return ciudad;
  }
    /**
     * Metodo par obtener todos los datos de la direccion en una cadena
     * @return String -- representacion en cadena de la direccion
     */
  public String toString() {
    return calleNum+"\t"+ciudad+"\t"+pais;
  }
    /**
     * Metodo para determinar si dos direccions son iguales 
     * @return boolean -- true si tienen los mismos datos y false en otro caso
     */
  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (o instanceof Direccion) {
      Direccion dir = (Direccion)o;
      return calleNum.equals(dir.obtenerCalleNum()) && ciudad.equals(dir.ciudad) &&
	  pais.equals(dir.pais);
    }
    return false;
  }
}



