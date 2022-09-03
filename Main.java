class Main {
  public static void main(String[] args) {
    Ventilador v1 = new Ventilador("Branco");
    Ventilador v2 = new Ventilador(1,"Branco", true);

    System.out.println("Ventilador 1"); v1.verVelocidade(); System.out.println("\n");
    System.out.println("Ventilador 2"); v2.verVelocidade(); System.out.println("\n");

    v1.ligar();
    v2.desligar();

    System.out.println("Ventilador 1"); v1.verVelocidade(); System.out.println("\n");
    System.out.println("Ventilador 2"); v2.verVelocidade(); System.out.println("\n");
  }
}