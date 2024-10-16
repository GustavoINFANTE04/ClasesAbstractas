public abstract class VehiculoBase implements Vehiculo {

    protected String marca;
    protected String modelo;
    private boolean encendido;

    public VehiculoBase(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = false;
    }


    @Override
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println(marca + " " + modelo + " ha sido encendido.");
        } else {
            System.out.println(marca + " " + modelo + " ya está encendido.");
        }
    }

    @Override
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println(marca + " " + modelo + " ha sido apagado.");
        } else {
            System.out.println(marca + " " + modelo + " ya está apagado.");
        }
    }


    @Override
    public abstract void acelerar(int velocidad);
}
