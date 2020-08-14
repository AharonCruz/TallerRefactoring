package modelos;

public class InformacionAdicionalProfesor {
    private int aniosdeTrabajo;
    private String facultad;
    private double BonoFijo;
    
    public double calcularSueldo(){
        return aniosdeTrabajo*600 + BonoFijo;
    }  
}
