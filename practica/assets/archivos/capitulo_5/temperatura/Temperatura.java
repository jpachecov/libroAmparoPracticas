/**
 * Clase para convertir de grados Celcius a Fahrenheit y viceversa
 * @author Amparo L�pez Gaona
 * @version Abril 2008
 */
class Temperatura{
    float valorT;
    boolean esFarenheit=false;

/**
 * Constructor por omisi�n, en este caso la temperatura es 0 y
 * los grados son Centigrados.
 */
    Temperatura(){
        valorT=0;
        esFarenheit=false;
    }

/** 
 * Constructor que toma dos valores: la temperatura y la escala en que est�
 *  @param temp  temperatura que ser� convertida 
 *  @param escala escala en que se encuentra la temperatura
 */
    Temperatura(float temp,char escala){

    }

/** 
 * Constructor que toma como parametro la escala en que est� la temperatura. 
 * La temperatura es cero grados
 *  @param escala escala en que se encuentra la temperatura
 */
    Temperatura(char escala){

    }

/** 
 * Constructor que toma como parametro la temperatura, la escala es celcius.
 *  @param temp grados que ser�n convertidos a celcius ?
 */
    Temperatura(float temp){

    }

/**
 * Devuelve la temperatura en grados centigrados
 * @return float - temperatura en grados centigrados
 */
    public float obtenerTempEnCelsius(){

    }

/**
 * Devuelve la temperatura en grados farenheit
 * @return float - temperatura en grados farenheit
 */
    public float obtenerTemperaturaEnFarenheit(){

    }
    /**
     * Convierte al temperatura a grados Centigrados
     * @param valT valor de la temperatura que se convertira
     * @return float -- Temperatura en grados Centigrados
     */
    public float convertirACelsius(float valT){

    }

    /**
     * Convierte al temperatura a grados Farenheit
     * @param valT valor de la temperatura que se convertira
     * @return float -- temperatura en grados Farenheit
     */
    public float convertirAFarenheit(float valT){

    }
    /**
     * Determina si dos temperaturas son iguales
     * @param temp temperatura que se comparar� con this
     * @return boolean -- true si ambas son iguales y false en otro caso
     */
    public boolean esIgual(Temperatura temp){

    }
    /**
     * Determina si la temperatura actual es mayor que su par�metro
     * @param temp temperatura que se comparar� con this
     * @return boolean -- true si this es mayor que el par�metro y false en otro caso
     */
    public boolean esMayor(Temperatura temp){

    }
    /**
     * Determina si la temperatura actual es menor que su par�metro
     * @param temp temperatura que se comparar� con this
     * @return boolean -- true si this es menor que el par�metro y false en otro caso
     */
    public boolean esMenor(Temperatura temp){

    }

    public String toString() {

    }
}

