package test;


public class Jugador {
    private String nombre;
    private Jugable dispositivo;

    public Jugador(String nombre, Jugable dispositivo) {
        this.nombre = nombre;
        this.dispositivo = dispositivo;
    }
    
    public void jugar() {
        System.out.print("Soy " + this.nombre + ", y estoy ");
        this.dispositivo.jugar();
    }
}
