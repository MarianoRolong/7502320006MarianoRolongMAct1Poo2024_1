/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marianorolong.base;

/**
 *
 * @author maria
 */
public class Persona {
    //PROPIEDADES
    private int id;
    private String nombre;
    private String apellido;
    private String numeroTelefono;
    private String direccion;
    private String identifiacion;
    
public Persona(){
    
}

    public Persona(String nombre, String apellido, String numeroTelefono, String direccion, String identifiacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.identifiacion = identifiacion;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdentifiacion() {
        return identifiacion;
    }
    public void setIdentifiacion(String identifiacion) {
        this.identifiacion = identifiacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "\n Nombre: " + nombre + ", \n Apellido: " + apellido + ", \n NumeroTelefono: " + numeroTelefono + ", Direccion: " + direccion + ", \n Identifiacion: " + identifiacion + '}';
    }

    

    

    
}
