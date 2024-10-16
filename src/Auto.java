
public class Auto extends VehiculoBase {
    private int velocidadActual;

    public Auto(String marca, String modelo) {
        super(marca, modelo);
        this.velocidadActual = 0;
    }

    @Override
    public void acelerar(int velocidad) {
        velocidadActual += velocidad;
        System.out.println("El auto " + marca + " " + modelo + " está acelerando a " + velocidadActual + " km/h.");
    }
}
