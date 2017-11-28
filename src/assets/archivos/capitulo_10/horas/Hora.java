/**
 *  Clase no-robusta para trabajo con horas.
 * @author Amparo Lopez Gaona
 * @version Abril 2011
 */
public class Hora {
  private int horas;
  private int minutos;
  private int segundos;

  /** Constructor por omision. Construye la hora 00:00:00 */
    public Hora() {
      this (0,0,0);
  }
  /** Construye una Hora dandole la hora, los minutos y los segundos
   * @param h - valor para las horas
   * @param m - valor para los minutos
   * @param s - valor para los segundos
   */
    public Hora(int h, int m, int s) {
    asignarHora (h);
    asignarMinutos(m);
    asignarSegundos(s);
  }
  /** Construye una Hora a partir de otra
   * @param h - Hora que se copiara
   */
    public Hora(Hora h) {
    this(h.horas, h.minutos, h.segundos);  
  }

  /** Regresa el numero de hora
   * @return int - las horas del objeto Hora
   */
  public int obtenerHora() {
    return horas;
  }
  /** Regresa los minutos en una hora 
   * @return int - los minutos del objeto Hora
   */
  public int obtenerMinutos() {
    return minutos;
  }
  /** Regresa los segundos en una hora 
   * @return int - los segundos del objeto Hora
   */
  public int obtenerSegundos() {
    return segundos;
  }
  /** Coloca la hora
   * @param h - las horas para el objeto Hora
   */
    public void asignarHora(int h) {
	  horas = h;
  }
  /** Coloca los minutos de una hora 
   * @param h - los minutos para el objeto Hora
   */
    public void asignarMinutos(int m) {
	  minutos = m;
  }
  /** Coloca los segundos de una hora 
   * @param h - los segundos para el objeto Hora
   */
    public void asignarSegundos(int s) {
	  segundos = s;
  }
  /* Convierte una hora(hr:min:seg) a un numero entero que representa
   * los segundos transcurridos. Cada hora equivale a 3600 segs y cada
   * minuto a 60 segundos.
   */
  private int enSegundos() {
    return horas * 3600 + minutos * 60 + segundos;
  }
  /* Convierte un numero entero, que representa los segundos transcurridos,
   * en un objeto de la clase Hora.
   */
    private Hora enHoras(int n) {
    int hh, ss, mm;

    hh = n / 3600;
    n = n % 3600;
    ss = n % 60;
    mm = n /60; 
    return new Hora(hh, mm, ss);
  }
  /** Suma los minutos especificados al objeto que envia el mensaje. 
   * Si los minutos son negativos se toma su valor absoluto.
   * @param mins - minutos que se sumaran a la Hora.
   * @return Hora- la suma de las horas.
   */
    public void sumar(int mins) {
      int segs = Math.abs(mins * 60);
    int sumaSegs = enSegundos() + segs;
    Hora resultado = enHoras(sumaSegs);
    this.horas = resultado.horas;
    this.minutos = resultado.minutos;
    this.segundos = resultado.segundos;
  }
  /** 
   * Le suma dos horas.
   * @param h - Hora que se sumara a la hora actual.
   * @return Hora - resultado de la suma
  */
    public void sumar(Hora h) {
    int sumaSegs = h.enSegundos() + enSegundos();
    Hora resultado = enHoras(sumaSegs);

    this.horas = resultado.horas;
    this.minutos = resultado.minutos;
    this.segundos = resultado.segundos;
  }
  /** Resta al objeto que envia el mensaje (this) la hora 
   * especificada en el parametro.
   * @param h1 - Hora que se restara.
   * @return Hora- la diferencia de las horas.
   */
    public Hora restar(Hora h) {
    int restaSegs;
    if (comparar(h) < 0)   // Determina cual es mayor
      restaSegs = h.enSegundos() - enSegundos();
    else
      restaSegs = enSegundos() - h.enSegundos();
    return enHoras(restaSegs);
  }
  /**
   * Compara dos horas, devolviendo la relacion de orden entre ellas.
   * @param h - Hora con la que se comparara el objeto que envia el mensaje.
   * @return int - la relacion de orden entre dos horas. >0, <0, =0
   */
  public int comparar(Hora h) {
    return enSegundos() - h.enSegundos();
  }
  /** 
   * Determina si dos horas son iguales 
   * @param h - hora contra la cual se va a comparar
   * @return boolean - true si son iguales y false en otro caso
   */
  public boolean equals (Object h) {
    return (comparar((Hora)h) == 0)? true : false;
  }
  /** 
   * Metodo para convertir una Hora a cadena de caracteres 
   * @return String -- la hora en formato de cadena
   */
  public String toString() {
    return horas + ":" + minutos + ":" + segundos;
  }
}
