/**
 *  Clase que representa una Fecha formada por un dia un mes y un anio.
 * @author ALG
 * @version Mayo 2011
 */
public class Fecha implements java.io.Serializable{
    
    /*
     *  Almacena el mes de la Fecha.
     *  Enero corresponde al mes 1 y asi sucesivamente.
     */
    private int mes;
    
    /*
     *  Almacena el dia de la Fecha.
     */
    private int dia;

    private int anio;    
    /*
     *  Contiene los nombres de todos los meses del Anio.
     */
    private static final String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    /**
     *  Inicializa una fecha al primero de Enero de 1900.
     */
    public Fecha() {
        mes = 1;
        dia = 1;
	anio = 1900;
    }
    
    /**
     *  Inicializa una fecha con los parametros dados.
     *  @param dia -- dia de la nueva fecha.
     *  @param mes - -mes de la nueva fecha.
     *  @param anio -- anio de la nueva fecha.
     */
    public Fecha(int dia, int mes, int anio){
        if(mes >= 1 && mes <= 12){
            this.dia = dia;
            this.mes = mes;
        }else{
            System.out.println("ERROR: " + mes + " no es un mes valido.");
            this.dia = 1;
            this.mes = 1;
        }
	this.anio = (anio > 0) ? anio : 1;
    }
    /**
     * Constructor de copia
     * @param nuevaFecha -- fecha que sera copiada
     */
    public Fecha(Fecha nuevaFecha) {
	this (nuevaFecha.dia, nuevaFecha.mes, nuevaFecha.anio);
    }

    /**
     *  Devuelve la representacion en cadena de la fecha.
     *  @return String -- Representacion en cadena de la fecha.
     */
    public String toString(){
        return dia + " de " + meses[mes - 1] + " de " + anio;
    }
    
    /**
     *  Devuelve el mes de la fecha como numero.
     *  @return int -- mes de la fecha como numero.
     */
    public int obtenerMes(){
        return mes;
    }
    
    /**
     *  Devuelve el dia de la fecha.
     *  @return int -- dia de la fecha.
     */
    public int obtenerDia(){
        return dia;
    }

    /**
     *  Devuelve el anio de la fecha.
     *  @return int -- anio de la fecha.
     */
    public int obtenerAnio(){
        return dia;
    }
    
    /**
     *  Devuelve el nombre del mes como cadena.
     *  @return String -- nombre del mes de la fecha como cadena.
     */
    public String obtenerNombreMes(){
        return meses[mes - 1];
    }
    
    /**
     *  Establece un nuevo dia para la fecha.
     *  @param dia -- nuevo dia de la fecha.
     */
    public void asignarDia(int dia){
        this.dia = dia;
    }
    
    /**
     *  Establece un nuevo mes para la fecha.
     *  @param mes -- nuevo mes para la fecha.
     */
    public void asignarMes(int mes){
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }else{
            System.out.println("ERROR: " + mes + " no es un mes valido.");
        }
    }
    
    /**
     *  Devuelve el nombre del mes cuyo numero se pasa como parametro.
     *  Enero corresponde al mes 1 y asi sucesivamente.
     *  @param mes --  mes del que se busca el nombre.
     *  @return String -- nombre del mes pasado como parametro.
     */
    public static String nombreDelMes(int mes){
        String resultado = "Numero Invalido";
        if(mes >= 1 && mes <= 12){
            resultado = meses[mes - 1];
        }
        return resultado;
    }
    
}
