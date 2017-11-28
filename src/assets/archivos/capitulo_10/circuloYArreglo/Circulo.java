public class Circulo {
  private final double radio;

  public Circulo (double r) {
    if (r <= 0) {
      throw new RuntimeException("El radio debe ser positivo");
    }
    radio = r;
  }

  public static void main(String [] pps) {
    for (int i = -2; i < 3; i++) {
      try {
        System.out.println("Crearé el círculo con radio "+ i);
        Circulo c1 = new Circulo((double)i);
        System.out.println("Circulo creado");
      }catch(RuntimeException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
