package test;

public class Consola implements Jugable {
    private String modelo;

    public Consola(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public void jugar() {
        System.out.println("jagando a la consola " + modelo);
    }
}
