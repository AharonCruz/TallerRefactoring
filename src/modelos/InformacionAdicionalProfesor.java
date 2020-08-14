package modelos;

public class InformacionAdicionalProfesor {
    private int aniosdeTrabajo;
    private String facultad;
    private double BonoFijo;
    
    public double calcularSueldo(){
        double sueldo=0;
        sueldo= aniosdeTrabajo*600 + BonoFijo;
        return sueldo;
    }  
}
