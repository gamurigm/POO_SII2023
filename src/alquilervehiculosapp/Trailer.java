package alquilervehiculosapp;

public class Trailer extends VehiculoCarga{

    public Trailer(String matricula, int diasAlquiler, int numeroLlantas, double PMA) {
        super(matricula, diasAlquiler, numeroLlantas, PMA);
    }

     @Override
    public double calcularPrecioAlquiler() {
        return Alquiler.razonPrecioBase*super.getDiasAlquiler()+(this.getPMA()*this.getNumeroLlantas());
    }

    @Override
    public String toString() {
        return "Trailer{" +super.toString()+ '}' +"\n";
    }

}
