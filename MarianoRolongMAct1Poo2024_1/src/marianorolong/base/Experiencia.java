/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marianorolong.base;

/**
 *
 * @author maria
 */
public class Experiencia {
    //PROPIEDADES
    private int id;
    private String nombre;
    private String descripcion;
    private int mesesExperiencia;
    private Candidato candidato;
    
    public Experiencia (){
    
}

    public Experiencia(String nombre, String descripcion, int mesesExperiencia, Candidato candidato) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.mesesExperiencia = mesesExperiencia;
        this.candidato = candidato;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getMesesExperiencia() {
        return mesesExperiencia;
    }
    public void setMesesExperiencia(int mesesExperiencia) {
        this.mesesExperiencia = mesesExperiencia;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    @Override
    public String toString() {
        return "Experiencia{" + "\n Nombre: " + nombre + ", \n Descripcion: " + descripcion + ", \n MesesExperiencia: " + mesesExperiencia + '}';
    }

    

    

    
    
}
