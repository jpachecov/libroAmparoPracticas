/**
 *  Esta clase se encarga de implementar n&uacute;meros racionales.
 * y sus principales operaciones utilizando excepciones.
 * @author Amparo Lopez Gaona y
 */
public class Racional {
   
    /**
     *  Entero que representa el numerador del racional.
     */
    private int numerador;
    
    /**
     *  Entero que representa el denominador del racional.
     */
    private int denominador;
    
    /**
     *  Constructor que recibe como par&aacute;metro dos n&uacute;meros enteros
     *  que ser&aacute;n el numerador y el denominador respectivamente.
     *  @param nuevoNumerador -- numerador del nuevo racional.
     *  @param nuevoDenominador -- denominador del nuevo racional.
     */
    public Racional(int nuevoNumerador, int nuevoDenominador) 

    }
    
    /**
     *  Metodo que recibe un racional como par&aacute;metro y devuelve 
     *  la suma de este con el racional que llama al metodo.
     *  @param sumando -- Racional con el que se har&aacute; la suma.
     *  @return Racional -- resultado de efectuar la operacion de suma.
     */
    public Racional sumar(Racional sumando) 

    }
    
    /**
     *  Metodo que recibe un racional como par&aacute;metro y devuelve 
     *  la multiplicacion de este con el racional que llama al metodo.
     *  @param factor -- Racional con el que se har&aacute; la multiplicacion.
     *  @return Racional -- resultado de efectuar la operacion de multiplicacion.
     */
    public Racional multiplicar(Racional factor) 

    }
    
    /**
     *  Metodo que devuelve la representacion en cadena de el racional
     *  que lo llama.
     *  @return String -- cadena del racional que llama al metodo.
     */
    public String toString(){
        return numerador+"/"+denominador;
    }
    
    /**
     *  Metodo que recibe un objeto que se supone es otro Racional y determina
     *  si este y el Racional que llama al metodo son o no iguales.
     *  @param rac -- Racional con el que se har&aacute; la rac.
     *  @return boolean -- true si ambos racionales son iguales y false en caso contrario.
     */
    public boolean equals(Object rac){
	Racional r = (Racional) rac;
        return r.denominador == denominador && r.numerador == numerador;
    }    
    
    /**
     *  Metodo que devuelve el numerador del racional.
     *  @return int -- el numerador del racional.
     */
    public int obtenerNumerador(){
        return numerador;
    }
    
    /**
     *  Metodo que devuelve el denominador del racional.
     *  @return int -- el denominador del racional.
     */
    public int obtenerDenominador(){
        return denominador;
    }
}
