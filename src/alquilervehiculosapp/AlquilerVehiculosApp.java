package alquilervehiculosapp;

import java.util.ArrayList;

public class AlquilerVehiculosApp {

    public static void main(String[] args) {
        
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        
        Coche co1 = new Coche("XWYZ",60,4);
        co1.calcularPrecioAlquiler();
        listaVehiculos.add(co1); 

        Bus b1 = new Bus("ABC123",30, 20);
        b1.calcularPrecioAlquiler();
        listaVehiculos.add(b1); 

        Trailer t1 = new Trailer("PADQ1253",20, 6, 1500);
        t1.calcularPrecioAlquiler();
        listaVehiculos.add(t1); 

        Camion c1 = new Camion("PABR3354",30, 4, 1000);
        c1.calcularPrecioAlquiler();
        listaVehiculos.add(c1); 


         for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println(vehiculo.toString()); 
        }
    }    
    
}
