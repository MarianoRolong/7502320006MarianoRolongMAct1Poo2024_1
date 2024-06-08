/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marianorolong.base;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author maria
 */
public class Casting {
    //PROPIEDADES
    private int id;
    public String codigoCasting;
    public String nombre; 
    public String descripcion;
    public Date fechaContratacion; 
    public String costo; 
    public String tipo; 
    public String numeroPersonasRequeridas; 
    public Cliente cliente;
    public static HashMap<String, Casting> castingsBD;

    public String getNumeroPersonasRequeridas() {
        return numeroPersonasRequeridas;
    }

    public void setNumeroPersonasRequeridas(String numeroPersonasRequeridas) {
        this.numeroPersonasRequeridas = numeroPersonasRequeridas;
    }

    
    private List<Candidato> candidatos;
//CONSTRUCTORES
    public Casting (){
    
    }

    public Casting(String codigoCasting, String nombre, String descripcion, Date fechaContratacion, String costo, String tipo, String numeroPersonasRequeridas, Cliente cliente, Candidato candidatos) {
        this.codigoCasting = codigoCasting;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaContratacion = fechaContratacion;
        this.costo = costo;
        this.tipo = tipo;
        this.numeroPersonasRequeridas = numeroPersonasRequeridas;
        this.cliente = cliente;
        this.candidatos.add(candidatos);
    }

    public String getCodigoCasting() {
        return codigoCasting;
    }
    public void setCodigoCasting(String codigoCasting) {
        this.codigoCasting = codigoCasting;
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

    public Date getFechaContratacion() {
        return fechaContratacion;
    }
    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

   

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Candidato> getCandidatos() {
        return candidatos;
    }

    @Override
    public String toString() {
        return "Casting{" + "\n CodigoCasting: " + codigoCasting + ", \n Nombre: " + nombre + ", \n Descripcion: " + descripcion + ", \n FechaContratacion: " + fechaContratacion + ", \n Costo: " + costo + ", \n Tipo: " + tipo + '}';
    }

    
    
}
