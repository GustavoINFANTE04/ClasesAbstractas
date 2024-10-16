public class Moto extends VehiculoBase {
    private int velocidadActual;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
        this.velocidadActual = 0;
    }

    @Override
    public void acelerar(int velocidad) {
        velocidadActual += velocidad;
        System.out.println("La moto " + marca + " " + modelo + " está acelerando a " + velocidadActual + " km/h.");
    }
}
