package test;


public class JugableFactory {
    public enum tipoJugable {PC, Consola}
    
    public static Jugable create(tipoJugable tipo) {
        Jugable j = null;
        switch(tipo) {
            case PC:
                j = new PC("Windows");
                break;
            case Consola:
                j = new Consola("PS4");
        }
        return j;
    }
}
