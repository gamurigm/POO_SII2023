package alquilervehiculosapp;

public abstract class VehiculoCarga extends Vehiculo implements Alquiler{
    
    private int numeroLlantas;
    private double PMA;

    public VehiculoCarga(String matricula, int diasAlquiler, int numeroLlantas, double PMA) {
        super(matricula, diasAlquiler);
        this.numeroLlantas = numeroLlantas;
        this.PMA = PMA;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public double getPMA() {
        return PMA;
    }

    public void setNumeroLlantas(int numeroLlantas) {
        this.numeroLlantas = numeroLlantas;
    }

    public void setPMA(double PMA) {
        this.PMA = PMA;
    } 

    @Override
    public String toString() {
        return "VehiculoCarga{"+ super.toString() + "numeroLlantas:" + numeroLlantas + ", PMA:" + PMA + " ,Precio Alquiler: $" +this.calcularPrecioAlquiler()+ '}';
    }
   
}
