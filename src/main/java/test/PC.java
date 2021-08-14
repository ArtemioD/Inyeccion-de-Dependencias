package test;

public class PC implements Jugable {
    private String modelo;

    public PC(String modelo) {
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
        System.out.println("jagando en la PC " + modelo);
    }
}
