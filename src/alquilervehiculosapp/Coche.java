package alquilervehiculosapp;

public class Coche extends VehiculoTransporte {

    public Coche(String matricula, int diasAlquiler,int pasajeros) {
        super(pasajeros, matricula, diasAlquiler);
    }
    
    @Override
    public double calcularPrecioAlquiler() {
       return Alquiler.razonPrecioBase*super.getDiasAlquiler()+(2*super.getPasajeros());
    }

    @Override
    public String toString() {
        return "Coche{" +super.toString()+ '}' +"\n";
    }
}
