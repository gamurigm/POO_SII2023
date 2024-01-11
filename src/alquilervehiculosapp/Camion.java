package alquilervehiculosapp;

public class Camion extends VehiculoCarga{

    public Camion(String matricula, int diasAlquiler, int numeroLlantas, double PMA) {
        super(matricula, diasAlquiler, numeroLlantas, PMA);
    }

     @Override
    public double calcularPrecioAlquiler() {
        return Alquiler.razonPrecioBase*super.getDiasAlquiler()+(this.getPMA()*this.getNumeroLlantas())+40;
    }

    @Override
    public String toString() {
        return "Camion{" +super.toString()+ '}' +"\n";
    }
    
}
