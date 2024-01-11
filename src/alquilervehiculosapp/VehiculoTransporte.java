package alquilervehiculosapp;


public abstract class VehiculoTransporte extends Vehiculo implements Alquiler{
    
    private int pasajeros;

    public VehiculoTransporte(int pasajeros, String matricula, int diasAlquiler) {
        super(matricula, diasAlquiler);
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "VehiculoTransporte{"+super.toString() + "pasajeros: " + pasajeros +" ,Precio Alquiler: $" +this.calcularPrecioAlquiler()+ '}';
    } 
}
