public class Coche {
    private int numPuertas;
    
    public Coche() {
        numPuertas = 0;
    }
    
    public void agregarPuerta() {
        numPuertas++;
    }
    
    public int getNumPuertas() {
        return numPuertas;
    }
}

  class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        
        miCoche.agregarPuerta();
        
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puerta(s).");
    }
}