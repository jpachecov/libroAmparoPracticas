/**
 * Clase para manejar paginas de un diario y trabajr con archivos
 * @author Amparo Lopez Gaona
 * @see Fecha
 * @version Junio 2011
 */
public class EntradaDeDiario {
    /** Titulo de la pagina */
    private String titulo;  
    /** Fecha de la pagina en el diario */
    private Fecha fecha;
    /** Contenido del diario */
    private String contenido;

    /**
     * Constructor a partir de la informacion de la entrada al diario
     * @param t -- titulo de la entrada del diario 
     * @param f -- fecha  de la entrada del diario 
     * @param c -- contenido  de la entrada del diario 
     */
    public EntradaDeDiario(String t, Fecha f, String c) {
	titulo = t;
	fecha = new Fecha(f);
	contenido = c;
    }
    /**
     * Metodo para obtener el titulo de la entrada del diario
     * @return String -- titulo de la entrada del diario
     */
    public String obtenerTitulo() {
	return titulo;
    }
    /**
     * Metodo para obtener la fecha de la entrada del diario
     * @return Fecha -- fecha de la entrada del diario
     */
    public Fecha obtenerFecha() {
	return fecha;
    }
    /**
     * Metodo para obtener el contenido de la entrada del diario
     * @return String -- contenido de la entrada del diario
     */
    public String obtenerContenido() {
	return contenido;
    }
    /** 
     * Metodo para asignar contenido a la entrada del diario
     * @param nuevoContenido -- nuevo contenido de la entrada del diario
     */
    public void asignarContenido(String nuevoContenido) {
	contenido = nuevoContenido;
    }
    /** 
     * Metodo para asignar fecha a la entrada del diario
     * @param nuevaFecha -- nueva fecha de la entrada del diario
     */
    public void asignarFecha(Fecha nuevaFecha) {
	fecha = new Fecha(nuevaFecha);
    }
    /** 
     * Metodo para asignar titulo a la entrada del diario
     * @param nuevoTitulo -- nuevo titulo de la entrada del diario
     */
    public void asignarTitulo(String nuevoTitulo) {
	titulo = nuevoTitulo;
    }
    /**
     * Metodo para obtener la informacion de la entrada del diario
     * @return String -- cadena con la informacion de la entrada del diario
     */
    public String toString() {
	return titulo+"\n"+ fecha + "\n" + contenido;
    }
}


