
package Coche;

public class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void anadirPuerta() {
        this.numPuertas++;
    }

    public int getNumPuertas() {
        return this.numPuertas;
    }
    public static void main(String[] args) {
    Coche miCoche = new Coche(3);
    miCoche.anadirPuerta();
    System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas.");
}

}

