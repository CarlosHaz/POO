package ar.org.centro8.curso.java.clase05.entities;

public class Peon {
    private int nroLegajo;
    private String nombre;
    
    public Peon(int nroLegajo, String nombre) {
        this.nroLegajo = nroLegajo;
        this.nombre = nombre;
    }

    public void usar(Auto auto){
        System.out.println(nombre +" usa "+auto);
    }

    @Override
    public String toString() {
        return "Peon [nombre=" + nombre + ", nroLegajo=" + nroLegajo + "]";
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
