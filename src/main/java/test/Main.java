package test;

public class Main {
    public static void main(String[] args) {
        Jugable dispositivo = JugableFactory.create(JugableFactory.tipoJugable.PC);
        Jugador adri = new Jugador("Adri", dispositivo);
        adri.jugar();
        
        Jugable dispositivo2 = JugableFactory.create(JugableFactory.tipoJugable.Consola);
        Jugador marta = new Jugador("Marta", dispositivo2);
        marta.jugar();
    }
}
