import java.util.Date;

/**
 *  Clase <b>Reloj</b>.
 *  <p>
 *  Esta clase proporciona metodos al usuario para
 *  generar cadenas de texto (Objetos String) que indiquen
 *  que hora es en distintas partes del mundo, en el momento
 *  en el que fue ejecutado el constructor para la creacion del objeto
 *  que ejecutara dichos metodos.
 *  @author Sonia Izquierdo
 */
public class Reloj {
       
    /**
     *  Constructor que no recibe ningun parametro.
     *  Se encarga simplemente de obtener y almacenar la hora en la
     *  que este fue ejecutado.
     */
    public Reloj() {
        fecha = new Date();
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Buenos Aires.
     *  @return Cadena que representa la hora actual en la ciudad de Buenos Aires.
     */
    public String horaBuenosAires(){
        return dameHora(3);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Canberra.
     *  @return Cadena que representa la hora actual en la ciudad de Canberra.
     */
    public String horaCanberra(){
        return dameHora(16);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Brazilia.
     *  @return Cadena que representa la hora actual en la ciudad de Brazilia.
     */
    public String horaBrazilia(){
        return dameHora(2);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Otawa.
     *  @return Cadena que representa la hora actual en la ciudad de Otawa.
     */
    public String horaOtawa(){
        return dameHora(2);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Santiago.
     *  @return Cadena que representa la hora actual en la ciudad de Santiago.
     */
    public String horaSantiago(){
        return dameHora(2);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Bogota.
     *  @return Cadena que representa la hora actual en la ciudad de Bogota.
     */
    public String horaBogota(){
        return dameHora(1);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de La Habana.
     *  @return Cadena que representa la hora actual en la ciudad de La Habana.
     */
    public String horaLaHabana(){
        return dameHora(1);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Madrid.
     *  @return Cadena que representa la hora actual en la ciudad de Madrid.
     */
    public String horaMadrid(){
        return dameHora(7);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Paris.
     *  @return Cadena que representa la hora actual en la ciudad de Paris.
     */
    public String horaParis(){
        return dameHora(7);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Tokio.
     *  @return Cadena que representa la hora actual en la ciudad de Tokio.
     */
    public String horaTokio(){
        return dameHora(15);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Mexico D.F.
     *  @return Cadena que representa la hora actual en la ciudad de Mexico D.F.
     */
    public String horaMexicoDF(){
        return dameHora(0);
    }
    
    /**
     *  Metodo que devuelve una cadena con el siguiente formato:
     *  <p>
     *  hh:mmhrs
     *  <p>
     *  Que representa la hora actual en la ciudad de Nueva York.
     *  @return Cadena que representa la hora actual en la ciudad de Nueva York.
     */
    public String horaNuevaYork(){
        return dameHora(1);
    }
    
    /**
     *  Objeto de la clase Date que almacenara
     *  la hora en la que fue ejecutado el
     *  constructor.
     */
    private Date fecha;    
    
    /**
     *  Este metodo se encarga de devolver una cadena
     *  senilando la hora que seria con el aumento
     *  pasado como parametro.
     *  Si el aumento es negativo, se devolvera la hora
     *  sin ninguna modificacion, es decir, con un aumento nulo.
     *  @param aumento Incremento en horas que se hara a la hora actual.
     *  @return Cadena con la hora mas el aumento pasado como parametro.
     */
    private String dameHora(int aumento){
        if(aumento < 0)
            aumento = 0;
        int hora = (fecha.getHours() + aumento) % 24;
        String horaFinal = Integer.toString(hora);
        if(horaFinal.length() == 1){
            horaFinal = "0" + horaFinal;
        }
        String minutosFinales = Integer.toString(fecha.getMinutes());
        if(minutosFinales.length() == 1){
            minutosFinales = "0" + minutosFinales;
        }
        return horaFinal + ":" + minutosFinales + "hrs";
    }
}
