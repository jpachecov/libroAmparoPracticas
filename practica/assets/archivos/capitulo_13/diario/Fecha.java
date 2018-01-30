/**
 *  Clase que representa una Fecha formada por un dia un mes y un anio.
 * @author ALG
 * @version Mayo 2011
 */
public class Fecha {
    
    /*
     *  Almacena el mes de la Fecha.
     *  Enero corresponde al mes 1 y asi sucesivamente.
     */
    private int mes;
    
    /*
     *  Almacena el dia de la Fecha.
     */
    private int dia;

    /*
     *  Almacena el anio de la Fecha.
     */
    private int anio;    
    /*
     *  Contiene los nombres de todos los meses del Anio.
     */
    private static final String[] meses = {"","Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
    "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    private static final int[] dias = {0,31,28,31,30,31,30,31,31,30,31,30,31};    
    /**
     *  Inicializa una fecha al primero de Enero de 1900.
     */
    public Fecha() throws DiaException, MesException, AnioException {
	this (1,1,1900);
    }
    
    /**
     *  Inicializa una fecha con los parametros dados.
     *  @param dia -- dia de la nueva fecha.
     *  @param mes - -mes de la nueva fecha.
     *  @param anio -- anio de la nueva fecha.
     */
    public Fecha(int dia, int mes, int anio) throws DiaException, MesException, AnioException {
	asignarMes(mes);
	asignarDia(dia);
	asignarAnio(anio);
    }
    
    /**
     *  Devuelve la representacion en cadena de la fecha.
     *  @return String -- Representacion en cadena de la fecha.
     */
    public String toString(){
        return dia + " de " + meses[mes] + " de " + anio;
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
        return meses[mes];
    }
    
    /**
     *  Establece un nuevo dia para la fecha.
     *  @param dia -- nuevo dia de la fecha.
     */
    public void asignarDia(int dia) throws DiaException {
	if (dia > 0 && dia <= dias[mes] )
	    this.dia = dia;
	else 
            throw new DiaException("ERROR: " + dia + " no es un dia valido pare el mes "+mes);
    }
    
    /**
     *  Establece un nuevo mes para la fecha.
     *  @param mes -- nuevo mes para la fecha.
     */
    public void asignarMes(int mes) throws MesException {
        if(mes >= 1 && mes <= 12){
            this.mes = mes;
        }else{
            throw new MesException("ERROR: " + mes + " no es un mes valido.");
        }
    }
    
    /**
     *  Establece un nuevo anio para la fecha.
     *  @param anio -- nuevo anio para la fecha.
     */
    public void asignarAnio(int anio) throws AnioException {
	if (anio > 0) 
	    this.anio = anio;
	else 
	    throw new AnioException("ERROR: " + anio + " no es un anio valido.");
	}

    /**
     *  Devuelve el nombre del mes cuyo numero se pasa como parametro.
     *  Enero corresponde al mes 1 y asi sucesivamente.
     *  @param mes --  mes del que se busca el nombre.
     *  @return String -- nombre del mes pasado como parametro.
     */
    public static String nombreDelMes(int mes) throws MesException {
        if(mes >= 1 && mes <= 12){
            return  meses[mes];
        } else
	    throw new MesException("ERROR: " + mes + " no es un mes valido.");
    }
   
}
