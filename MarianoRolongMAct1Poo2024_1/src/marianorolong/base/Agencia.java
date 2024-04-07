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
public class Agencia {
    //PROPIEDADES
 private int id;
 private String nombre;
 private List<Cliente>clientes;
 


    //CONSTRUCTORES
    public Agencia (){
    
    }

    public Agencia(String nombre, Cliente clientes) {
        this.nombre = nombre;
        this.clientes.add(clientes);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public List<Cliente> getClientes() {
        return this.clientes;
    }

    @Override
    public String toString() {
        return "Agencia{" + "\n Nombre:" + nombre + '}';
    }

 

}