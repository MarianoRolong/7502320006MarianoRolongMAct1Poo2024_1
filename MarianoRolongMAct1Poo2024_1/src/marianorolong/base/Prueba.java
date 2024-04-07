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
public class Prueba {
    //PROPIEDADES
    private int id;
    private int numero; 
    private Date fecha; 
    private String sala; 
    private String descripcion;
    private Fase fase;
    private List <Candidato> candidatos;
 
public Prueba (){

}

    public Prueba(int numero, Date fecha, String sala, String descripcion, Fase fase, Candidato candidatos) {
        this.numero = numero;
        this.fecha = fecha;
        this.sala = sala;
        this.descripcion = descripcion;
        this.fase = fase;
        this.candidatos.add(candidatos);
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }


    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Fase getFase() {
        return fase;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    @Override
    public String toString() {
        return "Prueba{" + " \n Numero: " + numero + ", \n Fecha: " + fecha + ", \n Sala: " + sala + ", \n Descripcion: " + descripcion + '}';
    }

    
    

    

    

}
