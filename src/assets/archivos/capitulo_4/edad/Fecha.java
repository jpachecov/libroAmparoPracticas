import java.util.*;
/**  
 *  Clase que implementa el manejo de fechas
 *  @author Amparo L&oacute;pez Gaona
 *  @version Mayo 2011
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // Asocia a cada mes su n&uacute;mero de d&iacute;as
    private int[] mesDia = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    private String[] nombreMes = {"","Enero","Febrero","Marzo","Abril","Mayo",
				  "Junio","Julio","Agosto","Septiembre","Octubre",
				  "Noviembre","Diciembre"};
    /** 
     * M&eacute;todo para construir una fecha d&aacute;ndole el d&iacute;a, el mes y el anio 
     * @param d -- d&iaucute;a de la fecha
     * @param m -- mes de la fecha
     * @param a -- anio de la fecha
     */
    public Fecha(int d, int m, int a) {
	if (m > 12 || m < 1) {
		System.out.println("Mes invalido");
		System.exit(0);
	}

	if (esBisiesto(a) &&  m == 2 && d > 29) {
		System.out.println("Dia invalido");
		System.exit(0);
	}

	if (d < 1 || d > mesDia[m]) {
		System.out.println("Dia invalido");
		System.exit(0);
	}
	
	mes = m;
	dia = d;
	anio = a;	
    }
    
    /** M&eacute;todo para construir la fecha de hoy */
    public Fecha() {
	GregorianCalendar c = new GregorianCalendar();
	mes = c.get(Calendar.MONTH)+1;
	anio = c.get(Calendar.YEAR);
	dia = c.get(Calendar.DAY_OF_MONTH);
    }

    /** 
     * M&eacute;todo para obtener el d&iacute;a contenido en la fecha 
     * @return int -- d&iacute;a de la fecha
     */
    public int obtenerDia() {
	return dia;
    }

    /** 
     * M&eacute;todo para obtener el mes contenido en la fecha 
     * @return int -- mes de la fecha
     */
    public int obtenerMes() {
        return mes;
    }

    /** 
     * M&eacute;todo para obtener el anio contenido en la fecha 
     * @return int -- anio de la fecha
     */
    public int obtenerAnio() {
	return anio;
    }

    /**
     * M&eacute;todo para obtener el nombre del mes
     * @return String --nombre del mes
     */
    public String obtenerNombreMes() {
	return nombreMes[mes];
    }
    
    /** 
     * M&eacute;todo para asignar el n&uacute;mero de d&iacute;a de una fecha 
     * @param d -- d&iacute;a de la fecha
     */
    public void asignarDia(int d) {
	if (esBisiesto(anio) &&  mes == 2 && d>29) {
		System.out.println("Dia invalidox "+ d);
		System.exit(0);
	    }
	
	if (d < 0 || d > mesDia[mes]) {
		System.out.println("Dia invalido: "+d);
		System.exit(0);
	    }

	dia = d;
    }
    
    /** 
     * M&eacute;todo para asignar el n&uacute;mero del mes a una fecha
     * @param m -- mes de la fecha
     */
    public void asignarMes(int m) {
	if (m > 12 || m < 1) {
		System.out.println("Mes invalido");
		System.exit(0);
	}
	mes = m;
    }
    
    /** 
     * M&eacute;todo para asignar el  anio a una fecha
     * @param a -- anio de la fecha
     */
    public void asignarAnio(int a) {
	anio = a;
    }

    /**
     * M&eacute;todo para calcular los d&iacute;as transcurridos desde el 1 de enero de 1900
     * hasta el d&iacute;a de hoy
     * @return int -- cantidad de d&iacute;as transcurridos desde 1-1-1900
     */
    public int diasTranscurridos()  {
	int dias = dia;

        // Dias transcurridos en este anio
	for (int i = 0; i < (mes -1); i++)
	    dias += mesDia[i];

	if (esBisiesto(anio) && mes > 1)
	    dias++;

        int anios = anio - 1900 - 1;  // Anios transcurrridos.

	if (anios > 0)
	    dias += (anios * 365);     //Dias transcurridos desde 1-1-1900

	for (int i = 1900; i < (anio - 1); i++)
	    if (esBisiesto(i)) dias ++;

	return dias;
    }

    /* Determina si un anio es bisiesto o no */
    private boolean esBisiesto(int a){
	return ((a % 400) == 0) || (((a % 4) == 0) && ((a % 100) != 0)) ;
    }
    /**
     * M&eacute;todo para devolver la fecha en formato dd/mm/aa
     * @return String -- cadena con la fecha en formato dd/mm/aa
     */
    public String toString() {
	return dia+"/"+mes+"/"+anio;
    }

    static public void main(String[] pps) {
	Fecha f= new Fecha(), f2= new Fecha(2,5,2011);

	System.out.println(f+ " mes " + f.obtenerNombreMes());
	System.out.println(f+ " dia " + f.obtenerDia());
	System.out.println(f+ " anio " + f.obtenerAnio());
	/**
	System.out.println(f+ " dia " + f.obtenerDiaSemana());
	System.out.println(f2+ " dia " + f2.obtenerDiaSemana());
	**/

	int uno = f.diasTranscurridos();
	int dos = f2.diasTranscurridos();
	System.out.println("dias transcurridos al "+ f + " " +uno);
	System.out.println("dias transcurridos al "+ f2 + " " +dos);
	System.out.println("dias transcurridos desde 2/5/2011 " + (uno-dos));

    }
}
