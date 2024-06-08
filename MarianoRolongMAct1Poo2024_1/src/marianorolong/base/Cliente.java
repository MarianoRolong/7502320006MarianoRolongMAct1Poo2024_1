/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marianorolong.base;

import java.util.List;

/**
 *
 * @author maria
 */
public class Cliente {
    //PROPIEDADES
    private int id;
    public String codigoCliente; 
    public String nombre;
    public String direccion; 
    public String telefono;
    public String personaContacto;
    public String tipoDeActividad;
    public List<Casting> castings;
    public Agencia agencia;
    public Persona persona;
    public Casting casting;
    

//CONSTRUCTORES
    public Cliente (){
    
    }

    public Cliente(String codigoCliente, String nombre, String direccion, String telefono, String personaContacto, String tipoDeActividad, Casting castings, Agencia agencia, Persona persona) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaContacto = personaContacto;
        this.tipoDeActividad = tipoDeActividad;
        this.castings.add(castings);
        this.agencia = agencia;
        this.persona = persona;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }
     public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombre() {
        return nombre;
    }
     public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPersonaContacto() {
        return personaContacto;
    }
    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    public String getTipoDeActividad() {
        return tipoDeActividad;
    }
    public void setTipoDeActividad(String tipoDeActividad) {
        this.tipoDeActividad = tipoDeActividad;
    }

    public List<Casting> getCastings() {
        return castings;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public Persona getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "Cliente{" + "\n CodigoCliente: " + codigoCliente + ", \n Nombre: " + nombre + ", \n Direccion: " + direccion + ", \n Telefono: " + telefono + ", \n PersonaContacto: " + personaContacto + ", \n TipoDeActividad: " + tipoDeActividad + '}';
    }

   

   

   

    

    
    
}