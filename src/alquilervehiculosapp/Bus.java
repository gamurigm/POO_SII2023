package alquilervehiculosapp;

/**
 *
 * @author gamur
 */
public class Bus extends VehiculoTransporte{

    public Bus(String matricula, int diasAlquiler,int pasajeros) {
        super(pasajeros, matricula, diasAlquiler);
    } 
    
    @Override
    public double calcularPrecioAlquiler() {
       return Alquiler.razonPrecioBase*super.getDiasAlquiler()+(2*this.getPasajeros());
    }

    @Override
    public String toString() {
        return "Bus{" +super.toString()+ '}' +"\n";
    }
}
