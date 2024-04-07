/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marianorolong.base;

import java.util.Date;
import java.util.List;

/**
 *
 * @author maria
 */
public class Fase {
    //PROPIEDADES
    private int id;
    private int numeroIdentificacion; 
    private Date fechaInicio; 
    private List<Prueba> pruebas;
    private CastingPresencial castingPresencial;

 public Fase (){

}

    public Fase(int numeroIdentificacion, Date fechaInicio, Prueba pruebas, CastingPresencial castingPresencial) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaInicio = fechaInicio;
        this.pruebas.add(pruebas);
        this.castingPresencial = castingPresencial;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }
    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public List<Prueba> getPruebas() {
        return pruebas;
    }

    public CastingPresencial getCastingPresencial() {
        return castingPresencial;
    }

    @Override
    public String toString() {
        return "Fase{" + "\n NumeroIdentificacion: " + numeroIdentificacion + ", \n FechaInicio: " + fechaInicio + '}';
    }

    

    
    
}
