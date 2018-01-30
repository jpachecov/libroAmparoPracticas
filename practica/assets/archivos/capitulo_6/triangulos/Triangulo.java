import java.util.Scanner;

/**
 * Clase para trabajar con triangulos.
 * @author 
 * @see Punto
 * @version
 */
public class Triangulo {
    private Punto a, b, c;
    private double ladoAB, ladoAC, ladoBC;

    /**
     * Constructor de un triangulo a partir los tres puntos que representan sus vertices
     * @param a - vertice a
     * @param b - vertice b
     * @param c - vertice c
     */
    public Triangulo(Punto a, Punto b, Punto c) {

    }

    /**
     * Constructor que crea un triangulo a partir de otro.
     * @param t2 - el triangulo a partir del cual se estableceran los datos del nuevo triangulo.
     */
    public Triangulo(Triangulo t2) {

    }

    /**
     * Constructor por omision. Crea el triangulo con los puntos
     * (0,0),(10,0) y (5,10).
     */
    public Triangulo () {

    }
    /**
     * Obtiene el vertice a del triangulo
     * @return Punto - vertice a
     */
    public Punto obtenerPuntoA() {

    }

    /**
     * Obtiene el vertice b del triangulo
     * @return Punto - vertice b
     */
    public Punto obtenerPuntoB() {

    }

    /**
     * Obtiene el vertice c del triangulo
     * @return Punto - vertice c
     */
    public Punto obtenerPuntoC() {

    }

    /**
     * Regresa true si el triangulo  es Isosceles.
     * @return boolean - true si es isosceles, false en caso contrario
     */
    public boolean esIsosceles() {

    }

    /**
     * Regresa true si el triangulo  es escaleno.
     * @return boolean - true si es escaleno, false en caso contrario
     */
    public boolean esEscaleno() {

    }

    /**
     * Regresa true si el triangulo <code>t</code> es Equilatero.
     * @return boolean - true si es equilatero, false en caso contrario
     */
    public boolean esEquilatero() {

    }

    /**
     * Calcula el perimetro del triangulo.
     * @return double - valor del perimetro
     */
    public double perimetro() {

    }

    /**
     * Calcula el area del triangulo.
     * @return double - valor del area
     */
    public double area() {

    }
    /**
     * Regresa el tipo de triangulo del cual se trata.
     * @return String - El tipo al que pertenece t
     */
    public String tipo() {

    }

    /**
     * Metodo equals() 
     * @param t - Triangulo a comparar con el triangulo que hace la llamada
     * @return boolean - true si son iguales false en caso contrario
     */
    public boolean equals(Triangulo t) {

    }

    /**
     * Método toString
     * @return String -- representacion en cadena del triangulo
     */
    public String toString() {

    }
}
